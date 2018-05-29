public class No59 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        char flag = 'r';
        int i = 0, j = 0;

        for (int num = 1; num <= n*n; num++){
            switch (flag){
                case 'r': matrix[i][j++] = num;
                          if (j > n-1 || matrix[i][j] != 0){
                              j--;
                              i++;
                              flag = 'd';
                          }
                          break;
                case 'd': matrix[i++][j] = num;
                          if (i > n-1 || matrix[i][j] != 0){
                              i--;
                              j--;
                              flag = 'l';
                          }
                          break;
                case 'l': matrix[i][j--] = num;
                          if (j < 0 || matrix[i][j] != 0){
                              j++;
                              i--;
                              flag = 'u';
                          }
                          break;
                case 'u': matrix[i--][j] = num;
                          if (i < 0 || matrix[i][j] != 0){
                              i++;
                              j++;
                              flag = 'r';
                          }
            }
        }
        return matrix;
    }

    public static void main(String[] args){
        int n = 3;
        int[][] matrix = new No59().generateMatrix(4);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }
    }
}
