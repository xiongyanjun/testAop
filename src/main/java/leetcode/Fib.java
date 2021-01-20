package leetcode;

/**
 * @author : xiongyanjun  Date: 2021/1/20 ProjectName: settleprovisions Version: 1.0
 */
public class Fib {
    public int fib(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        if (n > 1){
            return fib(n-1) + fib(n-2);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.printf(new Fib().fib(5)+"");
    }
}
