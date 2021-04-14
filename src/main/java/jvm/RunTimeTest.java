package jvm;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.commons.exec.PumpStreamHandler;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : xiongyanjun  Date: 2021/3/2 ProjectName: settleprovisions Version: 1.0
 *
 * javac C:\Users\xiongyanjun\Desktop\temp\runJava\MyMain.java
 * java -classpath C:\Users\xiongyanjun\Desktop\temp\runJava MyMain
 */
public class RunTimeTest {
    public static void main(String[] args) throws IOException {
        String line = "public class MyMain{\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(\"Hello World !!! \\n heee\");\n" +
                "    }\n" +
                "}";
        File file = new File("C:\\Users\\xiongyanjun\\Desktop\\temp\\runJava\\MyMain.java");
        if (!file.exists()){
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file, false);
        fileWriter.write(line);
        fileWriter.close();
        execCmdWithResult("javac C:\\Users\\xiongyanjun\\Desktop\\temp\\runJava\\MyMain.java");
        execCmdWithResult("java -classpath C:\\Users\\xiongyanjun\\Desktop\\temp\\runJava MyMain");
    }

//归并
    /**
     * 带返回结果的命令执行
     * @return
     */
    private static String execCmdWithResult(String command) {
        try {
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
            System.out.println(out.trim());
            System.out.println(error);
            return out+error;
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

}
