package 哈希;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/13 14:36
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 * 示例 1：
 * 输入：nums = [100,4,200,1,3,2]
 * 输出：4
 * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 * 示例 2：
 * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
 * 输出：9
 *
 */
public class demo02 {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
        Arrays.sort(nums);
        int[] dp=new int[nums.length];
        dp[0]=1;
        int res=1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==nums[i-1]){
                //相等的情况
                dp[i]=dp[i-1];
                continue;
            }
            if (nums[i]==nums[i-1]+1){
                dp[i]=dp[i-1]+1;
            }else {
                dp[i]=1;
            }
            res=Math.max(res,dp[i]);
        }
        return res;
    }

    public int longestConsecutive1(int[] nums) {
        if (nums.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>(); // 存储出现过的数字和长度
        int res = 1;
        Arrays.sort(nums); // 排序
        for (int num : nums) {
            int temp = 0;
            if (map.containsKey(num - 1)) {
                // 如果出现过
                int l = map.get(num - 1);
                map.put(num, l + 1);
                res = Math.max(res, l + 1);
            } else {
                // 未出现过的话
                map.put(num, 1);
            }
        }
        return res;
    }

}
