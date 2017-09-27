package cn.zhoubin.arrays.easy;

/**
 * Created by Administrator on 2017/7/21.
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLength = 0, length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                length ++;
                if (length > maxLength)
                    maxLength = length;
            }else{
                length = 0;
            }
        }
        return maxLength;
    }
}
