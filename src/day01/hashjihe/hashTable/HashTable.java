package day01.hashjihe.hashTable;

/**
 * @author JIAJUN KOU
 */
//
public class HashTable {
    public static void main(String[] args) {
        //Person类继承了Object类，所以可以使用hashcode方法。
        Persons persons=new Persons();
        int a=persons.hashCode();
        System.out.println(a);//是整数，但其实就是persons的地址值。
        System.out.println(persons);//地址值

        Persons persons1=new Persons();
        int i = persons1.hashCode();
        System.out.println(i);

        String s=new String("abc");
        String s1=new String("abc");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());


        System.out.println("重地".hashCode());//巧合 hash值相同
        System.out.println("通话".hashCode());//
    }
}

class Persons extends Object{
    //重写hashcode（）；
    @Override
    public int hashCode() {
        return 100;//重写之后 返回的都是1.
    }
}