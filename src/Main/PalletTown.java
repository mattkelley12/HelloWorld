package Main;

import Pokemon.Pokemon;
import Services.PokemonService;

import java.util.ArrayList;
import java.util.List;

public class PalletTown {

    public static void main(String[] args) {
        PokemonService pokedex2 = new PokemonService();

        Pokemon penis1 = new Pokemon(pokedex2.getPokemon("Charmander"),16);
        Pokemon penis2 = new Pokemon(pokedex2.getPokemon("Charmander"),16);

        // Print charmanders
        Pokemon currentMon = null;
        long counter = 0;
        while (currentMon != null && !currentMon.isShiny()){
            counter++;
            currentMon = new Pokemon(pokedex2.getPokemon("Charmander"),16);
        }

        System.out.println("Success!!!! Counter = " + counter);
        System.out.println(currentMon.toString());


    }

}
