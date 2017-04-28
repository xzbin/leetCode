package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/4/28.
 */

//'A' + 1
public class ExcelSheetColumnTitle {
    public static String convertToTitle(int n) {
//        char tmp = ;
        return n == 0 ? "" :convertToTitle((n-1) / 26) + (char)('A'  + (n- 1) % 26);
    }

    public static void main(String[] args) {
//        1    26
//        28
        int n = 52;
//        int n = 26;
        String result = ExcelSheetColumnTitle.convertToTitle(n);
        System.out.println(result);

    }


}
