package jvm.classLoader;

import com.sun.nio.zipfs.ZipInfo;
import org.apache.log4j.Logger;

import java.util.HashMap;

/**
 * @author : xiongyanjun  Date: 2021/3/1 ProjectName: settleprovisions Version: 1.0
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader.toString());
        ClassLoader classLoader4 = ZipInfo.class.getClassLoader();
        System.out.printf(classLoader4.toString());
        ClassLoader classLoader3 = Logger.class.getClassLoader();
        System.out.printf(classLoader3.toString());
        ClassLoader classLoader2 = HashMap.class.getClassLoader();
        System.out.printf(classLoader2.toString());
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1.toString());
    }
}
