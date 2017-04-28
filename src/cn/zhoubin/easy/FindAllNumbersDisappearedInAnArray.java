package cn.zhoubin.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/19.
 */
public class FindAllNumbersDisappearedInAnArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if (nums[index] > 0)
                nums[index] = -nums[index];
        }

        for (int i = 0;i<nums.length;i++)
            if (nums[i] > 0)
                result.add(i+1);

        return result;
    }

    public static void main(String[] args) {
//        少1 2 3 4
        int [] nums = {4,3,2,7,8,2,3,1};
        List<Integer> results = FindAllNumbersDisappearedInAnArray.findDisappearedNumbers(nums);
        for (int result : results)
            System.out.println(result);
    }
}
