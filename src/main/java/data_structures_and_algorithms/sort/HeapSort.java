package data_structures_and_algorithms.sort;

/**
 * 堆排序
 *
 * 对于索引为K的节点，其左孩子为（2*K） 右孩子为（ 2*K+1）
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int[] heapsort = heapsort(nums);
        System.out.println(heapsort);
    }

    static int[] heapsort(int[] nums){
        int[] res = new int[nums.length];
        int len = nums.length;
        for (int i = 0; i < res.length; i++) {
            res[i] = getMaxInHeap(nums,len);
            nums[0] = nums[--len];
        }
        return res;
    }

    static int getMaxInHeap(int[] nums,int len){
        int[] maxTopHeap = getMaxTopHeap(nums, len);
        return maxTopHeap[0];
    }


    /**
     *去数组中的元素时，index得-1
     */

    static int[] getMaxTopHeap(int[] nums,int length){
        //树的层数
        int floors = (int)log(2,Double.parseDouble(length+"")) + 1;
        //从倒数第二行开始排序
        //倒数第二行最右节点的index
        int i = (floors - 1) * 2 - 1;
        for (;i >= 0;i--) {
            //左子树的index
            int lIndex = 2 * i;
            //右子树的index
            int rIndex = 2 * i + 1;
            swap(nums, length, i, lIndex);
            swap(nums, length, i, rIndex);
        }
        //返回数组
        return nums;
    }

    private static void swap(int[] nums, int length, int i, int rIndex) {
        if (rIndex <= length && rIndex > 0 && i > 0 && nums[i - 1] < nums[rIndex - 1]){
            int temp = nums[i - 1];
            nums[i - 1] = nums[rIndex - 1];
            nums[rIndex - 1] = temp;
        }
    }

    static double log(double a,double b){
        return Math.log(b)/Math.log(a);
    }
}