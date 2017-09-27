package cn.zhoubin.arrays.medium;

/**
 * Created by Administrator on 2017/7/22.
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {

        int right = 0, left = 0;
        for (int i = 0; i < nums.length; i++) {
            right = left = 0;
            if (i == 0 || nums[i - 1] < nums[i]) left = 1;
            if (i == nums.length - 1 || nums[i + 1] < nums[i]) right = 1;
            if (right == 1 && left == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
