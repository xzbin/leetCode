package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/4/16.
 *
 * 异或运算
 */

public class HammingDistance {
    public int hammingDistance(int x, int y) {

        int xy = x ^ y,count = 0;
        while (xy != 0){
            if ((xy & 1) == 1){
                count++;
               }
               xy = xy >>> 1;
        }
        return count;
    }

    public static void main(String [] args){
//                int x = 0,y = 0;//0
//                int x = 0,y = 1;//1
//                int x = 1,y = 4;//2
//                int x = -1,y = -4;
                int x = -1,y = -1;//0
        int result = new HammingDistance().hammingDistance(x,y);
        System.out.println(result);
//        int a = 3;
//        System.out.println(a & 1);
    }

}
