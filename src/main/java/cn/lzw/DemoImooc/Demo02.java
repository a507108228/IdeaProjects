package cn.lzw.DemoImooc;

/**
 * @author lzw
 * @date 2020/9/5 18:00
 * @description 九九乘法表打印输出
 */
public class Demo02 {
    public static void main(String[] args){

        for(int c =1;c<=9;c++){

            for(int d =1; d<=c; d++){

                System.out.print(c + "*" + d + "=" + c*d + "\t");

            }

            System.out.println();

        }

    }
}
