package cn.zhoubin.easy;

import java.util.Stack;

/**
 * Created by Administrator on 2017/2/24.
 */

// 负数
// overflow
public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        int palindromeX = 0;
        int xx = x;
        while (x < 10){
            palindromeX = palindromeX * 10 + x % 10;
            x = x / 10;
        }
        return palindromeX == xx / 10 && x== xx % 10;
    }

    public static void main(String [] args){
        int x = 121;
        boolean result = new PalindromeNumber().isPalindrome(x);
        System.out.println(result);
    }
}
