package cn.lzw.net.lesson4;


import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author lzw
 * @version 2021/4/25 21:55
 */
public class UdpServerDemo{
    public static void main(String[] args) throws Exception{
//      开放端口
        DatagramSocket dgS = new DatagramSocket(9090);

//      接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dgP = new DatagramPacket(bytes, 0, bytes.length);

        dgS.receive(dgP);//阻塞接收

        System.out.println(dgP.getAddress().getHostAddress());
        System.out.println(new String(dgP.getData(), 0, dgP.getLength()));
//      关闭连接
        dgS.close();

    }
}
