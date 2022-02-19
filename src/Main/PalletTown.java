package Main;

import Pokemon.Pokemon;
import Pokemon.PokemonBase;
import Services.PokemonService;

public class PalletTown {

    public static void main(String[] args) {
        PokemonService pokedex = new PokemonService();
        Pokemon dick1 = new Pokemon(pokedex.getPokemon("Charmander"),16);
        Pokemon dick2 = new Pokemon(pokedex.getPokemon("Charmander"),16);
        System.out.println(dick1);
        System.out.println(dick2);








    }

}
