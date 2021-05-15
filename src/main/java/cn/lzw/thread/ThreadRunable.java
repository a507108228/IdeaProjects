package cn.lzw.thread;

/**
 * @author lzw
 * @version 2021/5/15 16:51
 */
class MyThread1 implements Runnable{
    @Override
    public void run(){
        for( int i = 0; i <= 100 ; i++ ){
            if( i %2 == 0 ){
                System.out.println(Thread.currentThread().getName()+"\t"+i );
            }
        }


    }
}
class MyThread2 implements Runnable{
    @Override
    public void run(){
        for( int i = 0; i <= 100 ; i++ ){
            if( i %2 != 0 ){
                System.out.println(Thread.currentThread().getName()+"\t"+i );
            }
        }
    }
}
public class ThreadRunable{
    public static void main(String[] args){
        new Thread( new MyThread1() ).start();
        new Thread( new MyThread2() ).start();

    }
}
