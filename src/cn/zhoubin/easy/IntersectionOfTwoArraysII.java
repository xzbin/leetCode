package cn.zhoubin.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by Administrator on 2017/2/13.
 */
public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {

        Set<Integer> indexUsed = new HashSet<Integer>();
        int lengthOfNums1 = nums1.length;
        int lengthOfNums2 = nums2.length;
        int[] result = new int[lengthOfNums1 > lengthOfNums2 ? lengthOfNums2 : lengthOfNums1];
        int sizeOfResult = 0;


        for (int i = 0; i < lengthOfNums1; i++) {
            for (int j = 0; j < lengthOfNums2; j++) {
                if (nums2[j] == nums1[i] && !indexUsed.contains(j) && sizeOfResult != result.length) {
                    result[sizeOfResult++] = nums1[i];
                    indexUsed.add(j);
                    break;
                }
            }
        }

        return Arrays.copyOf(result,sizeOfResult);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {2, 2};
//        int
        int[] result = new IntersectionOfTwoArraysII().intersect(nums1, nums2);
        for (int num : result)
            System.out.println(num);

    }

}
