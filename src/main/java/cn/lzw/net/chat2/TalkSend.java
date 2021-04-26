package cn.lzw.net.chat2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;


/**
 * @author lzw
 * @version 2021/4/26 20:44
 */

public class TalkSend implements Runnable{

    DatagramSocket dgS = null;
    BufferedReader bR = null;

    private int fromPort;
    private String toIP;
    private int toPort;

    public TalkSend(int fromPort, String toIP, int toPort){
        this.fromPort = fromPort;
        this.toIP = toIP;
        this.toPort = toPort;

        try{
            dgS = new DatagramSocket(fromPort);
            bR = new BufferedReader(new InputStreamReader(System.in));

        }catch (SocketException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run(){

        while (true) {

            try{
               String s = bR.readLine();

                byte[] bytes = s.getBytes();

                DatagramPacket dgP = new DatagramPacket(bytes, 0, bytes.length, new InetSocketAddress("this.toIP", this.toPort));

                dgS.send(dgP);

                if( s.equals("bye") ){
                    break;
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        dgS.close();
    }
}


