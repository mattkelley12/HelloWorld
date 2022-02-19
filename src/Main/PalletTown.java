package Main;

import Pokemon.PokemonBase;
import Services.PokemonService;

public class PalletTown {

    public static void main(String[] args) {



        PokemonService pokemonService = new PokemonService();

        PokemonBase squirtle = pokemonService.getPokemon("Squirtle");






    }

}
