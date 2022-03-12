package Services;

import DAO.PokemonDAO;
import Pokemon.PokemonBase;

import java.util.HashMap;

public class PokemonService {
    private HashMap<String, PokemonBase> pokedex;

    public PokemonService(String fileName){
        this.pokedex = PokemonDAO.pokedexInitialize(fileName);
    }
}
