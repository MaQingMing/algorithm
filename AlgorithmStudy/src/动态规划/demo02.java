package 动态规划;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/7 19:50
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 * 示例 1:
 * 输入: numRows = 5
 * 输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * 示例 2:
 * 输入: numRows = 1
 * 输出: [[1]]
 */
public class demo02 {
    /**
     * 解题思路
     * 通过简单的循环计算每行的元素，推入结果数组即可，其中：
     * 每行的第一个和最后一个元素是1
     * 其他元素等于上一行的当前index-1的值加上上一行的当前index的值
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                    continue;
                }
                list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            res.add(list);
        }
        return res;
    }
}