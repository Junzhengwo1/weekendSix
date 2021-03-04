package day05.recursionTest;

/**
 * @author JIAJUN KOU
 */
/*
    递归思想的学习。
 */
public class TestMain {
    //定义一个方法通过递归的方法来实现1-n之间的和。
    //使用递归必须明确递归的结束条件。
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        int s =sum(3);
        System.out.println(s);
    }

}
