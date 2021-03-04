package day02.jiejueSafety;
/**
 * @author JIAJUN KOU
 */
/*
        1、使用同步代码块来解决线程安全问题
        程序的效率有稍微的降低。
 */
public class RunnableImpl implements Runnable {
    //定义一个多个线程的共享的票源。
    private int ticket=10;
    //创建一个锁对象
    Object obj=new Object();
   //设置线程任务 目的是为了卖票
    @Override
    public void run() {
        //使用死循环让卖票重复执行
        while (true){
            //=======================
            synchronized (obj){
                if(ticket>0){
                    //卖票
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                    ticket--;
                }
            }
            //========================
        }

    }
}
