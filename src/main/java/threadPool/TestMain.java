package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : xiongyanjun  Date: 2020/12/1 ProjectName: settleprovisions Version: 1.0
 */
public class TestMain {
    public static void main(String[] args) {
        Integer num = 0;
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable("run"+i,num));
        }
        executorService.shutdown();
    }
}
