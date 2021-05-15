package cn.lzw.thread;


/**
 * @author lzw
 * @version 2021/5/15 16:51
 */

class MyThread3 extends Thread{
    @Override
    public  void run(){
        try{
            MyThread3.sleep( 100 );
        }catch (InterruptedException e){
            e.printStackTrace( );
        }
        for( int i = 0; i <= 100 ; i++ ){
            if( i %2 == 0 ){
                System.out.println(Thread.currentThread().getName()+"\t"+i );
            }
        }

    }
}
class MyThread4 extends Thread{
    @Override
    public void run(){
        for( int i = 0; i <= 100 ; i++ ){
            if( i %2 != 0 ){
                System.out.println("做个记号"+Thread.currentThread().getName()+"\t"+i );
            }
        }

    }
}
public class ThreadTest{
    public static void main(String[] args){


        MyThread3 myThread3 = new MyThread3( );
        MyThread4 myThread4 = new MyThread4( );
        myThread3.start();
        myThread4.start();


    }
}

