package day01.Listjiekou;

import java.util.LinkedList;

/**
 * @author JIAJUN KOU
 */

//底层是链表结构
    //查询慢 增删快
    //包含了大量的的首位元素操作的方法
    //不能使用多态。
public class LinkedListjihe {

    public static void show01(){
        LinkedList<String> ld=new LinkedList();
        //使用add
        ld.add("kou");
        ld.add("jia");
        ld.add("jun");
        ld.add("a");
        ld.add("b");
        //在开头添加元素
        ld.push("c");
        //也是在开头添加元素
        ld.addFirst("cc");
        //等效于add（）；
        ld.addLast("bb");

        System.out.println(ld);

    }

    public static void show02(){
        LinkedList<String> ld=new LinkedList();
        //使用add
        ld.add("kou");
        ld.add("jia");
        ld.add("jun");
        ld.add("a");
        ld.add("b");

        if (!ld.isEmpty()){
            String s1=ld.getFirst();
            String s2=ld.getLast();
            System.out.println(s1);
            System.out.println(s2);
        }

    }

    public static void show03(){
        LinkedList<String> ld=new LinkedList();
        //使用add
        ld.add("kou");
        ld.add("jia");
        ld.add("jun");
        ld.add("a");
        ld.add("b");
        System.out.println(ld);

        String first=ld.removeFirst();
        String last=ld.removeLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println(ld);

    }

    public static void main(String[] args) {
        show01();
        //show02();
        //show03();
    }

}
