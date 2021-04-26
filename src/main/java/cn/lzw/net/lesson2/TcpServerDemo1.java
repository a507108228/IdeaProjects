package cn.lzw.net.lesson2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lzw
 * @version 2021/4/25 18:14
 *
 *          服务端
 */

public class TcpServerDemo1{
    public static void main(String[] args){

        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        ByteArrayOutputStream bA = null;
        byte[] bytes = null;

        try{
//            先有一个地址
            serverSocket = new ServerSocket(9999);
            while (true) {
//            等待客户端连接进来
                socket = serverSocket.accept();
//             读取客户端的消息
                inputStream = socket.getInputStream();

                bA = new ByteArrayOutputStream();

//            管道流
                bytes = new byte[1024];
                int len;
                while ((len = inputStream.read(bytes)) != -1) {
                    bA.write(bytes, 0, len);
                }

                System.out.println(bA.toString());

            }

        }catch (IOException e){
            e.printStackTrace();
        } finally {
            if( bA != null ){
                try{
                    bA.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

            if( inputStream != null ){
                try{
                    inputStream.close();
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

            if( serverSocket != null ){
                try{
                    serverSocket.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }


        }
    }
}
