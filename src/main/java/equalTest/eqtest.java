package equalTest;

import java.util.HashSet;

/**
 * @author : xiongyanjun  Date: 2020/11/30 ProjectName: settleprovisions Version: 1.0
 */
public class eqtest {
    public static void main(String[] args) {
        String s1 = new String("123");
        String s2 = "123";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        TestObj o1 = new TestObj("xiong", "123");
        TestObj o2 = new TestObj("xiong", "123");
        System.out.println(o1==o2);
        System.out.println(o1.equals(o2));
        HashSet<TestObj> objs = new HashSet<>();
        objs.add(o1);
        objs.add(o2);
        //fixme
        System.out.println(objs.size());
//        Integer
    }
}
