package cn.lzw.BiLiBiLi;

/**
 * @author： lzw
 * @date： 2020/11/16 9:48
 * @description：
 */
 class day04_lei {
      String name;
      int age;
      public void tell(){
          System.out.println("姓名："+name+"\t"+"年龄："+age);

      }
      public static void main(String[] args){
       day04_lei da = new day04_lei ();
       da.name = "闫鑫";
       da.age = 20;
       day04_lei da1 = da;
       da1.age = 100;
       da1.tell ();

      }
}
