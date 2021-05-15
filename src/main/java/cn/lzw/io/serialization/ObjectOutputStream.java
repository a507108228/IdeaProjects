package cn.lzw.io.serialization;

import org.junit.Test;
import java.io.*;

/**
 * @author lzw
 * @version 2021/5/15 8:37
 */
public class ObjectOutputStream{

    @Test
    public void test1(){
        java.io.ObjectOutputStream oos = null;
        try{
             oos = new java.io.ObjectOutputStream(new FileOutputStream("abc.dat"));
            oos.writeObject(new String("jiujiuguiyi"));
            oos.flush();
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            if( oos != null ){
                try{
                    oos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void ftest() throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream( new FileInputStream("abc.dat"));
        Object o = ois.readObject();
        String s = (String) o;

        System.out.println(s);

        ois.close();

    }

    @Test
    public void test(){
        java.io.ObjectOutputStream oos = null;

        try {
            //1.
            oos = new java.io.ObjectOutputStream(new FileOutputStream("object.dat"));
            //2.
            oos.writeObject(new String("我爱北京天安门"));
            oos.flush();//刷新操作

            oos.writeObject(new Person("王铭",23));
            oos.flush();

            oos.writeObject(new Person("张学良",23,1001,new Account(5000)));
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos != null){
                //3.
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    /*
反序列化：将磁盘文件中的对象还原为内存中的一个java对象
使用ObjectInputStream来实现
 */
    @Test
    public void testObjectInputStream(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));

            Object obj = ois.readObject();
            String str = (String) obj;

            Person p = (Person) ois.readObject();
            Person p1 = (Person) ois.readObject();

            System.out.println(str);
            System.out.println(p);
            System.out.println(p1);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
    @Test
    public void testStringBuffer(){
        StringBuffer sb = new StringBuffer(10);
        sb.append("abcdefg..");
        System.out.println(sb);

        sb.insert(5,"abc");
        System.out.println(sb);

        sb.delete(0,3);
        System.out.println(sb);


        // System.out.println(sb.reverse());

        sb.replace(5,9,"99gy1");
        System.out.println(sb);
    }

}
