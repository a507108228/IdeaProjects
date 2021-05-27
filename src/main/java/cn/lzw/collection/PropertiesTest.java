package cn.lzw.collection;

import java.io.FileInputStream;

import java.util.Properties;

/**
 * @author lzw
 * @version 2021/5/22 17:27
 */
public class PropertiesTest{
    public static void main (String[] args) throws Exception{
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("jdbc.properties");
        //    加载流对应的文件
        properties.load(fis);
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        System.out.println("account:"+user+"---"+"password:"+password);
    }
}
