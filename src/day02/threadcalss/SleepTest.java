package day02.threadcalss;

import java.util.NoSuchElementException;

/**
 * @author JIAJUN KOU
 */
// sleep();方法；使当前的程序安指定的毫秒数执行。毫秒数结束后，程序再执行
public class SleepTest {
    public static void main(String[] args) {
        for (int i = 0; i <60 ; i++) {
            System.out.println(i);
            //使用Thread类的sleep（）方法。
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
