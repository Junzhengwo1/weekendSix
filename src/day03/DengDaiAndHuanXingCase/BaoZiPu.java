package day03.DengDaiAndHuanXingCase;

/**
 * @author JIAJUN KOU
 */

/**
 * 包子铺类 ，包子铺线程与包子线程之间的关系因该是 互斥关系
 * 必须使用同步技术，来保证只有一个线程执行。 可以使用包子对象作为锁对象。
 *
 *
 */
public class BaoZiPu extends Thread{
    //1、需要在成员位置创建一个包子变量
    private BaoZi bz;
    //2、使用带参数构造方法，为这个包子赋值
    public BaoZiPu(BaoZi bz){
        this.bz=bz;
    }
    //3、继承Thread类 重写run（）方法
    //设置线程任务：生产包子。
    @Override
    public void run() {
        int count=0;
        //用一个死循环，一直生产包子。
        while (true){
            //需要用到同步技术
            synchronized (bz){
                //对包子状态判断;如果有包子就吃包子，如果有就生产包子。
                if(bz.flag==true){
                    //调用wait（）方法等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行，让包子铺生产包子
                if(count%2==0){
                    //生产菜包子
                    bz.pi="薄皮";
                    bz.xian="白菜";
                }else {
                    //生产肉包子
                    bz.pi="厚皮";
                    bz.xian="牛肉";
                }
                count++;
                System.out.println("包子铺正在生产："+bz.pi+bz.xian+"包子。");
                //生产包子需要5秒钟
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //包子生产后；现在包子的状态为有
                bz.flag=true;
                //唤醒吃货线程来吃包子了。
                bz.notify();
                System.out.println("包子已经生产好："+bz.pi+bz.xian+"包子了,吃货开始吃。");
            }
        }

    }
}
