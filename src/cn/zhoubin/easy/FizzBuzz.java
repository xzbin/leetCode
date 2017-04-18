package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/4/18.
 */

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0)
                result.add("FizzBuzz");
            else if (i % 3 == 0)
                result.add("Fizz");
            else if (i % 5 == 0)
                result.add("Buzz");
            else
                result.add(i + "");
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> results = FizzBuzz.fizzBuzz(15);
        for (String result : results)
            System.out.println(result);
    }
}
