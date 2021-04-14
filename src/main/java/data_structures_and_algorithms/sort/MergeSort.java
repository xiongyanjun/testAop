package data_structures_and_algorithms.sort;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] ints = {10,9,8,7,6,5,4,3,2,1};
        int[] sortFunc = sortFunc(ints);
        System.out.println(sortFunc);
    }

    static int[] sortFunc(int[] nums){
        int mid = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);
        if (mid == 1){
            if (nums.length % 2 == 0){
                return merge(left,right);
            }else {
                //当数组为奇数，left.length = 1,right.length = 2 的情况
                return merge(merge(left,Arrays.copyOfRange(right, 0, 1)),Arrays.copyOfRange(right, 1, 2));
            }

        }
        int[] ints = sortFunc(left);
        int[] ints1 = sortFunc(right);
        return merge(ints,ints1);

    }

    //两有序数组排序
    static int[] merge(int[] left,int[] right){
        int[] ints = new int[left.length + right.length];
        //较小数依次插入数组
        int j = 0;
        int k = 0;
        for (int i = 0; i < ints.length; i++) {
            //循环left,right数组
            if (j > left.length - 1){
                ints[i] = right[k];
                k++;
                continue;
            }
            if (k > right.length - 1){
                ints[i] = left[j];
                j++;
                continue;
            }
            if (left[j] < right[k]){
                ints[i] = left[j];
                j++;
            }else {
                ints[i] = right[k];
                k++;
            }
            
        }
        return ints;
    }
}
