package cn.zhoubin.easy;

import com.sun.org.apache.regexp.internal.RE;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by Administrator on 2017/4/16.
 */
public class ReverseWordsInAStringIII {

    public static String reverseWords(String s) {
        char[] sChars = s.toCharArray();
        int length = s.length();
        int start = 0, end = 0;
        for (int i = 0; i < length; i++) {
            char sChar = sChars[i];
            if (sChar == ' ') {
                reverseChars(sChars, start, i - 1);
                while (i < length & sChars[i] == ' ') i++;
                start = i;
            } else if (i == length - 1) {
                reverseChars(sChars, start, i);
                while (i < length & sChars[i] == ' ') i++;
                start = i;
            }

        }

        return new String(sChars);
    }


    private static void reverseChars(char[] chars, int start, int end) {
        while (start < end) {
            char tmp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = tmp;
        }
    }


    public static void main(String[] args) {
//        char [] ss = "12345678".toCharArray();
//        System.out.println(new String(ss));
//        ReverseWordsInAStringIII.reverseChars(ss,2,4);
//        for (char s :ss)
//            System.out.print(s);
        String s = "Let's take LeetCode contest";
        String result = ReverseWordsInAStringIII.reverseWords(s);
        System.out.println(result);
    }
}
