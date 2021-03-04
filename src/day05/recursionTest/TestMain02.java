package day05.recursionTest;

/**
 * @author JIAJUN KOU
 */
/*
       使用递归的计算阶乘
 */
public class TestMain02 {
    public static void main(String[] args) {
        int jc=show(3);
        System.out.println(jc);

    }
    //定义一个方法使用递归 计算阶乘
    public static int show(int n){
        //递归结束的条件
        if(n==1){
            return 1;
        }
        return n*show(n-1);
    }
}
