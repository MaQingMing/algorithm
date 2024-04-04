package 数组and双指针;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/3 17:14
 */

import java.util.Arrays;

/**
 * 示例 1：
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 * 示例 2：
 * 输入：digits = [4,3,2,1]
 * 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 * 示例 3：
 * 输入：digits = [0]
 * 输出：[1]
 */
public class demo03 {

    public static void main(String[] args) {

        int [] nums = new int[]{4,3,2,1};
        System.out.println(Arrays.toString(plusOne(nums)));

    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
