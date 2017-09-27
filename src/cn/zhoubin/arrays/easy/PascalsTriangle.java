package cn.zhoubin.arrays.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/20.
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();
        for (int i = 0;i < numRows;i++){
            row.add(0,1);
            for (int j = 1;j < row.size() - 1;j++){
                row.set(j,row.get(j)+row.get(j+1));
            }
            rows.add(new ArrayList<>(row));
        }
        return  rows;
    }


}
