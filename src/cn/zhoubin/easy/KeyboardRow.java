package cn.zhoubin.easy;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/4/18.
 */
public class KeyboardRow {
    public static String[] findWords(String[] words) {
        String[] strs = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
        HashMap<Character, Integer> mapStr = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            for (char c : strs[i].toCharArray())
                mapStr.put(c, i);
        }

        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.length() == 0) continue;
            int index = mapStr.get(word.toUpperCase().charAt(0));
            for (char c : word.toUpperCase().toCharArray()) {
                if (mapStr.get(c) != index) {
                    index = -1;
                    break;
                }
            }
            if (index != -1)
                result.add(word);

        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] strs = KeyboardRow.findWords(words);
        for (String str : strs)
            System.out.println(str);
    }
}
