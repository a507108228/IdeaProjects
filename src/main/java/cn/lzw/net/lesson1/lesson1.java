package cn.lzw.net.lesson1;


import java.net.InetAddress;
import java.net.UnknownHostException;


/**
 * @author lzw
 * @version 2021/4/25 16:37
 *              测试IP
 *
 *       1www.baidu.com/110.242.68.3
 *       2[Ljava.net.InetAddress;@5e2de80c
 *       3localhost/127.0.0.1
 *       4李梓玮/192.168.42.122
 *       5百度/192.168.0.1
 */
public class lesson1{
    public static void main(String[] args){

        byte[] bytes = {(byte) 192, (byte) 168, 0, 1};
        try{
            InetAddress byName = InetAddress.getByName("www.baidu.com");
            System.out.println("1" + byName);

            InetAddress[] allByName = InetAddress.getAllByName("李梓玮");
            System.out.println("2" + allByName);

            //        返回回送地址
            System.out.println("3" + InetAddress.getLoopbackAddress());

            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("4" + localHost);

            InetAddress byAddress = InetAddress.getByAddress("百度", bytes);
            System.out.println("5" + byAddress);

        }catch (UnknownHostException e){
            e.printStackTrace();
        }





    }
}
