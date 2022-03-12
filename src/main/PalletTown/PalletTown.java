package PalletTown;

import Pokemon.Pokemon;
import Services.EvolutionService;
import Services.MoveService;
import Services.PokemonService;

public class PalletTown {

    public static void main(String[] args) {
        PokemonService pokedex = new PokemonService();
        EvolutionService evoService = new EvolutionService("gen1Evolutions.csv");
        MoveService moveService = new MoveService("moves.csv");

        System.out.println(evoService.getEvolution(133));

    }

}

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
