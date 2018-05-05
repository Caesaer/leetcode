import java.util.ArrayList;
import java.util.List;

public class No54 {
    private List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new ArrayList<>();
        if (matrix == null || matrix.length == 0)
            return ret;

        int i = 0, j = 0, counter = 1;
        int maxrow = matrix.length - 1;
        int maxcol = matrix[0].length - 1;
        boolean[][] seen = new boolean[maxrow+1][maxcol+1];
        char c = 'r';

        seen[0][0] = true;
        ret.add(matrix[0][0]);
        while (counter < (maxrow+1)*(maxcol+1)){
            if (c == 'r'){
                while(j+1 <= maxcol && !seen[i][j+1]){
                    j++;
                    counter ++;
                    ret.add(matrix[i][j]);
                    seen[i][j] = true;
                }
                c = 'd';
            }
            else if (c =='d'){
                while (i+1 <= maxrow && !seen[i+1][j]){
                    i++;
                    counter ++;
                    ret.add(matrix[i][j]);
                    seen[i][j] = true;
                }
                c = 'l';
            }
            else if (c == 'l'){
                while (j-1 >= 0 && !seen[i][j-1]){
                    j--;
                    counter ++;
                    ret.add(matrix[i][j]);
                    seen[i][j] = true;
                }
                c = 'u';
            }
            else{
                while (i-1 >=0 && !seen[i-1][j]){
                    i--;
                    counter ++;
                    ret.add(matrix[i][j]);
                    seen[i][j] = true;
                }
                c = 'r';
            }
        }

        return ret;
    }

    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> list = new No54().spiralOrder(matrix);
        System.out.print(list.toString());
    }
}
