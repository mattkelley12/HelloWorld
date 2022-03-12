package Services;

import DAO.EvolutionDAO;
import Pokemon.Evolution;

import java.util.HashMap;

public class EvolutionService {

    private HashMap<Integer, Evolution> evolutionHashMap;

    public EvolutionService(String fileName){
        this.evolutionHashMap = EvolutionDAO.evolutionInitialize(fileName);
    }

    public Evolution getEvolution(int pokemonNumber){
       return evolutionHashMap.get(pokemonNumber);
    }

}
