package cn.lzw.imook;

/**
 * @author lzw
 * @date 2020/9/16 10:37
 * @description 成员内部类
 */
public class Demo05 {
    private String name = "李梓玮";
    int age = 22;
    String sex = "男";

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public class Inner{
        String name = "爱学习";
        public void show(){
            System.out.println("调用外部类："+Demo05.this.name+"\t"+Demo05.this.sex+"\t"+Demo05.this.age);
            System.out.println("调用内部类："+ name);
        }

    }
    public static void main(String[] args){
     Demo05 D = new Demo05 ();
     D.setName ( "闫鑫" );
     Inner in = D.new Inner ();
     in.show ();

    }

}
