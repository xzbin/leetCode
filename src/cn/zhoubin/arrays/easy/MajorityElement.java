package cn.zhoubin.arrays.easy;

/**
 * Created by Administrator on 2017/7/9.
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {

        int major = nums[0], count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == major)
                count++;
            else {
                count--;
                if (count == 0) {
                    major = nums[i];
                    count = 1;
                }

            }

        }
        return major;
    }

    public static void main(String[] args) {
        int[] nums = {3};
        int result = MajorityElement.majorityElement(nums);
        System.out.println(result);
    }
}
