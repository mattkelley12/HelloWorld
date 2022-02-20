package Services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokedexDAO2 {

    // Instance variables
    private File pokedexFile = new File("src/Storage/pokemonComplete.csv");

    public List<List<String>> readPokedexFile() {
        // Initialize list
        List<List<String>> pokedex = new ArrayList<>();

        // Read CSV line by line
        try (BufferedReader br = new BufferedReader(new FileReader(pokedexFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                pokedex.add(Arrays.asList(values));
            }
        }
        // Handle FileNotFoundException
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return pokedex;
    }

}
