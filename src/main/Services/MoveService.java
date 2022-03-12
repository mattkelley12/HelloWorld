package Services;

import DAO.csvDAO;
import Pokemon.Evolution;
import Pokemon.Move;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoveService {
    // Instance variables
    private HashMap<String, Move> moveHashMap;

    // Constructor
    public MoveService(String fileName){
        moveInitialize(new csvDAO(fileName).readPokedexFile());
    }

    // Initialize pokedex
    private void moveInitialize(List<List<String>> evolutionArray){
        // Initialize HashMap/Dictionary
        moveHashMap = new HashMap<>();

        // Parse array into HashMap of PokemonObjects
        List<String> currentMoveString;
        Move currentMove;
        for (int i = 1; i < evolutionArray.size(); i++) {
            currentMoveString = evolutionArray.get(i);

            String name = currentMoveString.get(0);
            System.out.println(name);
            String type = currentMoveString.get(1);
            String category = currentMoveString.get(2);
            String effect = currentMoveString.get(3);
            // Power parse
            Integer power;
            if (currentMoveString.get(4).equals("-")) {
                power = null;
            }
            else {
                power = Integer.parseInt(currentMoveString.get(4));
            }

            // Parse accuracy
            Integer accuracy;
            if (currentMoveString.get(5).equals("inf")){
                accuracy = -1;
            }
            else if (currentMoveString.get(5).equals("-")){
                accuracy = null;
            }
            else {
                accuracy = Integer.parseInt(currentMoveString.get(5));
            }

            // Parse PP
            Integer PP;
            if (currentMoveString.get(6).equals("-")){
               PP = null;
            }
            else {
                PP = Integer.parseInt(currentMoveString.get(6));
            }
            // Parse TM
            String TM;
            if (currentMoveString.get(7).equals("")){
                TM = null;
            }
            else {
                TM = currentMoveString.get(7);
            }
            // Parse Probability
            Integer probability;
            // Z move (Gen 7)
            if (currentMoveString.get(8).equals("")){
                probability = null;
            }
            // Not a consideration for the move
            else if (currentMoveString.get(8).equals("-")){
                probability = -1;
            }
            // Regular move
            else {
                probability = Integer.parseInt(currentMoveString.get(8));
            }
            int gen = Integer.parseInt(currentMoveString.get(9));

            // Create pokemon object
            currentMove = new Move(
                    name, type, category, power, accuracy, PP,
            effect, probability, TM, gen
            );

            // Add to dictionary
            moveHashMap.put(name, currentMove);
        }
    }

    // Pokedex getter
    public Move getMove(String move){
        return moveHashMap.get(move);
    }
}