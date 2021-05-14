package cn.lzw.io;

import org.junit.Test;

import java.io.*;

/**
 * @author lzw
 * @version 2021/5/10 20:18
 */
public class IoTest{
    public static void main(String[] args) {
        File file = new File("ab.txt");
        System.out.println(file.getAbsolutePath());
    }

    /**
     *  有缓冲流的方式 用FileReader读取文件内容
     *  用时1ms
     */
    @Test
    public void Test01() throws IOException{
        long start = System.currentTimeMillis();
        File srcfile = new File("ab.txt");
        File destfile = new File("ab2.txt");

        FileReader fir = new FileReader(srcfile);
        FileWriter fiw = new FileWriter(destfile);

        BufferedReader brs = new BufferedReader(fir);
        BufferedWriter bws = new BufferedWriter(fiw);

        char[] chars = new char[5];
        int len;
        while ((len = brs.read(chars)) != -1){
            bws.write(chars,0,len);
        }

        if( bws != null ){
            try{
                bws.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if( brs != null ){
            try{
                brs.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if( fiw != null ){
            try{
                fiw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if( fir != null ){
            try{
                fir.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("复制花费的时间："+(end-start));
    }
    /**
     *  无缓冲流 File Reader读取文件内容
     *  用时4ms
     */
    @Test
    public void Test02() throws IOException{
        long start = System.currentTimeMillis();
        File srcfile = new File("ab.txt");
        File destfile = new File("ab2.txt");

        FileReader fir = new FileReader(srcfile);
        FileWriter fiw = new FileWriter(destfile);

        char[] chars = new char[5];
        int len;
        while ((len = fir.read(chars)) != -1){
            fiw.write(chars,0,len);
        }

               if( fiw != null ){
            try{
                fiw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if( fir != null ){
            try{
                fir.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("复制花费的时间："+(end-start));
    }
    /**
     *  复制图片  有缓冲流用时2ms
     *              缓冲区     提高读写速度  读完一次写出
     */
    @Test
    public void BufferedStreamTest() throws IOException{
        long start = System.currentTimeMillis();
        File srcfile = new File("se.png");
        File destfile = new File("se1.png");

        FileInputStream fis = new FileInputStream(srcfile);
        FileOutputStream fos = new FileOutputStream(destfile);

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        if( bis != null ){
            try{
                bis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if( bos != null ){
            try{
                bos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if( fis != null ){
            try{
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if( fos != null ){
            try{
                fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("复制花费的时间："+(end-start));
    }

    /**
     *  没有缓冲流用时3ms
     */
    @Test
    public void streamTest() throws IOException{
        long start = System.currentTimeMillis();
        File srcfile = new File("se.png");
        File destfile = new File("se1.png");

        FileInputStream fis = new FileInputStream(srcfile);
        FileOutputStream fos = new FileOutputStream(destfile);

        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        if( fis != null ){
            try{
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if( fos != null ){
            try{
                fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }


        long end = System.currentTimeMillis();
        System.out.println("复制花费的时间："+(end-start));

    }




}
