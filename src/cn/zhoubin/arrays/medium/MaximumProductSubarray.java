package cn.zhoubin.arrays.medium;

/**
 * Created by Administrator on 2017/7/22.
 */

// 思路很简单，但是写程序的时候有些细节问题，没有处理清楚
// 18, 22
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;
        int result = nums[0];
        int maxSum = nums[0];
        int minSum = nums[0];
        for (int i = 1;i < nums.length; i++){
            int temp = maxSum;
            maxSum = Math.max(Math.max(maxSum * nums[i],minSum * nums[i]),nums[i]);
            minSum = Math.min(Math.min(temp * nums[i],minSum * nums[i]),nums[i]);
            if (maxSum > result)
                result = maxSum;
        }
        return result;
    }
}
