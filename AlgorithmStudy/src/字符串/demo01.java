package 字符串;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/3 16:56
 */
public class demo01 {
    /**
     * 示例 1：
     *
     * 输入：s = "Hello World"
     * 输出：5
     * 解释：最后一个单词是“World”，长度为5。
     * 示例 2：
     *
     * 输入：s = "   fly me   to   the moon  "
     * 输出：4
     * 解释：最后一个单词是“moon”，长度为4。
     * 示例 3：
     *
     * 输入：s = "luffy is still joyboy"
     * 输出：6
     * 解释：最后一个单词是长度为6的“joyboy”。
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        char[] chars = s.trim().toCharArray();
        int cnt=0;
        for (int i = chars.length-1; i >=0; i--) {
            if (chars[i]!=' '){
                cnt++;
            }else{
                break;
            }
        }
        return cnt;
    }


}
