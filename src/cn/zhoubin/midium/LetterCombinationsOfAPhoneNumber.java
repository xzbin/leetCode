package cn.zhoubin.midium;

/**
 * Created by Administrator on 2017/2/25.
 */

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {

//        sta<String> result = new <String>();
        LinkedList<String> result = new LinkedList<String>();
        String [] mapping = {"","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        result.add("");
        for (int i =0;i<digits.length();i++){
            int num = Character.getNumericValue(digits.charAt(i));
            while (result.peek().length() == i){
                String re = result.pop();
                for (char c :mapping[num].toCharArray()){
                    result.add(re+c);
                }

            }
        }
        return result;
    }

    public static void main(String [] args){
        String digits = "23";
        List<String> results = new LetterCombinationsOfAPhoneNumber().letterCombinations(digits);
        for (String result :results)
            System.out.println(result);

    }
}
