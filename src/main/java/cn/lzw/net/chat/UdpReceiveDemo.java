package cn.lzw.net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author lzw
 * @version 2021/4/26 19:26
 */
public class UdpReceiveDemo{
    public static void main(String[] args) throws Exception{
        DatagramSocket dgS = new DatagramSocket(2222);

//        准备接受包裹
        byte[] bytes = new byte[1024];
        while (true) {
            DatagramPacket dgP = new DatagramPacket(bytes, 0, bytes.length);
            
//            断开连接
            byte[] data = dgP.getData();
            String s = new String(data, 0, data.length);

            System.out.println(s);
            if( s.equals("bye") ){
                break;
            }

//            阻塞式接收包裹
            dgS.receive(dgP);

        }
        dgS.close();
    }
}
