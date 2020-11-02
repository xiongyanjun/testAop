package socket.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : xiongyanjun  Date: 2020/8/21 ProjectName: settleprovisions Version: 1.0
 */
public class testScanIp {
    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("ping " + "192.178.101.01");
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            if (line.length() != 0)
                sb.append(line + "\r\n");
        }
        System.out.println("本次指令返回的消息是：");
        System.out.println(sb.toString());
    }
}
