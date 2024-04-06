package 二叉树;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/6 13:13
 */

/**
 * 给定一个二叉树 root ，返回其最大深度。
 * 二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。
 * 示例 1：
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：3
 * 示例 2：
 * 输入：root = [1,null,2]
 * 输出：2
 *
 */


/**
 * 树的遍历方式总体分为两类：深度优先搜索（DFS）、广度优先搜索（BFS）。
 *
 * 常见 DFS ： 先序遍历、中序遍历、后序遍历。
 * 常见 BFS ： 层序遍历（即按层遍历）。
 */
public class demo04 {
    public static void main(String[] args) {

    }

    public int maxDepth(demo03.TreeNode root) {
        if (root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
