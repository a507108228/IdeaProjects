package cn.lzw.TextSxt;

import java.util.Date;

public class TextData {
    public static void main (String[] args){
        Date d = new Date ();
        System.out.println(d);

        System.out.println(d.getTime ());

        Date d1 = new Date ();
        System.out.println(d1.getTime ());
        System.out.println(d1.after (d));

    }
}
