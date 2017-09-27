package cn.zhoubin.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/7/18.
 */

//comparable comparable的对比
// Arrays 升序
public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int [] originNums = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int start = 0,end = nums.length - 1;
        while(start < nums.length)
            if (nums[start] == originNums[start])
                start++;
            else
                break;
        while (end >= 0)
            if (nums[end] == originNums[end])
                end--;
            else
                break;

            return end < start ? 0:end - start + 1;
    }

    public static void main(String[] args) {

//        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        int [] nums = {1,2,3,4};
        int re = new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(nums);
        System.out.println(re);
    }
}
