package cn.lzw.net.lesson4;

import java.net.*;

/**
 * @author lzw
 * @version 2021/4/25 21:55
 */
public class UdpClientDemo{
    public static void main(String[] args) throws Exception{

//        建立socket
        DatagramSocket dgS = new DatagramSocket();

//        建个包
        String msg = "你好啊 未来的你！";

//        发送对象
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9090;

//        数据 数据的长度 发送对象
        DatagramPacket dgP = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, localhost, port);

//        发送包
        dgS.send(dgP);

//        关闭流
        dgS.close();
    }
}
