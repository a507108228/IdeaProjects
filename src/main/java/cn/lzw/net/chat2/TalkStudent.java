package cn.lzw.net.chat2;

/**
 * @author lzw
 * @version 2021/4/26 22:36
 */
public class TalkStudent{
    public static void main(String[] args){
        new Thread(new TalkSend(5555,"localhost",9999)).start();
        new Thread(new TalkReceive(8888,"老师")).start();
    }
}
