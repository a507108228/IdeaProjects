package cn.lzw.BiLiBiLi;

/**
 * @author： lzw
 * @date： 2020/11/16 16:34
 * @description：类之间相互引用 this用法
 */
/*class Message{
    private String info;
    public Message(String tempInfo){
        info = tempInfo;
    }

    public String getInfo ( ) {
        return info;
    }

    public void setInfo ( String info ) {
        this.info = info;
    }

}
class Person{
    private String name;
    private int age;

    public Person(Message msg,int tempAge){
        name = msg.getInfo ();
        age = tempAge;
    }
    public Message getMessage(){
        return new Message ( "姓名："+name+"\t"+"年龄："+age );
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getAge ( ) {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public void tell(){
        System.out.println("姓名："+name+"\t"+"年龄："+age);
    }

}
public class Day04_XHYY {
    public static void main(String[] args){

         Message msg = new Message ( "喃喃" );
         Person per = new Person ( msg,12);
         per.tell ();
         msg = per.getMessage ();
         System.out.println(msg.getInfo ());
         per.setName ( "闫鑫啦！" );
         per.setAge ( 18 );
         per.tell ();
         msg.setInfo ( "shagou" );
         System.out.println(msg.getInfo ());

    }
}*/

/*
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getAge ( ) {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }
    public void tell(){
        System.out.println("姓名："+this.name+"\n"+"年龄："+this.age);
    }
}
public class Day04_XHYY{
    public static void main(String[] args){
     Person per = new Person ( "月光",12 );
     per.tell ();

    }
}*/
/*class Person{
    private String name;
    private int age;

    public Person ( String name , int age ) {
        this.name = name;
        this.age = age;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getAge ( ) {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }
    public void tell(){
        System.out.println("姓名："+this.name+"\n"+"年龄："+this.age);
    }
}
    public class Day04_XHYY{
    public static void main(String[] args){
     Person per = new Person("喃喃",2);
     per.tell ();


    }

    }*/
