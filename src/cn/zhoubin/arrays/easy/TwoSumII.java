package cn.zhoubin.arrays.easy;

/**
 * Created by Administrator on 2017/7/9.
 */
public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];
        int left = 0, rigth = numbers.length - 1;
        while (left < rigth) {
            int sum = numbers[left] + numbers[rigth];
            if (sum == target) {
                result[0] = left + 1;
                result[1] = rigth + 1;
                break;
            }else if (sum < target){
                left++;
            }else{
                rigth --;
            }
        }
        return result;
    }

    public static void main(String [] args){
        int[] numbers={2, 7, 11, 15};
        int target = 9;
        int [] nums = TwoSumII.twoSum(numbers,target);
        for (int num : nums)
            System.out.println(num);


    }
}
