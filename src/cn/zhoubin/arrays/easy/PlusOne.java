package cn.zhoubin.arrays.easy;

/**
 * Created by Administrator on 2017/7/20.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int addOne = 0, digit;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1)
                digit = digits[i] + 1 + addOne;
            else
                digit = digits[i] + addOne;
            if (digit >= 10) {
                digits[i] = digit - 10;
                addOne = 1;
            } else {
                digits[i] = digit;
                addOne = 0;
            }
        }

        if (addOne == 1) {
            int[] newDigits = new int[digits.length + 1];
            for (int i = digits.length - 1; i >= 0; i--) {
                newDigits[i + 1] = digits[i];
            }
            newDigits[0] = 1;
            digits = newDigits;
        }
        return digits;
    }


}
