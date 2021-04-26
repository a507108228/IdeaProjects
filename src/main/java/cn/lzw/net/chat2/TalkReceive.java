package cn.lzw.net.chat2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


/**
 * @author lzw
 * @version 2021/4/26 20:57
 */


public class TalkReceive implements Runnable{
    DatagramSocket dgS = null;
    private int port;
    private String msgFrom;

    public TalkReceive(int port, String msgFrom){
        this.port = port;
        this.msgFrom = msgFrom;
        try{
            dgS = new DatagramSocket(port);
        }catch (SocketException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run(){



        while (true) {
            try{
                //        准备接受包裹
                byte[] bytes = new byte[1024];

                DatagramPacket dgP = new DatagramPacket(bytes, 0, bytes.length);

//              阻塞式接收包裹
                dgS.receive(dgP);

                byte[] data = dgP.getData();
                String s = new String(data, 0, data.length);

                System.out.println(msgFrom + " " + s);



                if( s.equals("bye") ){
                    break;
                }

            }catch (IOException e){
                e.printStackTrace();
            }

        }
//         断开连接
        dgS.close();

    }
}
