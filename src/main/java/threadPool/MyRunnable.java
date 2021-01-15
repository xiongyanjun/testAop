package threadPool;

/**
 * @author : xiongyanjun  Date: 2020/12/1 ProjectName: settleprovisions Version: 1.0
 */
public class MyRunnable implements Runnable{
    private String runName;
    private Integer i;

    public MyRunnable(String runName,Integer i) {
        this.i = i;
        this.runName = runName;
    }

    public MyRunnable() {
    }

    @Override
    public void run() {
        for (int j = 0; j < 1000; j++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(runName+":");
            System.out.println(++i);
        }
    }
}
