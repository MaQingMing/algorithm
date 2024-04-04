package 字符串and双指针;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/4 13:51
 */

/**
 * 示例 1：
 *
 * 输入:a = "11", b = "1"
 * 输出："100"
 * 示例 2：
 *
 * 输入：a = "1010", b = "1011"
 * 输出："10101"
 */
public class demo02 {

    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int ca = 0;
        for(int i = a.length() - 1, j = b.length() - 1;i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum % 2);
            ca = sum / 2;
        }
        ans.append(ca == 1 ? ca : "");
        return ans.reverse().toString();
    }
}
