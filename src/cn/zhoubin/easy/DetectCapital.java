package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/4/17.
 */
public class DetectCapital {


    public static boolean detectCapitalUse(String word) {
        boolean firstCapital = false, secondCapital = false;
        for (int i = 0; i < word.length(); i++) {
            if (i == 0 && Character.isUpperCase(word.charAt(i)))
                firstCapital = true;
            else {
                if (Character.isUpperCase(word.charAt(i)) && !firstCapital) {
                    return false;
                } else if (Character.isLowerCase(word.charAt(i)))
                    firstCapital = false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        String word = "USA";//True
//        String word = "FlaG";//false
//        String word = "Flag";//True
//        String word = "leetcode";// True
        String word = "FFFFFFFFFFFFFFFFFFFFf";
        boolean result = DetectCapital.detectCapitalUse(word);
        System.out.println(result);
    }
}
