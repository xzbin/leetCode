package cn.zhoubin.midium;

/**
 * Created by Administrator on 2017/2/25.
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        if (matrix == null) return;
        int n = matrix.length;
        int [] [] nums = new  int [n][n];
        for (int colmn = 0; colmn< n; colmn++)
            for (int  row= 0;row<n;row++){
                nums[row][n - 1- colmn] = matrix[colmn][row];
            }
        matrix = nums;
    }
}
