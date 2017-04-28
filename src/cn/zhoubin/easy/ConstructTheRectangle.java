package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/4/28.
 */

//得到新数组，并且初始化
public class ConstructTheRectangle {
    public static int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0)
            w--;
        return new int[]{area / w, w};
    }

    public static void main(String[] args) {
//        int area = 4;
//        int area = 9;
//        int area = 5;
        int area = 15;
        int [] sides = ConstructTheRectangle.constructRectangle(area);
        System.out.println(sides[0]);
        System.out.println(sides[1]);
    }


}
