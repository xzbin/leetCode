package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/4/17.
 */
public class NumberComplement {
    public int findComplement(int num) {

        return 0;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = ~a;
        System.out.println( Integer.highestOneBit(a));
        for (int i = 0; i < 32; i++) {
            System.out.print(a & 1);
            a = a >>> 1;
        }

//
//        for (int i = 0; i < 32; i++) {
//            System.out.print(b & 1);
//            b = b >>> 1;
//        }



//        System.out.println(new Integer(~a));
    }
}
