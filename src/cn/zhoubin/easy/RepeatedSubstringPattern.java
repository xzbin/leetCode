package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/4/23.
 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        return true;
    }

    private static int[] kmp(String s) {
        int len = s.length();
        int[] res = new int[len];
        char[] ch = s.toCharArray();
        int i = 0, j = 1;
        res[0] = 0;
        while (i < ch.length && j < ch.length) {
            if (ch[j] == ch[i]) {
                res[j] = i + 1;
                i++;
                j++;
            } else {
                if (i == 0) {
                    res[j] = 0;
                    j++;
                } else {
                    i = res[i - 1];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "aba";
        int [] res = RepeatedSubstringPattern.kmp(s);
        for (int re : res)
            System.out.println(re);
    }
}
