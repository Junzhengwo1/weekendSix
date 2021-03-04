package day02.xianchengsafety;

/**
 * @author JIAJUN KOU
 */
public class RunnableImpl implements Runnable {

    //定义一个多个线程的共享的票源。
    private int ticket=10;


   //设置线程任务 目的是为了卖票
    @Override
    public void run() {
        //使用死循环让卖票重复执行
        while (true){
            if(ticket>0){
                //卖票
                System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                ticket--;
            }
        }

    }
}
