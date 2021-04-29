package cn.lzw.bilibili;

/**
 * @author： lzw
 * @date： 2020/11/25 15:42
 * @description：部分数组内容复制 对象数组
 */
/*
class ArrUti{
    public static void printArrUti(int temp[]){
        for(int i=0;i<temp.length;i++) {
            System.out.println(temp[i]); //打印输出数组
        }
    }
}
public class D10_ArrUti {
    public static void main(String[] args){
     int dataA [] = {5,10,15,20,25,30,35};
     int dataB [] = {1,2,3,4,5,6,7,8};
        System.arraycopy( dataA,3,dataB,4,4); 复制数组  起始 3 目标 4   复制长度4
        ArrayUtil.printArray( dataB );
    }
}
*/

/*
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age = age;
    }

    public void getInfo(){
        System.out.println("姓名："+this.name+"\t"+"年龄："+this.age);
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public String getName ( ) {
        return name;
    }

    public int getAge ( ) {
        return age;
    }
}
public class D10_ArrUti{
    public static void main(String[] args){
        Person per [] = new Person[6];          //对象数组动态初始化
        per [0] = new Person( "闫鑫",20 );
        per [1] = new Person( "马路",22 );
        per [2] = new Person( "张岭",20 );
        per [3] = new Person( "王豪铂",20 );
        per [4] = new Person( "李梓玮",23 );
        per [5] = new Person( "韩方涛",21 );
        for(int x = 0;x<per.length; x++){
            per[x].getInfo();
        }
    }

        }
*/

/*
class Car {
    private String name;
    private double price;
    private Person person;

    public Car ( String name , double price ) {
        this.name = name;
        this.price = price;
    }


    public Person getPerson ( ) {
        return this.person;
    }

    public void setPerson ( Person person ) {
        this.person = person;
    }

    public String getInfo ( ) {
        return "汽车品牌型号：" + this.name + "\t" + "汽车价格：" + this.price;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public double getPrice ( ) {
        return price;
    }

    public void setPrice ( double price ) {
        this.price = price;
    }
}

class Person {
    private String name;
    private int age;
    private Car car;

    public Person ( String name , int age ) {
        this.name = name;
        this.age = age;
    }


    public Car getCar ( ) {
        return this.car;
    }

    public void setCar ( Car car ) {
        this.car = car;
    }


    public String getInfo ( ) {
        return "姓名：" + this.name + "\t" + "年龄：" + this.age;
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

public class D10_ArrUti {
    public static void main ( String[] args ) {
        Person per = new Person( "李梓玮" , 23 );
        Car car = new Car( "宝马 X5" , 560000 );
        per.setCar( car );
        car.setPerson( per );
        System.out.println( per.getCar( ).getInfo( ) );
        System.out.println( car.getPerson( ).getInfo( ) );
    }
}*/
