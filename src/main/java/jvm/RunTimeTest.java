package jvm;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.commons.exec.PumpStreamHandler;

import java.io.ByteArrayOutputStream;

/**
 * @author : xiongyanjun  Date: 2021/3/2 ProjectName: settleprovisions Version: 1.0
 */
public class RunTimeTest {
    public static void main(String[] args) {
        execCmdWithResult();
    }


    /**
     * 带返回结果的命令执行
     * @return
     */
    private static String execCmdWithResult() {
        try {
            String command = "java";
            //接收正常结果流
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            //接收异常结果流
            ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
            CommandLine commandline = CommandLine.parse(command);
            DefaultExecutor exec = new DefaultExecutor();
            exec.setExitValues(null);
            //设置一分钟超时
            ExecuteWatchdog watchdog = new ExecuteWatchdog(60*1000);
            exec.setWatchdog(watchdog);
            PumpStreamHandler streamHandler = new PumpStreamHandler(outputStream,errorStream);
            exec.setStreamHandler(streamHandler);
            exec.execute(commandline);
            //不同操作系统注意编码，否则结果乱码
            String out = outputStream.toString("GBK");
            String error = errorStream.toString("GBK");
            System.out.println(out);
            System.out.println(error);
            return out+error;
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

}
