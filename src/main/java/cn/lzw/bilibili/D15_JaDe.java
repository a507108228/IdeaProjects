package cn.lzw.bilibili;

/**
 * @author： lzw
 * @date： 2020/12/9 17:08
 * @description：抽象类 定义构造方法
 */
/*
abstract class Message {
    private String type;

    public Message ( String type ) {
        this.type = type;
    }

    public abstract String getMessage ( );

    public String getType ( ) {
        return type;
    }

    public void setType ( String type ) {
        this.type = type;
    }
}

class A extends Message {

    public A ( String type ) {
        super( type );
    }

    public String getMessage ( ) {
        return "覆写父类方法" + super.getType( );
    }
}

public class D15_JaDe {
    public static void main ( String[] args ) {
        Message msg = new A( "傻逼了！" );
        System.out.println( msg.getMessage( ) );


    }
}
*/
/*
abstract class Action {
    private static final int Eat = 0;
    private static final int Study = 5;
    private static final int Work = 10;
    public void command(int code){
        switch ( code ) {
            case Eat:{
                this.eat();
                break;
            }
            case Study:{
                this.study();
                break;
            }
            case Work: {
                this.work();
                break;
            }
            case Eat + Study +Work: {
                this.eat();
                this.study();
                this.work();
                break;
            }
        }

    }
    public abstract void eat ();
    public abstract void study ();
    public abstract void work ();

}
class R extends Action {
    public void eat(){
        System.out.println("机器人不需要");
    }
    public void study() {
        System.out.println("智能机器人可以自主学习");
    }
    public void work() {
        System.out.println("机器人启动开始工作");
    }
}class H extends Action {
    public void eat(){
        System.out.println("人吃饭时不应该发出声音");
    }
    public void study() {
        System.out.println("人正在学习");
    }
    public void work() {
        System.out.println("人类开始工作");
    }
}class P extends Action {
    public void eat(){
        System.out.println("猪在食槽里吃饭呢");
    }
    public void study() {
        System.out.println("猪不会学习的");
    }
    public void work() {
        System.out.println("猪不需要工作");
    }
}
public class D15_JaDe{
    public static void main(String[] args){
        Action r = new R();
        Action h = new H();
        Action p = new P();

        System.out.println("机器行为——————");

        r.work();

        System.out.println("人类行为——————");
        h.work();

        System.out.println("猪的行为——————");

        p.work();


    }
}*/

