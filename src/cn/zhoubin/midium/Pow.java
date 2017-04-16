package cn.zhoubin.midium;

/**
 * Created by Administrator on 2017/2/25.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Random;

public class Pow {
    public double myPow(double x, int n) {

        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        double m = myPow(x, n / 2);
        return m * m * myPow(x, n % 2);
    }

    public static void main(String[] args) {

//        int x = 2,n = 0;
//        int x = 2,n = 1;
//        int x = 2,n = 2;
//        int x = 2,n = 4;
//        double result = new Pow().myPow(x,n);
//        System.out.println(result);

        int n = 2;
        new Pow().solution();

    }

    public void solution() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] lights = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            lights[i] = 0;
        }
        for (int peopleIndex = 2; peopleIndex < n + 1; peopleIndex++)
            for (int lightIndex = 1; lightIndex < n + 1; lightIndex++) {
                if (lightIndex % peopleIndex == 0) {
                    lights[lightIndex] = lights[lightIndex] == 0 ? 1 : 0;
                }
            }
        for (int i = 1; i < n + 1; i++)
            System.out.print(lights[i]);
    }


}