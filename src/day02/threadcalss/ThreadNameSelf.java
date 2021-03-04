package day02.threadcalss;

/**
 * @author JIAJUN KOU
 */
//设置线程的名称。
    //Thread类里边有一个构造方法返回的名称

public class ThreadNameSelf {
    public static void main(String[] args) {
        TestExtendsThread e=new TestExtendsThread();
        //e.start();//Thread-0;
        e.setName("小垃圾");
        e.start();
        System.out.println(new TestExtendsThread("kou").getName());
    }
}
