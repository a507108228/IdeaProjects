package cn.lzw.BiLiBiLi;

/**
 * @author： lzw
 * @date： 2020/11/6 12:55
 * @description：
 */
public class day02 {
    private String name = "李梓玮";
    String sex = "男";
    int age = 22;

    public String getName(){
        return name ;
    }
    public void setName(String name){
        this.name =name;
    }
    public class inner {
        String name = "爱学习";

        public void show ( ) {

            System.out.println ( "调用外部类："+day02.this.name+"\t" );
            System.out.println("调用内部类："+name);
        }
    }
    public static void main(String[] args){
        day02 d = new day02 ();
        d.setName ( "闫狗" );
        inner in = d.new inner ();
        in.show ();
        System.out.println("年龄为："+d.age+"\n"+"性别为："+d.sex);


    }
}
