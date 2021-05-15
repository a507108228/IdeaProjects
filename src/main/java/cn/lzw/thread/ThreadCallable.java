package cn.lzw.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author lzw
 * @version 2021/5/15 16:25
 * Callable创建线程
 * 重写call（） 有返回值 可以抛出异常 支持泛型
 * 需要FutureTask
 */

class NumberThread3 implements Callable{
    @Override
    public Object call() throws Exception{
        int sum = 0;
        for( int i = 0; i <= 100; i++ ){
            if( i % 2 != 0 ){
                sum += i;
            }
        }
        return sum;
    }
}

class NumberThread4 implements Callable{
    @Override
    public Object call() throws Exception{

        return ((1 + 50) * 100) / 2;
    }
}

public class ThreadCallable{
    public static void main(String[] args){

        NumberThread3 numberThread3 = new NumberThread3( );
        NumberThread4 numberThread4 = new NumberThread4( );

        FutureTask< Integer > futureTask = new FutureTask( numberThread3 );
        FutureTask futureTask1 = new FutureTask( numberThread4 );

        new Thread( futureTask ).start( );
        new Thread( futureTask1 ).start( );

        Integer sum = null;
        try{
            sum = futureTask.get( );
            System.out.println( "1--50 奇数和：" + "\t" + sum );
        }catch (InterruptedException e){
            e.printStackTrace( );
        }catch (ExecutionException e){
            e.printStackTrace( );
        }

        Object o = null;
        try{
            o = futureTask1.get( );
            System.out.println( "1--50 偶数和：" + "\t" + o );
        }catch (InterruptedException e){
            e.printStackTrace( );
        }catch (ExecutionException e){
            e.printStackTrace( );
        }


    }
}
