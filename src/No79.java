public class No79 {

    public boolean exist(char[][] board, String word) {
        boolean[][] used = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                if (board[i][j] == word.charAt(0)) {
                    used[i][j] = true;
                    if (findNext(board, i, j, used,word,1))
                        return true;
                    used[i][j] = false;
                }

        return false;
    }

    private boolean findNext(char[][] board, int i, int j, boolean[][] used, String word, int pos){
        if (pos >= word.length())
            return true;

        if (i > 0 && !used[i-1][j]) {
            used[i-1][j] = true;
            if (word.charAt(pos) == board[i-1][j] && findNext(board,i-1,j,used,word,pos+1))
                return true;
            used[i-1][j] = false;
        }

        if (i < board.length - 1 && !used[i+1][j]){
            used[i+1][j] = true;
            if (word.charAt(pos) == board[i+1][j] && findNext(board,i+1,j,used,word,pos+1))
                return true;
            used[i+1][j] = false;
        }

        if (j > 0 && !used[i][j-1]){
            used[i][j-1] = true;
            if (word.charAt(pos) == board[i][j-1] && findNext(board,i,j-1,used,word,pos+1))
                return true;
            used[i][j-1] = false;
        }

        if (j < board[i].length - 1 && !used[i][j+1]){
            used[i][j+1] = true;
            if (word.charAt(pos) == board[i][j+1] && findNext(board,i,j+1,used,word,pos+1))
                return true;
            used[i][j+1] = false;
        }

        return false;
    }

    public static void main(String[] args){
        char[][] board = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        String word = "AAB";
        boolean ret = new No79().exist(board, word);
        System.out.println(ret);
    }
}
