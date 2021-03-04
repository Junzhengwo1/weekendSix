package day02.threadcalss;

/**
 * @author JIAJUN KOU
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("run:"+i);
        }
        //获取线程名称
        String name = getName();
        System.out.println(name);
    }
}
