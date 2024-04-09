package 动态规划;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/9 16:21
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 * 示例 1
 * 输入: rowIndex = 3
 * 输出: [1,3,3,1]
 * 示例 2:
 * 输入: rowIndex = 0
 * 输出: [1]
 * 示例 3:
 * 输入: rowIndex = 1
 * 输出: [1,1]
 */
public class demo03 {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    /**
     我们只需要一层一层的求。但是不需要把每一层的结果都保存起来，只需要保存上一层的结果，就可以求出当前层的结果了。
     * @param rowIndex
     * @return
     */
    public static List<Integer> getRow(int rowIndex) {
        int pre = 1;
        List<Integer> cur = new ArrayList<>();

        cur.add(1);       //第一层一
        for (int i = 1; i <= rowIndex; i++) {      // 第二层开始
            for (int j = 1; j < i; j++) {
                int temp = cur.get(j);
                cur.set(j, pre + cur.get(j));
                pre = temp;
            }
            cur.add(1);
        }
        return cur;
    }
}
