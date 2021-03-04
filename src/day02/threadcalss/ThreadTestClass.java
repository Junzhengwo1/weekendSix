package day02.threadcalss;

/**
 * @author JIAJUN KOU
 */
/*
    创建多线程程序的第一种方式：创建一个Thread类的子类
    java.lang.Thread类，必须继承Thread类。
    实现步骤：
    1、创建一个Thread类的子类
    2、在Thread类的子类中重写Thread类中的run（）方法，设置线程任务（开启线程要做什么。）
    3、创建Thread类的子类对象。
    4、调用Thread类中的Start（）方法。开启新的线程，执行run（）方法。

    创建多线程程序的第二种方式：实现Runnable接口
    实现步骤：
    1、创建实现Runnable的实现类。
    2、重写run（）方法
    3、创建实现类对象
    4、创建Thread类的对象，把实现类对象传进去。
    5、调用Thread类的Start（）方法。

    实现Runnable接口的好处：
    1、避免了单线程的局限性
    实现了接口的还可以的实现其他接口或继承其他的类。
    2、增强了程序的扩展性，降低耦合性。

 */
public class ThreadTestClass {
    public static void main(String[] args) {

       //show01();
        show02();
    }

    public static void show01(){
        MyThread mt=new MyThread();
        //调用start方法。
        mt.start();

        MyThread mt2= new MyThread();
        mt2.start();

        Thread t=Thread.currentThread();
        t.getName();
        System.out.println(t.getName());

        for (int i = 0; i <10 ; i++) {
            System.out.println("main:"+i);
        }
    }

    public static void show02(){
        ImplsRunnable im=new ImplsRunnable();
        Thread thread=new Thread(im);
        thread.start();

        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

}
