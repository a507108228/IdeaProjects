package cn.lzw.net.Download;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * @author lzw
 * @version 2021/4/27 9:13
 *
 *          url 下载资源
 *
 */
public class UrlDemo{
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://m10.music.126.net/20210427095451/d9fe516b3a381a028aba8f1fe684961b/ymusic/005c/0258/0609/76f2abc134527626539a1c4f93cdfdc1.mp3");

        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        InputStream inputStream = urlConnection.getInputStream();

        FileOutputStream foS = new FileOutputStream("76f2abc134527626539a1c4f93cdfdc1.mp3");

        byte[] bytes = new byte[1024];

        int len;

        while ((len=inputStream.read(bytes))!=-1){
            foS.write(bytes,0,len);//写出数据

        }

        foS.close();
        inputStream.close();
        urlConnection.disconnect();


    }
}
