package day03.ladomBiaoDaShi;

/**
 * @author JIAJUN KOU
 */

/**
 * 拉姆达表达式
 * 强调结果，不重视过程。
 *
 *使用实现Runnable接口的实现类实现多线程。
 */
public class Test01 {
    public static void main(String[] args) {
        //创建接口的实现类对象
        RunnableImpl runnable=new RunnableImpl();
        //创建Thread类，构造方法中传递Runnable接口的实现类
        Thread t=new Thread(runnable);
        t.start();

        //简化代码;使用匿名内部类
        Runnable runnable1 =new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+":执行了run方法。");
            }
        };

        new Thread(runnable1).start();
        //再次简化
        new Thread(runnable1){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+":执行了run方法。");
            }
        }.start();

    }
}
