package cn.zhoubin.arrays.medium;

/**
 * Created by Administrator on 2017/7/22.
 */
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int index = new FindMinimumInRotatedSortedArray().findMin(nums);
        System.out.println(index);
    }
}
