package cn.zhoubin.arrays.easy;

import javafx.collections.transformation.FilteredList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/22.
 */
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> re = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0)
                nums[index] = -1 * nums[index];
        }

        for (int i = 0; i < nums.length; i++)
            if (nums[i] > 0)
                re.add(i + 1);
        return re;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> re = new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(nums);
        for (int r : re)
            System.out.println(r);
    }

}
