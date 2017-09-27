package cn.zhoubin.arrays.easy;

/**
 * Created by Administrator on 2017/7/9.
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {

        int i = 0;
        for (int j = 1;j < nums.length;j++){
            if (nums[i] != nums[j])
                nums[++i] = nums[j];
        }
        return i+1;
    }

    public static void main(String[] args) {

    }
}
