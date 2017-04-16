package cn.zhoubin.midium;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/2/24.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int lenght = 0,maxLen = 0;
        HashMap<Character,Integer> mapChar = new HashMap<Character,Integer>();
        for (int i = 0,j=0; i < s.length();i++){
            if (mapChar.containsKey(s.charAt(i)))
                j = Math.max(j,mapChar.get(s.charAt(i))+1);
            mapChar.put(s.charAt(i),i);
            maxLen = Math.max(maxLen,i-j+1);
        }
        return maxLen;
    }

    public static void main(String [] args){
        HashMap<Character,Integer> mapChar = new HashMap<Character,Integer>();
//        mapChar.get();
    }

}
