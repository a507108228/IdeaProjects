package cn.lzw.imook;

class Item{
    private String name ;
    private int price;

    public Item(){
    }

    public Item(String name , int price){
        this.name=name;
        this.price=price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }
    public String getInfo(){
        return "装备名称："+this.name + "\t"+"装备价格："+this.price ;
    }
}
public class JavaText extends Item{
    private int ac;

    public JavaText(){
    }
    public JavaText(String name , int price ){
        super(name , price);
    }
    public JavaText(String name , int price , int ac){
        super(name , price);
        this.ac=ac;
    }

    public int getAc(){
        return ac;
    }

    public void setAc(int ac){
        this.ac=ac;
    }
    public String getInfo(){
        return super.getInfo()+"\t"+ "装备等级："+this.ac;

    }
    public static void main(String[] args){
     JavaText j = new JavaText();
     j.setName("布甲");
     j.setPrice(500);
     j.ac = 15;
     System.out.println(j.getInfo());


    }
}
