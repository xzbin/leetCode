package cn.zhoubin.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Comparator;

/**
 * Created by Administrator on 2017/4/19.
 */
public class RelativeRanks {
    public static String[] findRelativeRanks(int[] nums) {

        String[] results = new String[nums.length];
        HashMap<Integer, Integer> mapper = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            mapper.put(nums[i], i);
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int index = mapper.get(num);
            if ((i + 1) == 1)
                results[index] = "Gold Medal";
            else if (i + 1 == 2)
                results[index] = "Silver Medal";
            else if (i + 1 == 3)
                results[index] = "Bronze Medal";
            else
                results[index] = (i + 1) + "";
        }
        return results;
    }

    private static void sort(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[maxIndex] < num[j])
                    maxIndex = j;
            }
            int temp = num[maxIndex];
            num[maxIndex] = num[i];
            num[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {10, 3, 8, 9, 4};
        String[] results = RelativeRanks.findRelativeRanks(nums);
        for (String result : results)
            System.out.println(result);

    }


}
