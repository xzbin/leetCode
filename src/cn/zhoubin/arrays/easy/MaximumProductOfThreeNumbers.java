package cn.zhoubin.arrays.easy;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

/**
 * Created by Administrator on 2017/7/19.
 */
public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {

        Integer firstMax = null, secondMax = null, thirdMax = null;
        Integer firstMin = null, secondMin = null;

        for (int num : nums) {
            if (firstMax == null || num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }

            if (firstMin == null || num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (secondMin == null || num < secondMin)
                secondMin = num;
        }
        int re1 = firstMax * secondMax * thirdMax;
        int re2 = firstMax * secondMin * firstMin;
        return re1 > re2 ? re1 : re2;
    }

    public static void main(String[] args) {
        int [] nums = {-4,-3,-2,-1,60};
        int re = new MaximumProductOfThreeNumbers().maximumProduct(nums);
        System.out.println(re);
    }
}
