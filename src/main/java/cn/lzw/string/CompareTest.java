package cn.lzw.string;

import org.junit.Test;


import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lzw
 * @version 2021/5/21 8:59
 * 1. java中的对象 正常情况下只能进行== ！=的操作 不能用> <
 * 所以出现了comparable comparator两个接口
 * <p>
 * 2. 对于实现自定义类的排序 需要实现comparable接口 重写compareto方法
 * <p>
 * 3. 如果compare接口 等方法不适合当前的情况了
 * comparator 定制新的排序规则
 * <p>
 * 4. 两者的区别：
 * comparable 接口创建之后保证实现类任何位置就能比较
 * comparator 临时创建排序规则
 */
class Goods implements Comparable, Comparator{
    private String name;
    private double price;

    public Goods (){
    }

    public Goods (String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName (){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public double getPrice (){
        return price;
    }

    public void setPrice (double price){
        this.price = price;
    }

    @Override
    public String toString (){
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //    指明什么方式排序
    @Override
    public int compareTo (Object o){
        Goods goods = (Goods) o;
//        方式一：自己编写实现方式
/*        if( o instanceof Goods ){
            Goods goods = (Goods) o;
            if( this.price > goods.price ){
                return 1;
            } else if( this.price < goods.price ){
                return -1;
            } else {
                return 0;
            }
        }
        throw new RuntimeException("数据有误！");
        */
        //    方式二 调用compare方法 价格排序
        // return Double.compare(this.price,goods.price);

        //    调用compareTo 商品名称排序
        return this.name.compareTo(goods.name);
    }

    //    comparator下面的方法
    @Override
    public int compare (Object o1, Object o2){
        // Goods goods = (Goods) o1;
        // Goods goods1 = (Goods) o2;
        //
        // return -compare(goods.name, goods1.name);
        return 0;
    }
}

public class CompareTest{

    @Test
    public void test1 (){
        String[] arr = new String[]{"AA", "BB", "GG", "MM", "LL", "ZZ", "DD"};
        Arrays.sort(arr);
        //    对String数组进行排列  运行结果：[AA, BB, DD, GG, LL, MM, ZZ]
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test2 (){
        Goods[] goods = new Goods[4];
        goods[0] = new Goods("lenovoMouse", 198.5);
        goods[1] = new Goods("dellMouse", 258.6);
        goods[2] = new Goods("xiaomiMouse", 99.8);
        goods[3] = new Goods("huaweiMouse", 25);

        //sort 默认情况下无法比较
        // Arrays.sort(goods);
        // System.out.println(Arrays.toString(goods));

        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));

    }

    @Test
    public void test3 (){
        Goods[] goods = new Goods[5];
        goods[0] = new Goods("lenovoMouse", 198.5);
        goods[1] = new Goods("dellMouse", 258.6);
        goods[2] = new Goods("xiaomiMouse", 99.8);
        goods[3] = new Goods("huaweiMouse", 25);
        goods[4] = new Goods("huaweiMouse", 250);

        Arrays.sort(goods, new Comparator(){
            @Override
            public int compare (Object o1, Object o2){
                if( o1 instanceof Goods && o2 instanceof Goods ){
                    Goods g1 = (Goods) o1;
                    Goods g2 = (Goods) o2;
                    if( g1.getName().equals(g2.getName()) ){
                        return -Double.compare(g1.getPrice(), g2.getPrice());

                    } else {
                        return g1.getName().compareTo(g2.getName());
                    }
                }
                throw new RuntimeException("cuo");
            }
        });

        System.out.println(Arrays.toString(goods));
    }
}
