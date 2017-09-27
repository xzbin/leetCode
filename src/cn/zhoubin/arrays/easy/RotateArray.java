package cn.zhoubin.arrays.easy;

/**
 * Created by Administrator on 2017/7/9.
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        rotateSubArray(nums, 0, nums.length - k - 1);
        rotateSubArray(nums, nums.length - k, nums.length - 1);
        rotateSubArray(nums, 0, nums.length - 1);
    }

    public void rotateSubArray(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
