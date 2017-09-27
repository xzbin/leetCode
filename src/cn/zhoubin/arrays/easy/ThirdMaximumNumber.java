package cn.zhoubin.arrays.easy;

/**
 * Created by Administrator on 2017/7/19.
 */

// no.12 是key
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Integer firstNumber = null, secondNumber = null, thirdNumber = null;
        for (Integer num : nums) {
            if (num.equals(firstNumber) || num.equals(secondNumber) || num.equals(thirdNumber)) continue;
            if (firstNumber == null || num > firstNumber) {
                thirdNumber = secondNumber;
                secondNumber = firstNumber;
                firstNumber = num;
            } else if (secondNumber == null || (num > secondNumber && num < firstNumber)) {
                thirdNumber = secondNumber;
                secondNumber = num;
            } else if (thirdNumber == null || (num > thirdNumber && num < secondNumber)) {
                thirdNumber = num;
            }
        }
        return thirdNumber == null ? firstNumber : thirdNumber;
    }

    public static void main(String[] args) {
        int []nums ={2,3, 2, 1};
        int re = new ThirdMaximumNumber().thirdMax(nums);
        System.out.println(re);
    }
}
