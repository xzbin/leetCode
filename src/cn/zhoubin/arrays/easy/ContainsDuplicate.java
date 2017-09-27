package cn.zhoubin.arrays.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/21.
 */
public class ContainsDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer,Integer> flags =new HashMap<>();
        for (int i = 0;i < nums.length;i++){
            if (flags.containsKey(nums[i])){
                if (i - flags.get(nums[i]) <= k)
                    return true;
            }
            flags.put(nums[i],i);
        }
        return false;
    }
}
