package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/2/13.
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int low = 1,high = num;
        while (low <= high){
            long mid = (low +high ) >> 1;
            if (mid * mid == num)
                return true;
            else if (mid * mid > num){
                high = (int)mid - 1;
            }else {
                low = (int)mid + 1;
            }
        }
        return false;
    }


    public static void main(String [] args){
        boolean result = new ValidPerfectSquare().isPerfectSquare(2147483647);
        System.out.println(result);
    }
}
