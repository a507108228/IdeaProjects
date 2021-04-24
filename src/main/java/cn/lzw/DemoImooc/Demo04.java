package cn.lzw.DemoImooc;

/**
 * @author lzw
 * @date 2020/9/13 17:59
 * @description 静态方法
 */
public class Demo04 {
    static int score1 = 86;
    static int score2 = 92;

    public static int sum(){

        return score1 + score2;

    }

    public static void main(String[] args){
        Demo04 hello = new Demo04 ();
        /*int allscore = hello.sum ();
        System.out.println("总分："+allscore);*/
        System.out.println("总分："+hello.sum ());

    }

}
