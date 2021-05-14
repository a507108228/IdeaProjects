package cn.lzw.io;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author lzw
 * @version 2021/5/14 10:42
 *
 *      统计文本内容 字符出现的次数
 */
public class WordCount1{

    @Test
    public void testWordCount1(){

        FileReader fir = null;
        BufferedWriter br = null;
        try{
            Map<Character,Integer> map = new HashMap<>();
            fir = new FileReader("ab.txt");

            int c = 0;
            while(( c = fir.read()) != -1 ){
                char ch = (char) c;

                if(map.get(ch) == null){
                    map.put(ch,1);
                }else {
                    map.put(ch,map.get(ch) + 1);
                }
            }

            br = new BufferedWriter(new FileWriter("wordcount1"));
            Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
            for( Map.Entry<Character,Integer> entry: entrySet
                  ){
                switch (entry.getKey()){
                    case ' ':
                        br.write("空格 = "+entry.getValue());
                        break;
                    case '\t':
                        br.write("Tab = "+entry.getValue());
                        break;
                    case '\r':
                        br.write("回车 = "+entry.getValue());
                        break;
                    case '\n':
                        br.write("换行 = "+entry.getValue());
                        break;
                    default:
                        br.write(entry.getKey()+" = "+entry.getValue());
                        break;
                }
                br.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            if( br != null ){
                try{
                    br.close();
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
        }

    }

    @Test
    public void testWordCount2(){
        FileReader fr = null;
        BufferedWriter br = null;
        try{
            HashMap<Character, Integer> map = new HashMap<>();
            fr = new FileReader("ab.txt");

            int c = 0;
            while ((c = fr.read()) != -1){
                char ch = (char) c;

                if( map.get(ch) == null ){
                    map.put(ch,1);
                }else {
                    map.put(ch,map.get(ch) + 1);
                }
            }
            br = new BufferedWriter(new FileWriter("wcount"));

            Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
            for( Map.Entry<Character, Integer> entry: entrySet){
                switch (entry.getKey()){
                    case ' ':
                        br.write("空格 = "+entry.getValue());
                        break;
                    case '\n':
                        br.write("换行 = "+entry.getValue());
                        break;
                    case '\r':
                        br.write("回车 = "+entry.getValue());
                        break;
                    case '\t':
                        br.write("Tab = "+entry.getValue());
                        break;
                    default:
                        br.write(entry.getKey()+" = "+entry.getValue());
                        break;
                }
                br.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            if( br != null ){
                try{
                    br.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if( fr != null ){
                try{
                    fr.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
