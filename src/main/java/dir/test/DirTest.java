package dir.test;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : xiongyanjun  Date: 2020/8/25 ProjectName: settleprovisions Version: 1.0
 */
public class DirTest {
    public static void main(String[] args) {
        Long x = 1024*1024*1024L;
        File file = new File("c:\\temp");
        System.out.println(file.getName());
        System.out.println(file.getUsableSpace()/x);
        System.out.println(file.getTotalSpace()/x);
        System.out.println(file.getFreeSpace()/x);
    }
}
