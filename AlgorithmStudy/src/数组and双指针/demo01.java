package 数组and双指针;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/2 19:07
 */

//int[] nums = [...]; // 输入数组
//        int[] expectedNums = [...]; // 长度正确的期望答案
//
//        int k = removeDuplicates(nums); // 调用
//
//        assert k == expectedNums.length;
//        for (int i = 0; i < k; i++) {
//        assert nums[i] == expectedNums[i];
//        }
public class demo01 {

    public static void main(String[] args) {
        int [] nums ={1,2,3};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {
        //使用的是双指针

        if(nums == null || nums.length == 0) return 0;
        //定义p为最左边的元素
        int p = 0;
        //q为第二个元素
        int q = 1;
        //查看不相等的，如果不想等p就向前面进一个
        while(q < nums.length){
            if(nums[p] != nums[q]){
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
}
