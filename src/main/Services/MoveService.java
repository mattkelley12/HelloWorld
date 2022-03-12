package Services;

import DAO.MoveDAO;
import Pokemon.Move;

import java.util.HashMap;

public class MoveService {

    private HashMap<String, Move> moveHashMap;

    public MoveService(String fileName){
        this.moveHashMap = MoveDAO.moveInitialize(fileName);
    }

}
