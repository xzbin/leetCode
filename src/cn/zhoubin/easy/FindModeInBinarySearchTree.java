package cn.zhoubin.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/4/23.
 */

//compare

public class FindModeInBinarySearchTree {
    HashMap<Integer, Integer> nodeCount = new HashMap<>();
    int maxNodeCount = 0;

    public int[] findMode(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return null;
        inorderTree(root);
        for (Integer key : nodeCount.keySet()) {
            if (nodeCount.get(key) == maxNodeCount)
                result.add(key);
        }

        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++)
            res[i] = result.get(i);
        return res;
    }

    public void inorderTree(TreeNode root) {
        if (root != null) {
            if (nodeCount.containsKey(root.val)) {
                int value = nodeCount.get(root.val);
                nodeCount.put(root.val, ++value);
                if (value > maxNodeCount) maxNodeCount = value;
            }
            inorderTree(root.left);
            inorderTree(root.right);
        }
    }

    public static void main(String[] args) {

    }
}
