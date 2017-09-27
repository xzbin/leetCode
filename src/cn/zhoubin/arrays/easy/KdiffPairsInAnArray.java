package cn.zhoubin.arrays.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/21.
 *
 */

// 没有考虑到 k = 0 和  数组中的重复情况
public class KdiffPairsInAnArray {

    public int findPairs(int[] nums, int k) {
        if (k <0) return 0;
        Map<Integer, Integer> flags = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            flags.put(num, flags.getOrDefault(num, 0) + 1);
        }

        for (int num : flags.keySet()) {
            if (k == 0){
                if (flags.get(num) >= 2)
                    count ++;
        }else{
                if (flags.containsKey(num + k))
                    count ++;
            }
        }
        return count;
    }

    public static void main(String [] args){
        int [] nums = {2, 1, 1, 3, 5};
        int  k =1;
        int re = new KdiffPairsInAnArray().findPairs(nums,0);
        System.out.println(re);
    }
}
