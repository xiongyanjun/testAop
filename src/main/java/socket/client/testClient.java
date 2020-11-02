package socket.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author : xiongyanjun  Date: 2020/8/21 ProjectName: settleprovisions Version: 1.0
 */
public class testClient {
    public static void main(String[] args)  {

        try {
            //连接到本机的8888端口
            Socket s = new Socket("127.0.0.1",7999);
            System.out.println(s);
            s.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
