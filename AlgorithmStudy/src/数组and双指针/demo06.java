package 数组and双指针;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/13 15:07
 */

import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * 示例 1:
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 示例 2:
 * 输入: nums = [0]
 * 输出: [0]
 */
public class demo06 {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
    public static void moveZeroes(int[] nums) {
        int index = 0;
        int temp =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                temp=nums[i];          //临时变量变为此时的值
                nums[i]=0;             //将当前位置设置为0
                nums[index++]=temp;    //按照index依次插入
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
