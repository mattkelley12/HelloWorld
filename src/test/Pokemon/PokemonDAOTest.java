package Pokemon;

import DAO.csvDAO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PokemonDAOTest {

    @Test
    void setInputStreamReader_validFile_returnsList(){
        // GIVEN
        String validFile = "pokemonComplete.csv";

        // WHEN
        // THEN
        assertDoesNotThrow(() -> new csvDAO(validFile),"File not found!");
    }

    @Test
    void setInputStreamReader_invalidFile_throwsIOException(){
        // GIVEN
        String validFile = "doesNotExist.csv";

        // WHEN
        // THEN
        assertThrows(IllegalArgumentException.class,() -> new csvDAO(validFile));


    }

    @Test
    void setInputStreamReader_nullFile_throwsIOException(){
        // GIVEN
        String validFile = null;

        // WHEN
        // THEN
        assertThrows(NullPointerException.class,() -> new csvDAO(validFile));


    }

}
