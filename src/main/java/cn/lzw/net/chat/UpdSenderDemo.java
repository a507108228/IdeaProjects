package cn.lzw.net.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * @author lzw
 * @version 2021/4/26 19:25
 */
public class UpdSenderDemo{
    public static void main(String[] args) throws Exception{
        DatagramSocket dgS = new DatagramSocket(1111);

        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = bR.readLine();

            byte[] bytes = s.getBytes();

            DatagramPacket dgP = new DatagramPacket(bytes, 0, bytes.length, new InetSocketAddress("localhost", 2222));

            dgS.send(dgP);

            if( s.equals("bye") ){
                break;
            }
        }
        dgS.close();
    }
}
