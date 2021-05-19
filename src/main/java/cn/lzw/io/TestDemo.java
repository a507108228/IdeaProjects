package cn.lzw.io;

import java.io.*;

/**
 * @author lzw
 * @version 2021/5/19 18:20
 */
public class TestDemo{
    public static void main (String[] args) throws IOException{
        File file = new File("ace.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.getAbsolutePath());

        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter("lol.txt"));

        char[] chars = new char[1024];
        int len;
        while ((len = br.read(chars)) != -1){
            bw.write(chars,0,len);
        }

        bw.close();
        br.close();


    }
}
