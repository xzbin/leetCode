package cn.zhoubin.arrays.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/9.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int [] result = new int [2];
        Map<Integer,Integer> maps = new HashMap<Integer,Integer>();
        for (int i = 0;i < nums.length;i++){
            if (maps.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = maps.get(target - nums[i]);
                break;
            }
            maps.put(nums[i],i);
        }

        return result;
    }

    public static void main(String [] args){
//        int [] nums = {2, 7, 11, 15};
//        int target = 9;
        int [] nums = {3,2,4};
        int target = 6;
        int [] result = TwoSum.twoSum(nums,target);
        for (int r : result)
            System.out.println(r);

    }
}
