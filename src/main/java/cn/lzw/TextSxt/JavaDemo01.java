package cn.lzw.TextSxt;

/**
 * @author lzw
 * @date 2020/9/20 12:30
 * @description
 */
public class JavaDemo01 {
    public static void main(String[] args){
     String result = payAndGet(20.0);
     System.out.println(result);
     System.out.println(payAndGet(1.0));

    }
    public static String payAndGet(double money){
        if ( money>= 10.0 ){
            return "购买找零： "+ (money-10);
        }else {
            return "对不起 余额不够";
        }

    }
}
