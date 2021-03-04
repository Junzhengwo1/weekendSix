package day01.mapjiekou;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author JIAJUN KOU
 */
//keySet()和entrySet()方法
    //1、map集合的第一种遍历方式；keySet();就是将map中的所有的key取出来把存储到Set集合中。
    //2、map集合第二种遍历方式；Entry键值对对象

public class KeySetAndEntrySet {
    public static void main(String[] args) {

        show01();
        //show02();
    }
    //1、通过key找value
    static void show01(){
        Map<String,Integer> map=new HashMap<>();
        map.put("美男子1",180);
        map.put("美男子2",178);
        map.put("美男子3",182);
        Set<String> set = map.keySet();
        //增强for循环
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(value+"="+key);
        }
        //迭代器
        Iterator<String> it=set.iterator();
        while (it.hasNext()){
            String key=it.next();
            //通过key找到对应的value值
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }

    }
    //2、通过map集合第二种遍历方式；Entry键值对对象
    //entry接口中有一个entrySet方法：将Map集合中的多个entry对象存储到Set集合中。
        //实现步骤
            //1.使用Map集合中的方法entrySet（）方法，把Map集合的多个对象存储到Set集合中。
            //2.遍历Set集合，获取Entry对象
            //3.使用Entry对象的方法getKey（）方法，和getvalue（）方法获取键与值。
    static void show02(){
        Map<String,Integer> map=new HashMap<>();
        map.put("美女1",168);
        map.put("美女2",178);
        map.put("美女3",165);
        //使用Map集合中的方法entrySet（）方法，把Map集合的多个对象存储到Set集合中
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        //使用迭代器遍历Set集合。
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            //使用Entry对象的方法getKey（）方法，和getvalue（）方法获取键与值.
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }
        //使用增强for循环。
        for (Map.Entry<String, Integer> entry : set) {
            //使用Entry对象的方法getKey（）方法，和getvalue（）方法获取键与值.
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(value+"="+key);
        }

    }
}
