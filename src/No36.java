import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class No36 {

    private boolean isValidSudoku(char[][] board) {
        //return checkRows(board) && checkCols(board) && checkGrids(board);
        System.out.println(checkRows(board));
        System.out.println(checkCols(board));
        System.out.println(checkGrids(board));
        return true;
    }

    private boolean checkRows(char[][] board){
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> row = new HashSet<>();
            for (int j = 0; j < board[i].length; j++)
                if (board[i][j] != '.') {
                    if (row.contains(board[i][j]))
                        return false;
                    else
                        row.add(board[i][j]);
                }
        }
        return true;
    }

    private boolean checkCols(char[][] board){
        for (int j = 0; j < board[0].length; j++){
            HashSet<Character> col = new HashSet<>();
            for (int i = 0; i < board.length; i++)
                if (board[i][j] != '.'){
                    if (col.contains(board[i][j]))
                        return false;
                    else
                        col.add(board[i][j]);
                }
        }
        return true;
    }

    private boolean checkGrids(char[][] board){
        for (int gi = 2; gi < board.length; gi+=3)
            for (int gj = 2; gj < board[0].length; gj+=3) {
                HashSet<Character> grid = new HashSet<>();
                for (int i = gi-2; i <= gi; i++) {
                    for (int j = gj-2; j <= gj; j++)
                        if (board[i][j] != '.') {
                            if (grid.contains(board[i][j]))
                                return false;
                            else
                                grid.add(board[i][j]);
                        }
                }
            }
        return true;
    }

    public static void main(String[] args){
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
                          {'6','.','.','1','9','5','.','.','.'},
                          {'.','9','8','.','.','.','.','6','.'},
                          {'8','.','.','.','6','.','.','.','3'},
                          {'4','.','.','8','.','3','.','.','1'},
                          {'7','.','.','.','2','.','.','.','6'},
                          {'.','6','.','.','.','.','2','8','.'},
                          {'.','.','.','4','1','9','.','.','5'},
                          {'.','.','.','.','8','.','.','7','9'}
                        };
        //System.out.print(new No36().isValidSudoku(board));
        new No36().isValidSudoku(board);
    }
}


