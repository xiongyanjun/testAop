package leetcode;

/**
 * @author : xiongyanjun  Date: 2020/10/30 ProjectName: settleprovisions Version: 1.0
 *
 * 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
 *
 * 示例 1:
 *
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1。
 *
 * 示例 2:
 *
 * 输入: 10
 * 输出: 36
 * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。
 *
 */
public class IntegerBreak {
    public static int solution(int num){
        int max = 0;
        for (int i = 1; i <= num/2; i++) {
            int temp = i * (num - i);
            if (temp > max){
                max = temp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int i = solution(6);
        System.out.println(i);
    }
}
