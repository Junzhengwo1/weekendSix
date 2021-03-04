package day03.jiejue_rong_yu;

/**
 * @author JIAJUN KOU
 */
/**
 * 1、使用拉姆达表达式，来解决实现线程代码的冗余问题。
 * 可以说是 Jdk8的最重量级的更新。
 *
 * 2、拉姆达表达式的标准格式：
 *    1-.一些参数
 *    2-.一个箭头
 *    3-.一段代码
 *      格式：
 *          （参数列表）->{一些重写方法的代码}；
 *
 */
public class LaMuDa {
    public static void main(String[] args) {
        /**1、使用匿名内部类，实现多线程。*/
        RunnableImpl runnable=new RunnableImpl();
        new Thread(runnable){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+":新线程创建了。");
            }
        }.start();

        /**2、使用拉姆达表达式实现 多线程。*/
        new Thread(()->{
                System.out.println(Thread.currentThread().getName()+":新线程创建了。");
            }
        ).start();


    }
}
