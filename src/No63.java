public class No63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = (obstacleGrid[0][0] == 1)? 0 : 1;

        for (int i = 0; i < dp.length; i++)
            for (int j = 0; j < dp[i].length; j++){
                if (obstacleGrid[i][j] == 1)
                    dp[i][j] = 0;
                else if (i ==0 && j == 0)
                    continue;
                else if (i == 0)
                    dp[i][j] = dp[i][j-1];
                else if (j == 0)
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }

        return dp[m-1][n-1];
    }

    public static void main(String[] args){
        int[][] grids = {{1,0}};
        System.out.println(new No63().uniquePathsWithObstacles(grids));
    }
}
