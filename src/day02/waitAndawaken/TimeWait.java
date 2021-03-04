package day02.waitAndawaken;

/**
 * @author JIAJUN KOU
 */
        /*Waiting无限等待状态
            //等待唤醒案例分析。也叫线程之间的通信。
        1、创建一个顾客线程，告知老板包子的数量和种类，调用wait（）方法，
        放弃CPu的执行权利
        2、创建老板线程，花时间做包子，做好包子后，调用notify（）方法。
        唤醒顾客吃包子

        */
public class TimeWait {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj=new Object();
        //创建一个顾客线程
        new Thread(){
            @Override
            public void run() {
                //一直等待买包子 使用死循环
                while (true){
                    //为了保证等待唤醒线程之只能有一个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("顾客1告示老板包子的种类和数量：");
                        //调用wait（）方法
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("顾客1包子做好了开始吃。");
                        System.out.println("===========================");
                    }
                }
            }
        }.start();


        new Thread(){
            @Override
            public void run() {
                //一直等待买包子 使用死循环
                while (true){
                    //为了保证等待唤醒线程之只能有一个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("顾客2告示老板包子的种类和数量：");
                        //调用wait（）方法
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("顾客2包子做好了开始吃。");
                        System.out.println("===========================");
                    }
                }
            }
        }.start();

        //创建一个老板线程
        new Thread(){
            @Override
            public void run() {
                //一直做包子
                while (true){
                    //花了五秒钟做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //为了保证等待唤醒线程之只能有一个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("我需要花五秒钟做包子");
                        //调用notify（）方法 唤醒
                        obj.notifyAll();
                    }
                }
            }
        }.start();
    }
}
