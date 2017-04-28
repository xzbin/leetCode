package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/4/25.
 */
public class NthDigit {
    public static int findNthDigit(int n) {

        String result = "";
        int count = 1;
        while (result.length() < n){
            result += count;
            count++;
        }
        return result.charAt(n - 1) - '0';
    }

    public static void main(String[] args) {
        int num = 11;
        int re = NthDigit.findNthDigit(100000);
        System.out.println(re);

    }
}
