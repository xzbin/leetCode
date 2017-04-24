package cn.zhoubin.easy;

/**
 * Created by Administrator on 2017/4/23.
 */

//  DFS
public class PathSumIII {

    public static int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        return findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private static int findPath(TreeNode root, int sum) {
        int count = 0;
        if (root == null)
            return count;
        if (root.val == sum)
            count++;
        count += findPath(root.left, sum - root.val);
        count += findPath(root.right, sum - root.val);
        return count;
    }


    public static void main(String[] args) {
//        int [] root = {10,5,-3,3,2,null,11,3,-2,null,1};   8   3
//        TreeNode tree = new TreeNode(0);

//        null  4 0

//      [2,2,2]  2  3

//      [2,2,3]  3   1
        TreeNode head = new TreeNode(2);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        head.left = left;head.right = right;
        int count = PathSumIII.pathSum(null,3);
        System.out.println(count);

    }
}
