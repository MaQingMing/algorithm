package 二叉树;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/5 14:16
 */

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
 *

 * 示例 1：
 *
 * 输入：root = [1,null,2,3]
 * 输出：[1,3,2]
 * 示例 2：
 *
 * 输入：root = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：root = [1]
 * 输出：[1]
 */
public class demo01 {

    public static void main(String[] args) {

    }
//    前序遍历：打印 - 左 - 右
//    中序遍历：左 - 打印 - 右
//    后序遍历：左 - 右 - 打印
    public List<Integer> inorderTraversal(TreeNode root) {
        List list = new ArrayList<Integer>();
        Stack stack = new Stack<TreeNode>();
        while (stack.size()>0&&root!=null){
            //不断往左子树方向走，每走一次就将当前节点保存到栈中
            //这是模拟递归调用
            if (root!=null){
                stack.add(root);
                root=root.left;
            }else {
                //当前节点为空，说明左边走到头了，从栈中弹出节点并保存
                //然后向右边节点
                TreeNode treeNode = (TreeNode) stack.pop();
                list.add(treeNode.val);
                root=treeNode.right;
            }
        }
        return list;
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
