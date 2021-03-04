package day02.threadcalss;

/**
 * @author JIAJUN KOU
 */
public class TestExtendsThread extends Thread{

    public TestExtendsThread() {
    }

    public TestExtendsThread(String name){
        super(name);
    }

    @Override
    public void run() {
        //获取线程名称
        System.out.println(Thread.currentThread().getName());
    }
}
