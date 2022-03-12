package Services;

import DAO.PokemonDAO;
import Pokemon.Evolution;
import Pokemon.Pokemon;
import Pokemon.PokemonBase;

import java.util.HashMap;

public class PokemonService {
    private HashMap<String, PokemonBase> pokedex;
    private HashMap<Integer,PokemonBase> pokedexByNumber;
    private EvolutionService evolutionService;
    private MoveService moveService;

    public PokemonService(){
        this.pokedex = PokemonDAO.pokedexInitialize("pokemonComplete.csv");
        this.pokedexByNumber = PokemonDAO.pokedexByNumber(pokedex);
        this.evolutionService = new EvolutionService("gen1Evolutions.csv");
        this.moveService = new MoveService("moves.csv");

    }

    public HashMap<String, PokemonBase> getPokedex() {
        return pokedex;
    }

    public HashMap<Integer, PokemonBase> getPokedexByNumber() {
        return pokedexByNumber;
    }

    public PokemonBase getPokemonBase(String name){
        return pokedex.get(name);
    }

    public Pokemon getPokemon(String name, int level){
        return new Pokemon(pokedex.get(name),level,evolutionService, this);
    }

}
