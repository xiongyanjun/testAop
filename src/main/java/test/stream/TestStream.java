package test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : xiongyanjun  Date: 2020/8/13 ProjectName: settleprovisions Version: 1.0
 */
public class TestStream {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("武汉加油");
        list.add("中国加油");
        list.add("世界加油");
        list.add("世界加油");
        Stream<String> distinct = list.stream().filter(s -> s.contains("界")).map(s -> s+"yes!");
        List<String> list1 = distinct.collect(Collectors.toList());
        list1.stream().forEach(System.out::println);

        new Thread( () ->{
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }}).start();
    }
}
