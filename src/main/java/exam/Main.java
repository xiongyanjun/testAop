package exam;

import java.util.Scanner;

public class Main {
    static class Dice{
        int z;
        int y;
        int q;
        int h;
        int s;
        int x;

        Dice(int z,int y,int q,int h,int s,int x){
            this.z = z;
            this.y = y;
            this.q = q;
            this.h = h;
            this.s = s;
            this.x = x;
        }

        void goL(){
            int temp = s;
            s = y;
            y = x;
            x = z;
            z = temp;
        }

        void goR(){
            int temp = s;
            s = z;
            z = x;
            x = y;
            y = temp;
        }

        void goF(){
            int temp = s;
            s = h;
            h = x;
            x = q;
            q = temp;
        }

        void goB(){
            int temp = s;
            s = q;
            q = x;
            x = h;
            h = temp;
        }

        void goA(){
            int temp = q;
            q = z;
            z = h;
            h = y;
            y = temp;
        }

        void goC(){
            int temp = q;
            q = y;
            y = h;
            h = z;
            z = temp;
        }

        void show(){
            System.out.print(z);
            System.out.print(y);
            System.out.print(q);
            System.out.print(h);
            System.out.print(s);
            System.out.print(x);

        }
    }
    public static void main(String[] args) {
        Dice dice = new Dice(1, 2, 3, 4, 5, 6);
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        char[] chars = next.toCharArray();
        for (char ch:chars) {
            switch (ch){
                case 'L':
                    dice.goL();
                    break;
                case 'R':
                    dice.goR();
                    break;
                case 'F':
                    dice.goF();
                    break;
                case 'B':
                    dice.goB();
                    break;
                case 'A':
                    dice.goA();
                    break;
                case 'C':
                    dice.goC();
                    break;
            }
        }
        dice.show();

    }
}
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String next = scanner.nextLine();
//        String[] s = next.split(";");
//        int groupNum = s.length - 3;
//        String x = s[groupNum ];
//        String[] b = s[groupNum + 1].split(",");
//        String[] flag = s[groupNum + 2].split(",");
//        double res[] = new double[groupNum];
//        boolean bl = true;
//        for (int i = 0; i < groupNum; i++) {
//            bl = bl & func(s[i],x,b[i],flag[i],res,i);
//        }
//        double max = 0.0;
//        for (int i = 0; i < res.length; i++) {
//            if (res[i] > max){
//                max = res[i];
//            }
//        }
//        int max1 = (int) max;
//        System.out.println(bl+","+max1);
//    }
//
//    private static boolean func(String s, String x, String s1, String s2, double[] res, int i) {
//        String[] aa = s.split(",");
//        String[] xx = x.split(",");
//        double num = 0.0;
//        for (int j = 0; j < aa.length; j++) {
//            num += Double.parseDouble(aa[j]) * Double.parseDouble(xx[j]);
//        }
//        double bb = Double.parseDouble(s1);
//        res[i] = num - bb;
//        switch (s2){
//            case ">":
//                if (num > bb){
//                    return true;
//                }else {
//                    return false;
//                }
//            case ">=":
//                if (num >= bb){
//                    return true;
//                }else {
//                    return false;
//                }
//            case "<":
//                if (num < bb){
//                    return true;
//                }else {
//                    return false;
//                }
//            case "<=":
//                if (num <= bb){
//                    return true;
//                }else {
//                    return false;
//                }
//            case "=":
//                if (num == bb){
//                    return true;
//                }else {
//                    return false;
//                }
//        }
//        return false;
//    }
//
//
//}




//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String next = scanner.nextLine();
//        String[] s = next.split(" ");
//        int c = Integer.parseInt(s[0]);
//        int b = Integer.parseInt(s[1]);
//        if (s.length < 3){
//            return;
//        }
//        Map map = new HashMap<Integer,Integer>();
//        for (int i = 2; i < s.length; i++) {
//            int res = func(b, s[i]);
//            if (res != c){
//                countNum(res,map);
//            }
//        }
//        int result = 0;
//        for (Object set:map.keySet()) {
//            int o = (int) set;
//            if (o > result){
//                result = o;
//            }
//        }
//        System.out.println(map.get(result));
//    }
//
//    private static void countNum(int res, Map map) {
//        if (map.containsKey(res)){
//            int t = (int) map.get(res);
//            map.put(res,++t);
//        }else {
//            map.put(res,1);
//        }
//    }
//
//    static int func(int b,String num){
//        String hex = Integer.toHexString(Integer.parseInt(num));
//        int i = func1(hex) % b;
//        return i;
//    }
//
//    static int func1(String string){
//        int length = string.length();
//        int count = 0;
//        while (length > 0){
//            if (length == 1){
//                count += Integer.parseInt(string.substring(length-1,length));
//                return count;
//            }else if (length == 0){
//                return count;
//            }else {
//                count += Integer.parseInt(string.substring(length-2,length));
//                length -= 2;
//            }
//        }
//        return 0;
//    }
//}

//1 4 256 257 258 259 260 261 262 263 264 265