package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/4/19.
 */
public class IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int sumPerimeter = 0;
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                if (grid[row][col] == 1)
                    sumPerimeter += countPerimeterFromGrid(grid, row, col);
            }
        }
        return sumPerimeter;
    }

    private static int countPerimeterFromGrid(int[][] grid, int row, int col) {
        int counts = 0;
        if (row == 0 || grid[row - 1][col] == 0) counts += 1;
        if (row == grid.length - 1 || grid[row + 1][col] == 0) counts += 1;
        if (col == 0 || grid[row][col - 1] == 0) counts += 1;
        if (col == grid[0].length - 1 || grid[row][col + 1] == 0) counts += 1;
        return counts;
    }

    public static void main(String[] args) {
        int [][] nums = {{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}};
        int num = IslandPerimeter.islandPerimeter(nums);
        System.out.println(num);
    }
}
