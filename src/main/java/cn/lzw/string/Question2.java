package cn.lzw.string;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author lzw
 * @version 2021/5/19 19:20
 * <p>
 * 题目一：调用方法删除 字符串的空格 两端
 */
class A{
    String s1;
    public void delete (String s1){

        if( s1.replaceAll("^ | $", "") != null ){
            System.out.println(s1.replaceAll("^ | $", ""));

        }
    }
}

class B{
    String s;
    int start;
    int end;
    char temp;
    public void reserve(String s , int start , int end){
        if( s != null ){
            char[] chars = s.toCharArray();
            for( int i = start, j = end; i< j ;i++,j-- ){
                temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
            for( char data:chars
                  ){
                System.out.print(data);

            }
        }
    }
}

class C{
    String mainStr;
    String subStr;

    public void text (String mainStr, String subStr){
        if( mainStr.length() >= subStr.length() ){
            int count = 0;
            int index = 0;
            while ((index = mainStr.indexOf(subStr, index)) != -1) {
                index += subStr.length();
                count++;
            }
            System.out.println(count);
        }else {
            System.out.println("无匹配项！");
        }
    }
}


public class Question2{
    public static void main (String[] args){
        A a = new A();
        System.out.println("please input the word: ");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();

            if( "e".equalsIgnoreCase(s) || "exit".equalsIgnoreCase(s) ){
                System.out.println("程序结束");
                break;
            }
            a.delete(s);
        }

        scanner.close();
    }


    @Test
    public void test02(){
        String string = "abcdefg";
        B b = new B();
        b.reserve(string,2,5);
    }

    @Test
    public void test03(){
        C c = new C();
        String s = "fjlkasdjfkl;sadjfla;sdjf,sd,fkjla;sdfjsd,fjdsddddlsd";
        String s2 = "sd";
        c.text(s,s2);
    }


}
