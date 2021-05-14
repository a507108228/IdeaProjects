package cn.lzw.io;

import org.junit.Test;

import java.io.*;

/**
 * @author lzw
 * @version 2021/5/14 15:53
 * 解码操作 字节的输入流到字符的输入流
 */
public class InputStreamReaderTest{
    @Test
    public void test() throws IOException{
        FileInputStream fis = new FileInputStream("ab.txt");

        InputStreamReader isR = new InputStreamReader(fis, "UTF-8");

        char[] bytes = new char[1024];
        int len;
        while ((len = isR.read(bytes)) != -1) {
            String str = new String(bytes, 0, len);
            System.out.println(str);
        }
        isR.close();
        fis.close();
    }

    /**
     * 转换流的综合运用
     */
    @Test
    public void test2() throws IOException{
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("ab.txt");
        FileOutputStream fos = new FileOutputStream("ab2.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);


        InputStreamReader isr = new InputStreamReader(bis, "utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(bos, "utf-8");

        char[] chars = new char[5];
        int len;
        while ((len = isr.read(chars)) != -1){
            osw.write(chars,0,len);
        }
        osw.close();
        isr.close();
        bos.close();
        bis.close();
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println("花费时间为：" + (end-start)+"ms");
    }
}
