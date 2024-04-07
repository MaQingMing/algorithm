package 二叉树;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/7 19:24
 */
/**
 *给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 说明：叶子节点是指没有子节点的节点。
 * 示例 1：
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：2
 * 示例 2：
 * 输入：root = [2,null,3,null,4,null,5,null,6]
 * 输出：5
 */

/**
 * 解题思路：
 * 很多人写出的代码都不符合 1,2 这个测试用例，是因为没搞清楚题意
 * 题目中说明:叶子节点是指没有子节点的节点，这句话的意思是 1 不是叶子节点
 * 题目问的是到叶子节点的最短距离，所以所有返回结果为 1 当然不是这个结果
 * 另外这道题的关键是搞清楚递归结束条件
 * 叶子节点的定义是左孩子和右孩子都为 null 时叫做叶子节点
 * 当 root 节点左右孩子都为空时，返回 1
 * 当 root 节点左右孩子有一个为空时，返回不为空的孩子节点的深度
 * 当 root 节点左右孩子都不为空时，返回左右孩子较小深度的节点值
 */
public class demo07 {

    public static void main(String[] args) {

    }

    public int minDepth(demo03.TreeNode root) {
        if(root == null) return 0;
        int m1 = minDepth(root.left);
        int m2 = minDepth(root.right);
        //1.如果左孩子和右孩子有为空的情况，直接返回m1+m2+1
        //2.如果都不为空，返回较小深度+1
        return root.left == null || root.right == null ? m1 + m2 + 1 : Math.min(m1,m2) + 1;
    }



}
