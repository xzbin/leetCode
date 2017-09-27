package cn.zhoubin.arrays.easy;

/**
 * Created by Administrator on 2017/7/9.
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {

        int i = 0;
        for (int j = 0; j < nums.length; j++)
            if (nums[j] != 0)
                nums[i++] = nums[j];
        for (; i < nums.length; i++)
            nums[i] = 0;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeroes.moveZeroes(nums);
        for (int num : nums)
            System.out.println(num);
    }
}
