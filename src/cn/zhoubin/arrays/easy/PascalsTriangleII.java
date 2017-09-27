package cn.zhoubin.arrays.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/20.
 */
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0;i < rowIndex;i++){
            row.set(0,1);
            for (int j = 1;j < row.size() -1 ;j++){
                row.set(j,row.get(j) + row.get(j+1));
            }
        }
        return row;
    }
}
