package cn.zhoubin.arrays.easy;

/**
 * Created by Administrator on 2017/7/21.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        if (nums == null || nums.length ==0) return 0;
        int maxSum = nums[0],sum = nums[0];
        for (int i = 1;i < nums.length ;i++){
            if (sum  <= 0){
                sum = nums[i];
            }else{
                sum += nums[i];
            }
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
