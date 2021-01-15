package jvm.gc;

/**
 * @author : xiongyanjun  Date: 2020/12/23 ProjectName: settleprovisions Version: 1.0
 */
public class ReferenceCountingGC {

    public Object instance = null;
    private static final int _1MB = 1024 * 1024;
    /**
     * 这个成员属性的唯一意 义就是占点内存，以便能在GC日志中看清楚是否有回收过
     **/
    private byte[] bigSize = new byte[2 * _1MB];

    public static void testGC() {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;
        objA = null;
        objB = null;
        //假设在这行发生GC，objA和objB是 否能被回收?
        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }
}

