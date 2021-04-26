package cn.lzw.net.chat2;

/**
 * @author lzw
 * @version 2021/4/26 22:38
 */
public class TalkTeacher{
    public static void main(String[] args){
        new Thread(new TalkSend(7777,"localhost",8888)).start();
        new Thread(new TalkReceive(9999,"学生") ).start();
    }
}
