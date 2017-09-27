package cn.zhoubin.arrays.easy;

/**
 * Created by Administrator on 2017/7/19.
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        int sum = 0,maxSum = 0,sellPrice = prices[0] ;
        for (int i = 1;i< prices.length;i++){
            if (prices[i] - sellPrice < 0){
                sellPrice = prices[i];
                sum = 0;
            }else{
                sum = prices[i] - sellPrice ;
                if (maxSum < sum)
                    maxSum = sum;
            }
        }
        return maxSum;
    }
    public static void main(String [] args){
        int [] intputs = {1,2,4,2,5,7,2,4,9,0,9};
        int re = new BestTimeToBuyAndSellStock().maxProfit(intputs);
        System.out.println(re);
    }
}
