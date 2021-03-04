package day04.LaMuDa_simple;

/**
 * @author JIAJUN KOU
 */

//测试类
public class TestMain {
    public static void main(String[] args) {

        //调用invokerCook方法，参数是Cook接口，所以可以传递Cook接口的匿名内部类对象
    invokeCook(new Cook() {
        @Override
        public void makeFood() {
            System.out.println("吃饭了");
        }
    });


    /** 使用拉姆达表达式，简化匿名内部类的书写   */
    invokeCook(()->{
            System.out.println("吃饭了2");
        });


    //优化省略拉姆达

        invokeCook(()-> System.out.println("吃饭了3"));


    }

    //定义一个方法 参数传递Cook接口，方法内部调用Cook接口的方法。
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }

}
