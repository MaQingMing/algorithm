package 数组and双指针;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/4 15:39
 */


/**
 * 示例 1：
 *
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
 * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
 * 示例 2：
 *
 * 输入：nums1 = [1], m = 1, nums2 = [], n = 0
 * 输出：[1]
 * 解释：需要合并 [1] 和 [] 。
 * 合并结果是 [1] 。
 * 示例 3：
 *
 * 输入：nums1 = [0], m = 0, nums2 = [1], n = 1
 * 输出：[1]
 * 解释：需要合并的数组是 [] 和 [1] 。
 * 合并结果是 [1] 。
 * 注意，因为 m = 0 ，所以 nums1 中没有元素。nums1 中仅存的 0 仅仅是为了确保合并结果可以顺利存放到 nums1 中。
 *
 */
public class demo04 {

    public static void main(String[] args) {

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 双指针，一个判断nums1的元素，另一个判断nums2的元素
        int i = m - 1, j = n - 1;
        // nums1放置元素的索引，从m+n-1倒着开始放，这样不会影响nums1前面部分的元素
        int index = m + n - 1;
        // 如果两个数组都没有被遍历完
        while(i >= 0 && j >= 0){
            if (nums1[i] <= nums2[j]){
                nums1[index--] = nums2[j--];
            }else{
                nums1[index--] = nums1[i--];
            }
        }
        // 如果是nums2更长的话，把没遍历到的元素拼到最前面(nums1更长的话不用管)
        if(j>=0){
            for(int k = 0; k <= j; k++){
                nums1[k] = nums2[k];
            }
        }
    }
}