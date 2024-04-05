package 二叉树;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/5 14:40
 */
/**
 * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 * 示例 1：
 * 输入：p = [1,2,3], q = [1,2,3]
 * 输出：true
 * 示例 2：
 * 输入：p = [1,2], q = [1,null,2]
 * 输出：false
 * 示例 3：
 * 输入：p = [1,2,1], q = [1,1,2]
 * 输出：false
 */
public class demo03 {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        return dfs(root.left,root.right);
    }

    boolean dfs(TreeNode left,TreeNode right){
        if (left==null&&right==null){
            return true;
        }
        if (left==null||right==null){
            return false;
        }
        if (left.val!= right.val){
            return false;
        }
        return dfs(left.right, right.left)&&dfs(left.left,right.right);
    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
}
