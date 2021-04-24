package cn.lzw.TextSxt;

public class Text {
    public static void main (String[] args){
     int[] arr01 = new int[10];
     String[] arr02 = new String[5];
     arr01[0] = 10;
     arr01[1] = 15;
     arr01[2] = 20;


     for (int i=0;i<arr01.length;i++){
         arr01[i] = 10*i;
     }
        for (int i=0;i<arr01.length;i++){
            System.out.println(arr01[i]);
        }

        User[] arr03 = new User[3];

        arr03[0] = new User(1001,"李梓玮");
        arr03[1] = new User(1002,"李玮");
        arr03[2] = new User(1003,"李梓");

        for (int i=0;i<arr03.length;i++ ){
                System.out.println(arr03[i].getName ());
        }
    }
}
class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
