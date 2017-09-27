package cn.zhoubin.arrays.easy;

/**
 * Created by Administrator on 2017/7/19.
 */
public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i =1 ;i < prices.length;i++)
            if (prices[i] - prices[i-1] > 0)
                sum += prices[i] - prices[i -1];
        return sum;
    }

    public static void main(String [] args){

    }
}
