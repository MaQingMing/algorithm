package 二分查找;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/1 21:32
 */
public class demo01 {

    public static void main(String[] args) {

        int[] nums= new int[]{1,3};
        int target =2;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int min =0;
        int max = nums.length -1;
        int mid = 0;
        while (min<=max){
            mid = (min+max) /2;
            if (nums[mid]==target)  {return mid;}
            else if (nums[mid]<target) { min = mid +1; }
            else { max = mid -1;}
        }
        return  min;
    }
}
