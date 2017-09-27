package cn.zhoubin.arrays.easy;

/**
 * Created by Administrator on 2017/7/18.
 */
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {

        if (nums == null) return nums;
        int length = nums.length;
        int width = nums[0].length;
        if (length * width != r * c)
            return nums;

        int [][] newNums = new int [r][c];
        int rr = 0,cc = 0;
        for (int i = 0;i<length;i++)
            for (int j = 0;j<width;j++){
                newNums[rr][cc] = nums[i][j];
                if (++cc == c){
                    cc = 0;
                    rr += 1;
                }
            }

        return newNums;
    }

    public static void main(String[] args) {

    }
}
