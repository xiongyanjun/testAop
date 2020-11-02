package leetcode;

/**
 * @author : xiongyanjun  Date: 2020/10/29 ProjectName: settleprovisions Version: 1.0
 *
 *给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 *
 *
 * 示例 1:
 *
 * 给定数组 nums = [1,1,2],
 *
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 */
public class RemoveDuplicates {
    public static int len;

    public static int solution(int[] nums){
        len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if(nums[i] == nums[i+1]){
                del(nums,i);
                i--;
            }
        }
        return len;
    }

    public static void del(int[] nums,int index){
        len--;
        for (int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i+1];
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = solution(nums);
        System.out.println(nums);
    }

}
