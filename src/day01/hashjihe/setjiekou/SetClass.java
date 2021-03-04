package day01.hashjihe.setjiekou;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author JIAJUN KOU
 */
//set接口的特点
    //不允许存储重复元素
    //不允许使用for循环
    //1、hashSet
public class SetClass {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(6);
        set.add(1);//相同元素不会存进去
        //迭代器循环
        Iterator<Integer> it=set.iterator();
        while (it.hasNext()){
            Integer n=it.next();
            System.out.println(n);
        }
        for (Integer integer : set) {
            System.out.println(integer);
        }

    }
}
