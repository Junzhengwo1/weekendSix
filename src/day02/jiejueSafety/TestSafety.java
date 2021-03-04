package day02.jiejueSafety;
/**
 * @author JIAJUN KOU
 */
/*
    如何解决安全问题：线程的同步技术：共有三种
    1、同步代码块
    2、同步方法
    3、锁机制
 */
public class TestSafety {
    public static void main(String[] args) {
        //模拟卖票案例
        //创建三个线程同时开启
        //对共享的票源进行出售。
        RunnableImpl runnable=new RunnableImpl();
        Thread thread01=new Thread(runnable);
        Thread thread02=new Thread(runnable);
        Thread thread03=new Thread(runnable);

        thread01.start();
        thread02.start();
        thread03.start();

    }
}
