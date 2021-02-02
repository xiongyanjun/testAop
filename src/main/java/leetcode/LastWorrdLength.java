package leetcode;

import java.util.Scanner;

/**
 *  计算字符串最后一个单词的长度，单词以空格隔开。
 * 输入描述:
 *
 * 输入一行，代表要计算的字符串，非空，长度小于5000。
 *
 * 输出描述:
 *
 * 输出一个整数，表示输入字符串最后一个单词的长度。
 *
 * 示例1
 * 输入
 *
 * hello nowcoder
 *
 * 输出
 *
 * 8
 *
 * @author : xiongyanjun  Date: 2021/2/2 ProjectName: settleprovisions Version: 1.0
 */
public class LastWorrdLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int length = str.length();
        char s;
        do {
            length --;
            s = str.charAt(length);
        }while (' ' != s);

        int i = str.length() - 1 - length;
        System.out.printf(i + "");
    }
}
