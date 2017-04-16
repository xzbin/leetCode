package cn.zhoubin.midium;

/**
 * Created by Administrator on 2017/2/24.
 */
public class StringToInteger {
        public int myAtoi(String str) {
            if (str == null) return 0;
            str = str.trim();
            int sign = 1,pointer = 0;
            long sum = 0;
            char fistCharacter = str.charAt(0);
            if (fistCharacter == '-'){
                sign = -1;
                pointer ++;
            }
            for (;pointer < str.length();pointer++){
                if (Character.isDigit(str.charAt(pointer))){
                    sum =sum*10+ str.charAt(pointer) - '0';
                }else{
                    sum = sign * sum;
                    break;
                }
            }
            if (sum > Integer.MAX_VALUE )
                return Integer.MAX_VALUE;
            if (sum < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            return (int)sum;

    }

    public static void main(String [] args){
//         String str = "";
//         String str = "";
       long aa = -1111;
        System.out.println(aa);
    }
}
