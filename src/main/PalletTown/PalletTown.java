package PalletTown;

import DAO.EvolutionDAO;
import DAO.MoveDAO;
import DAO.PokemonDAO;
import Pokemon.Pokemon;
import Services.EvolutionService;
import Services.MoveService;
import Services.PokemonService;
import Pokemon.PokemonMoveSet;

public class PalletTown {

    public static void main(String[] args) {
        PokemonService pokedex = new PokemonService();

//        Pokemon charmander = pokedex.getPokemon("Charmander",15);
//        Pokemon bulbasaur = pokedex.getPokemon("Bulbasaur",15);
//
//        System.out.println(charmander.toString());
//        charmander.levelUp(1);
//        System.out.println(charmander.toString());
//        charmander.levelUp(20);
//        System.out.println(charmander.toString());
//
//        System.out.println(bulbasaur.toString());
//        bulbasaur.levelUp(1);
//        System.out.println(bulbasaur.toString());

        PokemonMoveSet test = pokedex.getMoveMapping().get(1);
        System.out.println(test.movesByLevelUp());
        System.out.println(test.movesByTeach());


    }

}

//        System.out.println(evoService.getEvolution(1));
//System.out.println(moveService.getMove("Hyper Beam"));


//        Pokemon penis1 = new Pokemon(pokedex.getPokemon("Charmander"),16);
//        Pokemon penis2 = new Pokemon(pokedex.getPokemon("Charmander"),16);
//
//        // Print charmanders
//        Pokemon currentMon = null;
//        long counter = 0;
//        while (currentMon == null || !currentMon.isShiny()){
//            counter++;
//            currentMon = new Pokemon(pokedex.getPokemon("Charmander"),16);
//        }
//
//        System.out.println("Success!!!! Counter = " + counter);
//        System.out.println(currentMon.toString());
