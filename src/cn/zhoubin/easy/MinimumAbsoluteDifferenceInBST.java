package cn.zhoubin.easy;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

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
    public static int getMinimumDifference(TreeNode root) {

        if (root == null) return 0;
        Integer[] nums = getNumsInorderTransferBST(root);
        int difference = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] < difference) {
                difference = nums[i + 1] - nums[i];
            }
        }
        return difference;
    }

    private static Integer[] getNumsInorderTransferBST(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        Stack<TreeNode> treeStack = new Stack<>();
        treeStack.add(root);
        TreeNode p = root.left;
        while (treeStack.size() != 0) {
            while (p != null) {
                treeStack.push(p);
                p = p.left;
            }
            p = treeStack.pop();
            nums.add(p.val);
            if ((p = p.right) != null) {
                treeStack.add(p);
                p = p.left;
            }
        }

        return nums.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        right.left = left;
        head.right = right;

        int nums = MinimumAbsoluteDifferenceInBST.getMinimumDifference(head);
        System.out.println(nums);
    }
}

