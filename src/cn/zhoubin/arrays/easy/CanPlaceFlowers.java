package cn.zhoubin.arrays.easy;

/**
 * Created by Administrator on 2017/7/9.
 */
public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {


        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            int front = 0, end = 0;
            if (i - 1 < 0 || flowerbed[i - 1] == 0) front = 1;
            if (i + 1 >= flowerbed.length || flowerbed[i + 1] == 0) end = 1;
            if (front == 1 && end == 1 && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                count++;
            }
        }
        return count >= n ? true : false;
    }

    public static void main(String[] args) {
        int[] nums = {0};
        int n = 1;
        boolean flag = CanPlaceFlowers.canPlaceFlowers(nums, n);
        System.out.println(flag);
    }
}
