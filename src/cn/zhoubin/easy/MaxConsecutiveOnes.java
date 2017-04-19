package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/4/19.
 */
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxCount = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count = 0;
                while (i < nums.length && nums[i] == 1) {count++;i++;}
                if (count > maxCount) maxCount = count;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
//        int [] nums = {1,1,1,0,1};//  3

//        int [] nums = {1,0,0,0,1,1};//  2
//        int [] nums = {1};// 1

        int [] nums ={1,0,1,1,0,1};
//                {0,0,0,0};// 00000 0
        int result = MaxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }
}
