package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/2/24.
 */

// indexOf
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null && strs.length == 0 )   return "";
        String prefixString = strs[0];
        for (int i = 0;i<strs.length;i++){
            while (strs[i].indexOf(prefixString) != 0)
                prefixString = prefixString.substring(0,prefixString.length() - 1);
        }
        return prefixString;
    }
    public static void main(String [] args){
        String name = "21";
        System.out.println(name.indexOf("21"));
    }
}
