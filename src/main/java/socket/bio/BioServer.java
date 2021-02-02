package socket.bio;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : xiongyanjun  Date: 2021/1/22 ProjectName: settleprovisions Version: 1.0
 */
public class BioServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(8800);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        PrintWriter writer = new PrintWriter(outputStream, true);
//designPatterns
        String req;
        while ((req = reader.readLine()) != null){
            Thread.sleep(1000);
            if ("ok".equals(req)){
                break;
            }
            writer.println("response:"+req);
        }
    }
}
