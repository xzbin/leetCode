package cn.zhoubin.arrays.easy;

/**
 * Created by Administrator on 2017/7/9.
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (0+n)*(n+1)/2;
        for (int i = 0;i < n;i++)
            sum -= nums[i];
        return sum;
    }


    public static void main(String [] args){

    }
}
