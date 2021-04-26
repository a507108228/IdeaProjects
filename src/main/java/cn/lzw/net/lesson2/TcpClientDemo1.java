package cn.lzw.net.lesson2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;


/**
 * @author lzw
 * @version 2021/4/25 18:14
 *
 *          客户端
 */
public class TcpClientDemo1{
    public static void main(String[] args){

        Socket socket = null;

        OutputStream outputStream = null;
        try{
//            服务器的地址 端口号
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            int port = 9999;
//            创建一个socket连接
            socket = new Socket(serverIP,port);
//            发送消息IO流
            outputStream = socket.getOutputStream();
            outputStream.write("你好,网络编程".getBytes());

        }catch (java.io.IOException e){
            e.printStackTrace();
        }finally {
            if( outputStream != null ){
                try{
                    outputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }


            if( socket != null ){
                try{
                    socket.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }


        }
    }
}
