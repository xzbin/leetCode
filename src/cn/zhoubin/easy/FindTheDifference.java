package cn.zhoubin.easy;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/4/17.
 */
public class FindTheDifference {

    public static char findTheDifference(String s, String t) {
//        char[] aChars = s.
        int i;
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        for (i = 0; i < s.length(); i++) {
            if (sMap.containsKey(s.charAt(i)))
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
            else
                sMap.put(s.charAt(i), 1);
        }

        for (i = 0; i < t.length(); i++) {
            if (sMap.containsKey(t.charAt(i))) {
                int value = sMap.get(t.charAt(i));
                if (value == 1)
                    sMap.remove(t.charAt(i));
                else
                    sMap.put(t.charAt(i), value - 1);

            } else {
                break;
            }
        }

        return t.charAt(i);
    }

    public static void main(String[] args) {
//        String s = "abcd",t= "abcde";
//String s = "abc",t = "bace";
//String s = "",t = "q";
String s = "aaaa",t="aaaaa";
        char result = FindTheDifference.findTheDifference(s,t);
        System.out.println(result);
    }


}
