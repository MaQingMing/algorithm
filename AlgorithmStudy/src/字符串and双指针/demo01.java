package 字符串and双指针;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/2 20:05
 */

import java.util.Arrays;

/**
 * 示例 1：
 *
 * 输入：haystack = "sadbutsad", needle = "sad"
 * 输出：0
 * 解释："sad" 在下标 0 和 6 处匹配。
 * 第一个匹配项的下标是 0 ，所以返回 0 。
 * 示例 2：
 *
 * 输入：haystack = "leetcode", needle = "leeto"
 * 输出：-1
 * 解释："leeto" 没有在 "leetcode" 中出现，所以返回 -1 。
 */
public class demo01 {

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        //计算字符串长度
        int n = haystack.length(), m = needle.length();

        for (int i = 0; i + m <= n; i++) {
            boolean match = true;
            for (int j = 0; j < m && match; j++) {
                if (haystack.charAt(j + i) != needle.charAt(j)) {
                    match = false;
                }
            }
            if (match) {
                return i;
            }
        }
        return -1;
    }
}
