package cn.lzw.Spring;

/**
 * @author lzw
 * @version 2021/4/24 17:22
 */
public class Order{
    private String name;
    private String address;

    public Order(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void testOrder(){
        System.out.println(name + address);
    }
}
