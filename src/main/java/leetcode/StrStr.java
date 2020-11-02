package leetcode;

/**
 * @author : xiongyanjun  Date: 2020/10/29 ProjectName: settleprovisions Version: 1.0
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 *
 *
 */
public class StrStr {
    public static int solution(String hay, String nee) {
        for (int j = 0; j < hay.length(); j++) {
            if (hay.length()-j < nee.length()){
                return -1;
            }
            if (nee.charAt(0) == hay.charAt(j)) {
                if (hay.substring(j,j+nee.length()).equals(nee)){
                    return j;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int i = solution("solution", "ut");
        System.out.println(i);
    }
}
