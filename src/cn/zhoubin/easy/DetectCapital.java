package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/4/17.
 */
public class DetectCapital {


    public static boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()) ||
                Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase());

    }

    public static void main(String[] args) {
//        String word = "USA";//True
//        String word = "FlaG";//false
//        String word = "Flag";//True
        String word = "leetcode";// True
//        String word = "FFFFFFFFFFFFFFFFFFFFf";//false
        boolean result = DetectCapital.detectCapitalUse(word);
        System.out.println(result);
    }
}
