public class No62 {
    public int uniquePaths(int m, int n) {
        int[][] grids = new int[n][m];

        for (int i = 0; i < grids.length; i++)
            for (int j = 0; j < grids[i].length; j++) {
            if (i == 0 || j == 0) {
                grids[i][j] = 1;
                continue;
            }
            grids[i][j] = grids[i - 1][j] + grids[i][j - 1];
            }

        return grids[grids.length-1][grids[0].length-1];
    }

    public static void main(String[] args){
        System.out.println(new No62().uniquePaths(100,100));
    }
}
