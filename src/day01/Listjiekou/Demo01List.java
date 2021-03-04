package day01.Listjiekou;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author JIAJUN KOU
 */

//list接口  list底层就是数组。
    //四个方法
    //add（）；
    //get（）；
    //remove（）；
    //set（）；

public class Demo01List {
    public static void main(String[] args) {

        List <String> list=new ArrayList<>();
        list.add("kou");
        list.add("jia");
        list.add("jun");
        list.add("kou");
        System.out.println(list);
        //我现在在jia jun之间添加一个元素。
        list.add(2,"wang");
        //移除了最后的“kou”
        list.remove(4);
        System.out.println(list);
        //替换指定的元素
        list.set(3,"ljh");
        System.out.println(list);

        //list有三种遍历方法
        for (int i = 0; i <list.size() ; i++) {
            String s2=list.get(i);
            System.out.println(s2);
        }
        System.out.println("==================");
        //list的增强for循环。
        for (String s3:list) {
            System.out.println(s3);
        }
        System.out.println("====================");
        //迭代器循环。
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String s4=it.next();
            System.out.println(s4);
        }

        System.out.println("====================");
        System.out.println(list);
        String s =list.get(2);
        System.out.println(s);

    }

}
