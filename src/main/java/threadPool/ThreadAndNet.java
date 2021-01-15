package threadPool;

import manager.RedisManager;

import java.util.BitSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : xiongyanjun  Date: 2020/12/14 ProjectName: settleprovisions Version: 1.0
 *
 * 线程切换与网络IO
 *
 */
public class ThreadAndNet {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.clone();

        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        threadPool.submit(()->{
            for (int i = 0; i < 1000; i++) {
                System.out.println("非网络线程");
            }
        });

        threadPool.submit(()->{
            System.out.println("开始访问redis...");
            RedisManager redisManager = new RedisManager();
            String name = redisManager.queryKey("name");

            System.out.println(name+"\nredis访问结束...");
        });

        threadPool.shutdown();
    }

}
