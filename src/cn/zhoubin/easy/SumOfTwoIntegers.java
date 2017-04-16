package cn.zhoubin.easy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/**
 * Created by Administrator on 2017/2/13.
 */
public class SumOfTwoIntegers {

    public static void main(String [] args){
//        int a = 2;
//        int b = 6;
//        System.out.println(a^b);

        String [] element = {"1","2"};
        List<String> elements = Arrays.asList(element);
        Iterator<String> it = elements.iterator();
        System.out.println(it.next());

        System.out.println(it.next());
    }
}
