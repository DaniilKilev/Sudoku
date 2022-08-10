import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Board {

    private char[][] board;

    public void setBoard(String fileName){
        ObjectMapper mapper = new ObjectMapper();
        try {
            board = mapper.readValue(new File("board.json"), new TypeReference<char[][]>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public char[][] getBoard(){
        return board;
    }
}
