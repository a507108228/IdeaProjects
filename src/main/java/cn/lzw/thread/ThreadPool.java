package cn.lzw.thread;

import sun.management.counter.Units;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author lzw
 * @version 2021/5/15 15:34
 * <p>
 * 好处：提高响应速度
 * 减低资源消耗
 * 便于线程管理
 * corePoolSize:核心池的大小
 * maximumPoolSize:最大线程数
 * keepAliveTime:没有线程任务最多保持多久会终止
 */

class NumberThread implements Runnable{
    @Override
    public void run(){
        for( int i = 0; i <= 100; i++ ){
            if( i % 2 == 0 ){
                System.out.println( Thread.currentThread( ).getName( ) + ":" + i );
            }
        }
    }
}

class NumberThread1 implements Runnable{
    @Override
    public void run(){
        for( int i = 0; i <= 100; i++ ){
            if( i % 2 != 0 ){
                System.out.println( Thread.currentThread( ).getName( ) + ":" + i );
            }
        }
    }
}

public class ThreadPool{
    public static void main(String[] args){
        //    造一个线程池 有10个线程
        ExecutorService service = Executors.newFixedThreadPool( 10 );

        //    管理线程    设置线程的属性
        System.out.println( "1" + service.getClass( ) );
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
        System.out.println( "2" + service1.getCorePoolSize( ) );
        service1.setCorePoolSize( 15 );
        System.out.println( "3" + service1.getCorePoolSize( ) );
        service1.setKeepAliveTime( 1, TimeUnit.HOURS );
        System.out.println( "4" + service1.getKeepAliveTime( TimeUnit.MINUTES ) );


        //    适用于Runnable
        service.execute( new NumberThread( ) );
        service.execute( new NumberThread1( ) );

        //    适用于Callable
        //service.submit();
        //    关闭操作
        service.shutdown( );
        service1.shutdown( );

    }
}
