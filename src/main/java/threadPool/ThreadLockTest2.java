package threadPool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : xiongyanjun  Date: 2020/12/1 ProjectName: settleprovisions Version: 1.0
 */
public class ThreadLockTest2 {


    public static class ParseDate implements Runnable {

        static ThreadLocal<Integer> t1 = new ThreadLocal<>();

        static Integer t2 = new Integer(1);

        public ParseDate() {
        }

        @Override
        public void run() {
            if (null == t1.get()){
                t1.set(new Integer(1));
            }
            Integer t = t1.get();
            for (int j = 0; j < 10; j++) {
                t++;
                System.out.println(t);
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i ++) {
            es.execute(new ParseDate());
        }
        es.shutdown();
    }
}
