package day03.DengDaiAndHuanXingCase;

/**
 * @author JIAJUN KOU
 */

/*
    等待唤醒机制。线程之间的通信。
    有效利用  生产一个包子就吃一个，再生产一个再吃掉一个。
 */
public class TimeWaitingTest {
    public static void main(String[] args) {
        //创建包子对象
        BaoZi baoZi=new BaoZi();
        //创建包子铺线程，生产包子
        BaoZiPu baoZiPu=new BaoZiPu(baoZi);
        baoZiPu.start();
        //创建吃货线程，吃包子。
        ChiHuo chiHuo=new ChiHuo(baoZi);
        chiHuo.start();

    }
}
