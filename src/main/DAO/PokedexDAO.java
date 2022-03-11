package DAO;

import Exceptions.PokedexFileNotFoundException;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokedexDAO {

    // Instance variables
    InputStream is = this.getFileAsIOStream("pokemonComplete.csv");
    InputStreamReader isr = new InputStreamReader(is);


    public List<List<String>> readPokedexFile() {
        // Initialize list
        List<List<String>> pokedex = new ArrayList<>();

        // Read CSV line by line
        try (BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                pokedex.add(Arrays.asList(values));
            }
        }
        // Handle FileNotFoundException
        catch (IOException e){
            throw new PokedexFileNotFoundException("Unable to find pokedex.csv file!");
        }
        return pokedex;
    }

    private InputStream getFileAsIOStream(final String fileName)
    {
        InputStream ioStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream(fileName);

        if (ioStream == null) {
            throw new IllegalArgumentException(fileName + " is not found");
        }

        return ioStream;
    }

}
