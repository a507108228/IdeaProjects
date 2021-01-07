package cn.lzw.BiLiBiLi;

/**
 * @author： lzw
 * @date： 2020/11/16 12:50
 * @description：
 */
class Day04_Gouzao {
        private String name;
        private int age;
        public Day04_Gouzao(){
            name = "无名氏";
            age = 18;
        }
        public Day04_Gouzao(String tempName){
            name = tempName;
        }
        public Day04_Gouzao(String tempName , int tempAge){
            name = tempName;
            age = tempAge;
        }

        public String getName ( ) {
            return name;
        }

        public void setName ( String name ) {
            this.name = name;
        }
        public void tell(){
            System.out.println("姓名："+name+"\t"+ "年龄"+age);
        }
        public static void main(String[] args){
         Day04_Gouzao Da = new Day04_Gouzao ( "闫鑫",18 );
         Da.tell ();
         Da.setName ( "傻逼" );
         Da.tell ();

        }
}
