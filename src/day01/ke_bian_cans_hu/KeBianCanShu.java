package day01.ke_bian_cans_hu;

/**
 * @author JIAJUN KOU
 */

//可变参数；当类型确定，参数个数不确定的情况下。
public class KeBianCanShu {
    public static void main(String[] args) {
        int sum=add(1,2,3,4,4,5);
        System.out.println(sum);
    }

    //定义一个方法，计算0~多个整数的和
    public static int add(int ...arr){
        int sum=0;
        //System.out.println(arr);
        //System.out.println(arr.length);
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
    public static Object meth(Object ...obj){

        return 0;
    }

}
