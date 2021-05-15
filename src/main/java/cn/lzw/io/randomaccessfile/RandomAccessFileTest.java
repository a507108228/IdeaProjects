package cn.lzw.io.randomaccessfile;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author lzw
 * @version 2021/5/15 10:52
 *
 * RandomAccessFile 既可以当输入流也可以当输出流
 * 如果RAF作为输出流时 文件不存在会自动创建
 * 如果文件存在会对原有内容从头覆盖
 *
 *
 */
public class RandomAccessFileTest{

    @Test
    public void test() throws IOException{
        RandomAccessFile raf1 = new RandomAccessFile(new File("ab.txt"),"r");
        RandomAccessFile raf2 = new RandomAccessFile(new File("wordcount.txt"),"rw");

        byte[] bytes = new byte[1024];
        int len;
        while ((len = raf1.read(bytes))!= -1){
            raf2.write(bytes,0,len);
        }
        raf2.close();
        raf1.close();

    }

    @Test
    public void test2() throws IOException{
        RandomAccessFile rw = new RandomAccessFile(new File("hello.txt"), "rw");

        rw.write("sabvjklas".getBytes());

        //    指定位置覆盖
        rw.seek(2);
        rw.write("jiujiuguiyi".getBytes());


        rw.close();
    }


    /**
     *实现上面覆盖的问题
     * 可以直接插入
     */
    @Test
    public void test3() throws IOException{

        RandomAccessFile rw = new RandomAccessFile(new File("hello.txt"), "rw");
        rw.seek(3);

        StringBuilder sb = new StringBuilder((int) new File("hello").length());
        byte[] bytes = new byte[1024];
        int len;
        while ((len = rw.read(bytes))!= -1){
            sb.append(new String(bytes,0,len));
        }

        rw.seek(3);
        rw.write("abcdegg".getBytes());

        rw.write(sb.toString().getBytes());

        rw.close();

    }
}
