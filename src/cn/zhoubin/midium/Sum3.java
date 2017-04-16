package cn.zhoubin.midium;

/**
 * Created by Administrator on 2017/2/25.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {

        if (nums == null || nums.length < 3) return null;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0, k = 1,j = nums.length - 1;i<j;i++){
            int sum = nums[i] + nums[j] + nums[k];
            if (sum == 0)
                result.add(Arrays.asList(nums[i],nums[j],nums[k]));
            while (nums[i] == nums[i+1] && i < j) i++;
            while (nums[k] == nums[k++] && k < j) k++;
        }




        return null;
    }
}
