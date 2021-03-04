package day03.ladomBiaoDaShi;

/**
 * @author JIAJUN KOU
 */
//创建Runnable接口的实现类
public class RunnableImpl implements Runnable {
    //重写方法，设置线程任务。
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":执行了run方法。");
    }
}
