package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/4/18.
 */
public class NextGreaterElementI {
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] result = new int[findNums.length];
        int pointer = 0;
        for (int findNum : findNums) {
            int index = findIndexFromNums(findNum, nums);
            if (index == -1)
                result[pointer++] = index;
            else {
                result[pointer++] = findNextGreaterFromIndex(nums, findNum, index);
            }
        }
        return result;
    }

    private static int findNextGreaterFromIndex(int[] nums, int number, int index) {
//        int greater = Integer.MAX_VALUE, greaterIndex = -1;

        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] > number) {
                return nums[i];
            }

        }
        return -1;
    }

    private static int findIndexFromNums(int number, int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == number)
                return i;

        return -1;
    }

    public static void main(String[] args) {
        int[] findNums = {4, 1, 2}, nums = {1, 3, 4, 2};//[-1,3,-1]
//        int[] findNums = {2, 4}, nums = {1, 2, 3, 4};//[3,-1]
        //2 4                      1 2 3 4 [3,-1]
        //
        int[] results = NextGreaterElementI.nextGreaterElement(findNums, nums);
        for (int result : results)
            System.out.println(result);
    }
}
