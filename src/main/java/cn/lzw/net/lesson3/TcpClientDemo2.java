package cn.lzw.net.lesson3;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author lzw
 * @version 2021/4/25 19:50
 */
public class TcpClientDemo2{
    public static void main(String[] args) throws Exception{

//        创建一个socket连接
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9000);

//        创建一个输出流
        OutputStream outputStream = socket.getOutputStream();

//        读取文件
        FileInputStream fileInputStream = new FileInputStream(new File("D:\\Teaching\\Idea\\IdeaProjects\\src\\main\\resources\\路线.pdf"));

//        写出文件
        byte[] bytes = new byte[1024];
        int len;
        while ((len=fileInputStream.read(bytes))!= -1){
            outputStream.write(bytes,0,len);
        }

//        通知服务器 已经结束 传输完了
        socket.shutdownOutput();

//        确认服务器接收完毕 才断开连接
        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        byte[] bytes1 = new byte[1024];
        while ((len=inputStream.read(bytes1))!= -1){
            byteArrayOutputStream.write(bytes1,0,len);
        }
        System.out.println(byteArrayOutputStream.toString());


//        关闭资源
        byteArrayOutputStream.close();
        inputStream.close();
        fileInputStream.close();
        outputStream.close();
        socket.close();



    }
}
