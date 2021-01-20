package leetcode;

import java.util.HashSet;

/**
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *
 *
 * @author : xiongyanjun  Date: 2021/1/19 ProjectName: settleprovisions Version: 1.0
 */
public class FindRepeatNumber {
    public static void main1(String[] args) {
        FindRepeatNumber number = new FindRepeatNumber();
        int[] nums = {0, 1, 2, 3, 4, 11, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.printf(""+number.findRepeatNumber(nums));
    }
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            boolean add = integers.add(nums[i]);
            if (!add){
                return nums[i];
            }
        }
        return 0;
    }



    boolean add(int x,int[] xs){

        return false;
    }

    public static void main(String[] args) {
        int[] ints = new int[2];
        System.out.printf(ints[0]+"");
    }
}
