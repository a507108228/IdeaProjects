package cn.lzw.bilibili;

/**
 * @author： lzw
 * @date： 2020/11/17 15:46
 * @description： this 用法
 */
/*class Person{
    private String name;
    private int age;
    public Person(){
        System.out.println("新的对象实例化了！");
    }
*//*    public Person(String name){
        this();
        this.name=name;
    }*//*
    public Person(String name ,int age){
        this();
        this.name = name;
        this.age = age;
    }
    public void tell(){
        System.out.println("姓名："+this.name+"\n"+"年龄："+this.age);
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
}
public class Day05_this {
    public static void main(String[] args){
     Person per = new Person ( "闫鑫",20 );
     per.tell ();
    }
}*/
/*class Emp{
    private long empno;
    private String ename;
    private String dept;
    private double salary;
    *//*public Emp(){
        this(1000,"无名氏",null, 0.0);
    }
    public Emp(long empno){
        this(empno,"新员工",null, 0.0);
    }
    public Emp(long empno,String ename,String dept){
        this(empno,ename,dept,2500.00);
    }*//*
    public Emp(long empno,String ename,String dept,double salary){
        this.empno=empno;
        this.ename=ename;
        this.dept=dept;
        this.salary=salary;
    }

    public long getEmpno ( ) {
        return empno;
    }

    public void setEmpno ( long empno ) {
        this.empno = empno;
    }

    public String getEname ( ) {
        return ename;
    }

    public void setEname ( String ename ) {
        this.ename = ename;
    }

    public String getDept ( ) {
        return dept;
    }

    public void setDept ( String dept ) {
        this.dept = dept;
    }

    public double getSalary ( ) {
        return salary;
    }

    public void setSalary ( double salary ) {
        this.salary = salary;
    }
    public String getInfo(){
        return "编号:"+this.empno+"\n"+ "名字:"+this.ename+"\n"+ "部门:"+this.dept+ "\n"+"工资:"+this.salary;
    }
}
    public class Day05_this {
      public static void main(String[] args){
            Emp per = new Emp ( 0223,"李梓玮","无敌门",1000000 );
            System.out.println(per.getInfo ());
        }
}*/
/*class Message{
    public void printThis(){
        System.out.println("【Message类】this"+this);
    }
}
public class Day05_this{
    public static void main(String[] args){
     Message msgA = new Message ();
     System.out.println("【主类】msg="+msgA);
     msgA.printThis ();
     Message msgB = new Message ();
     System.out.println("【主类】msg="+msgB);
     msgB.printThis ();
    }
}*/
/*
class Emp{
    private long enopt;
    private String ename;
    private String dept;



    public Emp ( long enopt , String ename , String dept ) {
        this.enopt = enopt;
        this.ename = ename;
        this.dept = dept;
    }

    public long getEnopt ( ) {
        return enopt;
    }

    public void setEnopt ( long enopt ) {
        this.enopt = enopt;
    }

    public String getEname ( ) {
        return ename;
    }

    public void setEname ( String ename ) {
        this.ename = ename;
    }

    public String getDept ( ) {
        return dept;
    }

    public void setDept ( String dept ) {
        this.dept = dept;
    }
    public void getInfo(){
        System.out.println("部门编号："+this.enopt+"\n"+"部门信息:"+this.ename+"\n"+"部门名称:"+this.dept);
    }
}
public class Day05_this{
    public static void main(String[] args){
        Emp e =new Emp ( 223,"技术部","闫鑫是二狗" );
        e.getInfo ();
    }
}*/
class Address{
    private String Aguojia;
    private String Ashengfeng;
    private String Acity;
    private String Ajiedao;
    private int Ayoubian;
    public Address(String Aguojia,String Ashengfeng,String Acity,int Ayoubian){
        this.Aguojia = Aguojia;
        this.Ashengfeng = Ashengfeng;
        this.Acity = Acity;
        this.Ajiedao = Acity;
        this.Ayoubian = Ayoubian;
    }

    public String getAguojia ( ) {
        return Aguojia;
    }

    public void setAguojia ( String aguojia ) {
        Aguojia = aguojia;
    }

    public String getAshengfeng ( ) {
        return Ashengfeng;
    }

    public void setAshengfeng ( String ashengfeng ) {
        Ashengfeng = ashengfeng;
    }

    public String getAcity ( ) {
        return Acity;
    }

    public void setAcity ( String acity ) {
        Acity = acity;
    }

    public String getAjiedao ( ) {
        return Ajiedao;
    }

    public void setAjiedao ( String ajiedao ) {
        Ajiedao = ajiedao;
    }

    public int getAyoubian ( ) {
        return Ayoubian;
    }

    public void setAyoubian ( int ayoubian ) {
        Ayoubian = ayoubian;
    }
    public void getInfo(){
        System.out.println("国家："+this.Aguojia+"\n"+"省份："+this.Ashengfeng+"\n"+"城市："+this.Acity+"\n"+"街道："+this.Ajiedao+"\n"+"邮编："+this.Ayoubian+"\n");
    }
}
public class Day05_this {
    public static void main ( String[] args ) {
        Address ad = new Address ( "中国","河南","郑州",023456);
        ad.getInfo ();
        ad.setAguojia ( "俄罗斯" );
        ad.getInfo ();
    }
}