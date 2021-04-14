package data_structures_and_algorithms.sort;

/**
 *快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {41,25,63,77,13,2,4,12,3,213,423,324,213,21,23,13,4,34,3,423,43,5,45,43};
        quickSort(nums,0,nums.length-1);
        System.out.println(nums);
    }

    public static void quickSort(int[] nums,int left1,int right1){
        int left = left1;
        int right = right1;
        int pivot = nums[left];
        //记录该移动的左右游标  0：左   1：右
        int flag = 1;
        while (left != right){
            if (flag == 1){
                if (pivot >= nums[right]){
                    nums[left] = nums[right];
                    left++;
                    flag = 0;
                }else {
                    right--;
                }
            }else {
                if (pivot < nums[left]){
                    nums[right] = nums[left];
                    right--;
                    flag = 1;
                }else {
                    left++;
                }
            }
        }
        nums[left] = pivot;
        if (right > left1){
            quickSort(nums, left1, right-1);
        }
        if (right1 > left){
            quickSort(nums, left+1, right1);
        }
    }
}
