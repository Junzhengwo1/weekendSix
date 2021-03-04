package day03.xianchengchi;

/**
 * @author JIAJUN KOU
 */


public class RunnableImopl implements Runnable {
    //设置线程任务。
    @Override
    public void run() {
        //获取线程名称
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
    }
}
