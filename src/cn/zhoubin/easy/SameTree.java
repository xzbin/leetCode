package cn.zhoubin.easy;


/**
 * Created by Administrator on 2017/3/28.
 */


public class SameTree {

    private int operator = 1;//1 下，2上，3 左 4 右
    private int[] coordination = {0, 0};
    private int[][] arrays;


    public void showArrays() {
        writeArrays();
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++)
                System.out.print(arrays[i][j] + "  ");
        }

    }

    private void writeArrays() {
        this.arrays = new int[6][5];
        for (int i = 1; i <= 30; i++) {
//            System.out.print(i+" ");
            this.arrays[coordination[0]][coordination[1]] = i;
            if (i == 30)
                break;
            updataCoordination();
        }
    }

    private void updataCoordination() {
        if (this.operator == 1)
            downDirection();
        else if (this.operator == 2)
            upDirection();
        else if (this.operator == 3)
            leftDirection();
        else if (this.operator == 4)
            rightDirection();

    }

    private void downDirection() {
        int x = coordination[0], y = coordination[1];
        if (x + 1 >= 6 || arrays[x + 1][y] != 0) {
            this.operator = 4;
            rightDirection();
        } else {
            coordination[0] = x + 1;
        }

    }

    private void rightDirection() {
        int x = coordination[0], y = coordination[1];
        if (y + 1 >= 5 || arrays[x ][y+ 1] != 0) {
            this.operator = 2;
            upDirection();
        } else {
            coordination[1] = y + 1;
        }

    }

    private void upDirection() {
        int x = coordination[0], y = coordination[1];
        if (x - 1 < 0 || arrays[x - 1][y] != 0) {
            this.operator = 3;
            leftDirection();
        } else {
            coordination[0] = x - 1;
        }
    }

    private void leftDirection() {
        int x = coordination[0], y = coordination[1];
        if (y - 1 < 0 || arrays[x][y - 1] != 0) {
            this.operator = 1;
            downDirection();
        } else {
            coordination[1] = y - 1;
        }
    }

    public static void main(String[] args) {

        SameTree sameTree = new SameTree();
        sameTree.showArrays();
    }

}
