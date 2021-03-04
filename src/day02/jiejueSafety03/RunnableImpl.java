package day02.jiejueSafety03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author JIAJUN KOU
 */
/*
        1、使用锁机制来解决线程安全问题
        在java.util.concurrent.locks.lock接口
        lock接口有一个Reentrantlock实现类。
        使用步骤：
        1、在成员位置创建一个接口实现类接口
        2、在可能出现线程安全问题的代码前，调用lock接口中的方法lock（）；获取锁。
        3、在可能会出现线程安全问题的代码后，调用接口的方法unlock（）；释放锁。
 */
public class RunnableImpl implements Runnable {
    //定义一个多个线程的共享的票源。
    private int ticket=10;
   /**在成员位置创建一个对象*/
    Lock l=new ReentrantLock();

//   //设置线程任务 目的是为了卖票
//    @Override
//    public void run() {
//        //System.out.println("this"+this);
//        //使用死循环让卖票重复执行
//        while (true){
//            l.lock();
//            if(ticket>0){
//                //卖票
//                System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
//                ticket--;
//            }
//            //解锁
//            l.unlock();
//        }
//    }

    //设置线程任务 目的是为了卖票
    @Override
    public void run() {
        //System.out.println("this"+this);
        //使用死循环让卖票重复执行
        while (true){
            l.lock();
            if(ticket>0){
                try {
                    Thread.sleep(10);
                    //卖票
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //解锁
                    l.unlock();//这样写的好处，无论程序是否异常都会把锁释放掉。
                }
            }

        }
    }
}
