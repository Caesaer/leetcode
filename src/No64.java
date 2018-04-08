public class No64 {
    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[i].length; j++){
                if (i == 0 && j == 0)
                    continue;
                if (i == 0)
                    grid[0][j] += grid[0][j-1];
                else if (j == 0)
                    grid[i][0] += grid[i-1][0];
                else
                    grid[i][j] += Math.min(grid[i][j-1], grid[i-1][j]);
            }
        return grid[grid.length - 1][grid[0].length - 1];
    }

    public static void main(String[] args){
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(new No64().minPathSum(grid));
    }
}
