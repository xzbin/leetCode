package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/4/23.
 */
public class PerfectNumber {
    public static boolean checkPerfectNumber(int num) {

        if (num <= 1)
            return false;
        int count = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                count += i;
                if (i * i != num)
                    count += (num / i);
            }
        }
        return count == num;
    }

    public static void main(String[] args) {

//        int num = 1; //false
//        0 false
        int num = 4;// false
//        int num = 28;// true
        boolean result = PerfectNumber.checkPerfectNumber(num);
        System.out.println(result);
    }
}
