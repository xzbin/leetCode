package cn.zhoubin.arrays.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/7/22.
 */
public class ArrayNesting {
    public int arrayNesting(int[] nums) {

        int count = 0;
        int maxCount = 0;
        Set<Integer> indexUsed = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int index = i;
            while (!indexUsed.contains(i)) {
                indexUsed.add(i);
                count++;
                index = nums[i];
            }
            maxCount = Math.max(count,maxCount);
            indexUsed.clear();
        }

        return maxCount;
    }

    private int reverseNums(int[] nums, int index) {


        int count = 0;
        if (nums[index] >= 0) {

            count++;
        }

        return 0;
    }


    public static void main(String[] args) {
        int a = 0;
        a = -1 * a;
        System.out.println(a < 0);

    }
}
