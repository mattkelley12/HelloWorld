package Services;

import DAO.csvDAO;
import Pokemon.Evolution;
import Pokemon.PokemonBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvolutionService {
    // Instance variables
    private HashMap<Integer, Evolution> evolutionHashMap;

    // Constructor
    public EvolutionService(String fileName){
        evolutionInitialize(new csvDAO(fileName).readPokedexFile());
    }

    // Initialize pokedex
    private void evolutionInitialize(List<List<String>> evolutionArray){
        // Initialize HashMap/Dictionary
        evolutionHashMap = new HashMap<>();

        // Parse array into HashMap of PokemonObjects
        List<String> currentEvolutionString;
        Evolution currentEvolution;
        boolean isTrade;
        Map<String,Integer> stone;
        for (int i = 1; i < evolutionArray.size(); i++) {
            currentEvolutionString = evolutionArray.get(i);
            isTrade = false;
            stone = new HashMap<>();
            int currentPokemon = Integer.parseInt(currentEvolutionString.get(0));
            int currentEvoInt = Integer.parseInt(currentEvolutionString.get(1));
            int evoLevel;
            try{
                evoLevel =  Integer.parseInt(currentEvolutionString.get(2));
            }
            catch (NumberFormatException e){
                evoLevel = 0;
            }
            String currentStone = currentEvolutionString.get(3);

            // Check if pokemon already in map
            if (evolutionHashMap.containsKey(currentPokemon)){
                evolutionHashMap.get(currentPokemon).getStone().put(currentStone,currentEvoInt);
                continue;
            }

            // Trade
            if (currentEvolutionString.get(4) == "yes"){
                isTrade = true;
            }
            // Stone
            if (currentEvolutionString.get(3) != ""){
                stone.put(currentStone,currentEvoInt);
            }

            // Create pokemon object
            currentEvolution = new Evolution(
                    currentEvoInt,
                    evoLevel,
                    isTrade,
                    stone
            );

            // Add to dictionary
            evolutionHashMap.put(currentPokemon, currentEvolution);
        }
    }

    // Pokedex getter
    public Evolution getEvolution(int pokemonNumber){
        return evolutionHashMap.get(pokemonNumber);
    }
}
