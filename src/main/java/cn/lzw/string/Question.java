package cn.lzw.string;



/**
 * @author lzw
 * @version 2021/5/18 18:07
 *
 *          基本数据类型传的是数据 引用数据类型传的地址值
 * 第一次运行： good
 *              best
 *
 * 第二次运行： good
 *              best
 *
 */

/*class AB{

    String s1 = new String("good");
    char[] chars = new char[]{'t','e','s','t'};

    public void change(String s1 , char chars[]){  // String 不可变 数组可以变
        s1 = "test ok";
        chars[0] = 'b';
    }

}*/
public class Question{

    String s1 = new String("good");
    char[] chars = new char[]{'t','e','s','t'};

    public void change(String s1 , char chars[]){
        s1 = "test ok";
        chars[0] = 'b';
    }
    public static void main (String[] args){
/*        AB ab = new AB();
        ab.change(ab.s1,ab.chars);

        System.out.println(ab.s1);
        System.out.println(ab.chars);*/

        Question q = new Question();
        q.change(q.s1,q.chars);

        System.out.println(q.s1);
        System.out.println(q.chars);

    }
}
