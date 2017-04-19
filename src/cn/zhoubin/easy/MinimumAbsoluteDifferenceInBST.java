package cn.zhoubin.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Administrator on 2017/4/19.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class MinimumAbsoluteDifferenceInBST {
    public int getMinimumDifference(TreeNode root) {

        return 0;
    }

    private int[] getNumsInorderTransferBST(TreeNode root) {

        List<Integer> nums = new ArrayList<>();
        Stack<TreeNode> treeStack = new Stack<>();
        TreeNode p = root;
        while (treeStack.size() != 0) {
            while (p != null) {
                treeStack.add(p);
                p = p.left;
            }
            p = treeStack.pop();
            if (p.right != null) {
                p = p.left;
                while (p != null)
            }

        }

        return null;
    }

    public static void main(String[] args) {

    }
}

