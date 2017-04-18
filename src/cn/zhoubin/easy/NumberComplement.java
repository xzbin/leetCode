package cn.zhoubin.easy;

/*
计算机中的补码存储
有符号位 和无符号位
int 32位
Integer.toBinaryString()
 */
public class NumberComplement {

    public static int findComplement(int num) {
        int numComplement = ~num;
        return numComplement & (Integer.highestOneBit(num) - 1);
    }

    public static void main(String[] args) {
//        int num = 5;//2
//        int num = 2;//1
//        int num = 0;//1
        int num = 7;//0

        int result = NumberComplement.findComplement(num);
        System.out.println(result);
    }
}
