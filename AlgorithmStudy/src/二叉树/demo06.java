package 二叉树;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/6 13:42
 */

/**
 * 给定一个二叉树，判断它是否是
 * 平衡二叉树
 * 示例 1：
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：true
 * 示例 2：
 * 输入：root = [1,2,2,3,3,null,null,4,4]
 * 输出：false
 * 示例 3：
 * 输入：root = []
 * 输出：true
 */
public class demo06 {
    public static void main(String[] args) {

    }
    public boolean isBalanced(demo03.TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(demo03.TreeNode root) {
        if (root == null) return 0;
        int left = recur(root.left);
        if (left == -1) return -1;
        int right = recur(root.right);
        if (right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
