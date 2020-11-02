package map;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author : xiongyanjun  Date: 2020/10/29 ProjectName: settleprovisions Version: 1.0
 */
public class TestMap {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        new Thread(() -> {
            for (int i = 0; i < 99; i++) {
                map.put(i+"",i+"");
            }
        }).start();
        new Thread(() -> {
            for (int i = 99; i < 199; i++) {
                map.put(i+"",i+"");
            }
        }).start();
//        ArrayList<Object> objects = new ArrayList<>();
//        objects.remove()
    }
}
