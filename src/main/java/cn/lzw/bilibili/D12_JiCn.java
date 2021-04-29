package cn.lzw.bilibili;

/**
 * @author： lzw
 * @date： 2020/12/2 10:43
 * @description：继承 方法覆写 向上转型（自动）父类实例化子类对象 、向下转型 （强制）子类实例化父类
 */
/*
class Channel1 extends Person{
    private String address;

    public String getAddress ( ) {
        return address;
    }

    public void setAddress ( String address ) {
        this.address = address;
    }
    public String getInfo ( ) {
        return "姓名：" + getName( ) + "\t" + "年龄：" + getAge( ) + "\t" + "地址：" + getAddress( );
    }
}
public class D12_JiCn {
    public static void main(String[] args){
     Channel1 Ch = new Channel1();
     Ch.setName("闫鑫");
     Ch.setAge( 100 );
     Ch.setAddress( "郑州" );
     System.out.println(Ch.getInfo());

    }
}
*/

/*class Channel{
    public void connect(){
        System.out.println("父类资源进行连接");
    }
}
class Channel2 extends Channel{
    public void connect(){
        super.connect();
        System.out.println("子类资源进行连接");
    }
}
public class D12_JiCn{
    public static void main(String[] args){
     Channel2  ch = new Channel2();
     ch.connect();

    }
}*/

class Dog {
    public void run ( ) {
        System.out.println( "颜狗正在奔跑！" );
    }
}

class Superdog extends Dog {
    public void fly ( ) {
        System.out.println( "颜狗飞上天了！" );
    }

    public void fire ( ) {
        System.out.println( "颜狗嘴里喷火了！" );
    }
}

public class D12_JiCn {
    public static void main ( String[] args ) {
        System.out.println( "颜狗现在是狗形态！" );
        Dog d = new Superdog( );
        d.run( );
        System.out.println( "发现了感兴趣的东西！变身" );
        Superdog s = ( Superdog ) d;
        s.fly( );
        s.fire( );
        System.out.println( "颜狗一顿操作吃到自己想吃的东西！" );
    }
}
