package 哈希;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/10 19:47
 */

import java.util.*;

/**
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
 * 示例 1:
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * 示例 2:
 * 输入: strs = [""]
 * 输出: [[""]]
 * 示例 3:
 * 输入: strs = ["a"]
 * 输出: [["a"]]
 */
public class demo01 {
    public static void main(String[] args) {
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strings));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        //  创建一个map,这个map中key就是题目里面给的排好序相同的字符串，value 就是循环的每个对象
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            //进行排序
            Arrays.sort(chars);
            String string = new String(chars);
            //该方法用于获取指定键对应的值，如果该键不存在，则返回指定的默认值。
            List<String> orDefault = map.getOrDefault(string, new ArrayList<>());
            orDefault.add(str);
            map.put(string,orDefault);
        }
        return new ArrayList<>(map.values());
    }
}
