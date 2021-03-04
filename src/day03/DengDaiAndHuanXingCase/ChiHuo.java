package day03.DengDaiAndHuanXingCase;

/**
 * @author JIAJUN KOU
 */

/**
 * 吃货类；线程类；继承Thread类。
 */
public class ChiHuo extends Thread {
    //1、需要在成员位置创建一个包子变量
    private BaoZi bz;
    //2、使用带参数构造方法，为这个包子赋值
    public ChiHuo(BaoZi bz){
        this.bz=bz;
    }

    //重写线程任务 吃包子
    @Override
    public void run() {
        //死循环一直吃包子
        while (true){
            synchronized (bz){
                //对包子状态判断
                if(bz.flag==false){
                    //吃货就应该等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后的执行的代码，吃包子。
                System.out.println("吃货正在吃"+bz.pi+bz.pi+"包子");
                //吃货吃完包子后
                //修改包子的状态为 false
                bz.flag=false;
                //吃货唤醒包子铺线程，继续生产包子。
                bz.notify();
                System.out.println("吃货已经把"+bz.pi+bz.xian+"的包子吃完了，店铺即将再生产包子。");
                System.out.println("******************************");
            }
        }

    }
}
