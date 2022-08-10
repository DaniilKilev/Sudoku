import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Solution {
    private boolean isValid = true;

    public boolean isValidSudoku(char[][] board){
        for(int i=0; i < board.length; i++){
            for (int j=0; j < board.length; j++){
                if(board[i][j] != '.'){
                    for(int row = i+1;row<board.length;row++){
                        if(board[i][j] == board[row][j]){
                            isValid = false;
                            break;
                        }
                    }
                    for (int col=j+1;col<board.length;col++){
                        if(board[i][j] == board[i][col]){
                            isValid = false;
                            break;
                        }
                    }
                }
            }
        }
        return isValid;
    }
}
