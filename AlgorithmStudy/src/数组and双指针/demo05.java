package 数组and双指针;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/9 20:55
 */

/**
 * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 * 示例 1 ：
 * 输入：nums = [2,2,1]
 * 输出：1
 * 示例 2 ：
 * 输入：nums = [4,1,2,1,2]
 * 输出：4
 * 示例 3 ：
 * 输入：nums = [1]
 * 输出：1
 */
public class demo05 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
    }
    public static int singleNumber(int[] nums) {
    if (nums.length==1){
        return nums[0];
    }
    int num=0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    temp++;
                }
            }
            if (temp==1){
                num=i;
            }
        }
        return nums[num];

    }


}
