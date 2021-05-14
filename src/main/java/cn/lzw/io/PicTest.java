package cn.lzw.io;

import org.junit.Test;

import java.io.*;

/**
 * @author lzw
 * @version 2021/5/14 10:11
 *
 *          图片加密
 *          解密改一下文件的位置
 *          fis = new FileInputStream("se1.png");
 *             fos = new FileOutputStream("se.png");
 */
public class PicTest{

//    图片加密
    @Test
    public void test01(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try{
            fis = new FileInputStream("se1.png");
            fos = new FileOutputStream("se2.png");

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1){
                for( int i = 0;i < len ;i++ ){
                    bytes[i] = (byte)(bytes[i] ^5);
                }
                bos.write(bytes,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            if( bos != null ){
                try{
                    bos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if( bis != null ){
                try{
                    bis.close();
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
            if( fis != null ){
                try{
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }



}
