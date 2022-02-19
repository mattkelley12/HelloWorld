package Main;

import Pokemon.Pokemon;
import Pokemon.PokemonType;
import Services.PokedexDAO;
import Services.PokemonService;

import java.io.File;
import java.util.List;

public class PalletTown {

    public static void main(String[] args) {

//        Pokemon charmander = new Pokemon("004", "Charmander","2'00\"", 18.7, PokemonType.Fire );
//        System.out.println(charmander.name);
//
//        Pokemon bulbasaur = new Pokemon("001", "Bulbasaur","2'04\"", 15.2, PokemonType.Grass );
//        System.out.println(bulbasaur.pokedexNumber);
//
//        Pokemon squirtle = new Pokemon("007", "Squirtle","1'08\"", 19.8, PokemonType.Water );
//
//        System.out.println(squirtle);
//        System.out.printf("Hi my name is %s and my Pokedex number is #%s and my type is %s%n",
//                charmander.name, charmander.pokedexNumber, charmander.getType());
//
//        System.out.println(squirtle);

        PokemonService pokemonService = new PokemonService();

        Pokemon squirtle = pokemonService.getPokemon("Squirtle");

        System.out.println("My attack should be : " + squirtle.attack);

        squirtle.attack = 10000;

        Pokemon squirtle2 = pokemonService.getPokemon("Squirtle");

        System.out.println("New Squirtle attack is: " + squirtle2.attack);




    }

}
