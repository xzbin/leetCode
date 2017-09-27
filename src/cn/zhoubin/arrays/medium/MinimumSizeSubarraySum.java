package cn.zhoubin.arrays.medium;

/**
 * Created by Administrator on 2017/7/22.
 */
// 没有考虑 数组为空的情况
//  以及数组中的数据之和 达不到 s的情况
public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int s, int[] nums) {
        if (nums== null || nums.length == 0) return 0;
        int sum = 0, j = 0, i = 0, min = Integer.MAX_VALUE;
        while (j < nums.length) {
            sum += nums[j++];
            while (sum >= s) {
                min = Math.min(min, j - i );
                sum -= nums[i++];
            }
        }
        return min == Integer.MAX_VALUE ? 0: min;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int s = 7;
        int re = MinimumSizeSubarraySum.minSubArrayLen(s, nums);
        System.out.println(re);
    }
}
