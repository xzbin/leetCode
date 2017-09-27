package cn.zhoubin.arrays.easy;

/**
 * Created by Administrator on 2017/7/18.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0;i < nums.length;i++){
            if(nums[i] >= target)
                return i;
        }
        return nums.length ;
    }
}
