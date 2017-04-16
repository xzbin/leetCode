package cn.zhoubin.midium;

/**
 * Created by Administrator on 2017/2/25.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {

        if (nums == null)
            return null;

        List<List<Integer>> result = new ArrayList<>();
        permuteNums(nums, 0, result);
        return result;
    }

    private void permuteNums(int[] nums, int i, List<List<Integer>> result) {
        if (i == nums.length) {
            List<Integer> permution = new ArrayList<Integer>();
            for (int num : nums) {
                permution.add(num);
            }
            result.add(permution);

        }
        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            permuteNums(nums, i + 1, result);
            swap(nums, i, j);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        List<List<Integer>> result = new Permutations().permute(nums);
        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++) {
            List<Integer> tt = result.get(i);
            for (int j = 0; j < tt.size(); j++)
                System.out.print(tt.get(j));
            System.out.println();
        }

    }
}
