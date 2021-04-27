package cn.lzw.net.Download;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;


/**
 * @author lzw
 * @version 2021/4/27 9:13
 *
 *          url 下载资源
 *
 */
public class UrlDemo{
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://p1.music.126.net/B61rfX98f8o71T7vujO1jg==/109951165479571915.jpg?param=50y50");

        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        InputStream inputStream = urlConnection.getInputStream();

        FileOutputStream foS = new FileOutputStream("109951165479571915.jpg");

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
