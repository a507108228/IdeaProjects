package cn.lzw.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author lzw
 * @version 2021/5/14 17:40
 * 键盘录入 统计字符出现的次数
 */

class Test{


}

public class TestSystemIn{
    public static void main(String[] args) throws IOException{

        HashMap<Character, Integer> map = new HashMap<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("请在输入完毕后按下Enter键：");
        while (true) {

            String data = br.readLine();
            if( "e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data) ){
                System.out.println("程序结束");
                break;
            }
            for( int i = 0;i < data.length();i++ ){
                char ch = data.charAt(i);
                if( map.containsKey(ch) ){
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
        }
        System.out.println(map);
        br.close();
        isr.close();
    }
}