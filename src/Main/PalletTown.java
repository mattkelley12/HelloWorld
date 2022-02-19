package Main;

import Pokemon.Pokemon;
import Pokemon.PokemonBase;
import Services.PokemonService;

public class PalletTown {

    public static void main(String[] args) {
        PokemonService pokedex = new PokemonService();
        Pokemon dick = new Pokemon(pokedex.getPokemon("Charmander"),12);
        System.out.println("Test");








    }

}
