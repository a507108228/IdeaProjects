package cn.lzw.net.lesson3;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lzw
 * @version 2021/4/25 19:50
 */
public class TcpServerDemo2{
    public static void main(String[] args) throws Exception{
//        创建端口 服务
        ServerSocket serverSocket = new ServerSocket(9000);

//        监听客户端的连接
        Socket accept = serverSocket.accept();

//         获取输入流
        InputStream inputStream = accept.getInputStream();

//        文件输出
        FileOutputStream fileOutputStream = new FileOutputStream("receive.pdf");

        byte[] bytes = new byte[1024];
        int len;
        while ((len=inputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,len);
        }

//        通知客户端已经接收完毕
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("接收完毕可以断开".getBytes());


        outputStream.close();
        fileOutputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();

    }
}
