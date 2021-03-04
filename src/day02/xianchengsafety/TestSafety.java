package day02.xianchengsafety;

/**
 * @author JIAJUN KOU
 */
/*
    线程安全问题。
    多线程访问了共享数据就会产生线程安全问题。
    如何解决安全问题：线程的同步技术：共有三种

    1、
    2、
    3、

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
