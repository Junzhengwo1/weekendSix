package day03.xianchengchi;

/**
 * @author JIAJUN KOU
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池的相关学习。是JDK1.5后提出的
 * java.util.concurrent.Executors;线程池的工厂类；用来生成线程池。
 *
 * Submit（）
 * //线程池的使用步骤：
 * 1、使用线程池的工厂类Executors里提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池。
 * 2、创建一个类，实现Runnable接口，重写run（）方法，设置线程任务。
 * 3、调用ExecutorersService中的submit（）方法，传递线程任务（实现类），开启线程，执行run方法。
 *  * 4、调用ExecutorsSive中的方法Shutdown销毁线程池（但是不建议执行）
 *
 */
public class XianChengChiClass {
    public static void main(String[] args) {
        //1、使用线程池的工厂类Executors里提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池。
        ExecutorService es = Executors.newFixedThreadPool(2);
        //3、调用ExecutorersService中的submit（）方法，传递线程任务（实现类），开启线程，执行run方法。
        es.submit(new RunnableImopl());
        es.submit(new RunnableImopl());
        es.submit(new RunnableImopl());
    }

}
