package day03.LaMuDaTest03;

/**
 * @author JIAJUN KOU
 */
public class TestMain {
    public static void main(String[] args) {

        invokeSum(10, 20, new Calculator() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        });

        /**  使用 拉姆达表达式 用来简化匿名内部类的书写 */
        invokeSum(10,30,(int a,int b)->{
          return a+b;
        });

        //优化省略拉姆达
        invokeSum(10,30,( a, b)-> a+b);


    }

    //定义一个方法；参数传递两个int类型的整数。
    //参数传递 Calculator接口。
    //方法内部调用Calculator中的方法 sum()方法求和。

    public static void invokeSum(int a,int b ,Calculator calculator){
        int sum=calculator.sum(a,b);
        System.out.println(sum);
    }

}
