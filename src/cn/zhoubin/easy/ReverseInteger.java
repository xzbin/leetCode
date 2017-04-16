package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/2/24.
 */

// 注意讲result 设置为大的范围。

public class ReverseInteger {
    public int reverse(int x) {
        long result = 0;
        while(x != 0){
            result =(result* 10)+ (x % 10);
            x = x / 10;
        }
        return (result>Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0:(int)result;
    }

    public static void main(String [] args){
//        int a = 123;
        int a = 321;
//        int a = Integer.MAX_VALUE;
//        int a = Integer.MIN_VALUE;
        int result = new ReverseInteger().reverse(a);
        System.out.println(result);
    }
}
