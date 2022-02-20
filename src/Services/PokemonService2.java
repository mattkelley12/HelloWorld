package Services;
import Pokemon.PokemonBase;

import java.util.HashMap;
import java.util.List;

public class PokemonService2 {
    // Instance variables
    private HashMap<String, PokemonBase> pokedex;

    // Constructor
    public PokemonService2(){
        pokedexInitialize(new PokedexDAO().readPokedexFile());
    }

    // Initialize pokedex
    private void pokedexInitialize(List<List<String>> pokedexArray){
        // Initialize HashMap/Dictionary
        HashMap<String, PokemonBase> pokedex = new HashMap<String, PokemonBase>();

        // Parse array into HashMap of PokemonObjects
        List<String> currentPokemon;
        PokemonBase currentPokemonObjBase;
        for (int i = 1; i < pokedexArray.size(); i++) {
            currentPokemon = pokedexArray.get(i);
            // Create pokemon object
            currentPokemonObjBase = new PokemonBase(
                    Integer.parseInt(currentPokemon.get(0)), // pokedexNumber
                    currentPokemon.get(1),
                    currentPokemon.get(2),
                    currentPokemon.get(3),
                    Integer.parseInt(currentPokemon.get(4)),
                    Integer.parseInt(currentPokemon.get(5)),
                    Integer.parseInt(currentPokemon.get(6)),
                    Integer.parseInt(currentPokemon.get(7)),
                    Integer.parseInt(currentPokemon.get(8)),
                    Integer.parseInt(currentPokemon.get(9)),
                    Integer.parseInt(currentPokemon.get(10)),
                    Integer.parseInt(currentPokemon.get(11)),
                    Boolean.parseBoolean(currentPokemon.get(12)));
            // Add to dictionary
            pokedex.put(currentPokemon.get(1), currentPokemonObjBase);
        }
        this.pokedex = pokedex;
    }

    // Pokedex getter
    public PokemonBase getPokemon(String pokemonName){
        return pokedex.get(pokemonName);
    }

}
