package day01.mapjiekou;

import java.util.HashMap;
import java.util.Map;

/**
 * @author JIAJUN KOU
 */
//常用方法：
    //1、put方法；返回值是value
    //2、get方法；
    //3、remove；返回值也是value
    //4、containsKey
public class HashMapClass {
    public static void main(String[] args) {
        //show01();
        //show02();
        //show03();
        show04();
    }

    /**
     * public v put(k key,v value);把指定的键与指定的值添加到Map集合中
     */
    static void show01(){
        //创建Map集合对象，多态的体现。
        Map<String,String> map=new HashMap<>();
        String s = map.put("kou", "20");
        System.out.println(s);//这里返回的就是空
        String s1 = map.put("kou", "21");//key值相同就会把前面的替换掉第一个。
        System.out.println(s1);
        System.out.println(map);

        map.put("wang","23");
        map.put("jun","32");
        map.put("jia","54");
        System.out.println(map);

    }

    static void show02(){
        Map<String,Integer> map=new HashMap<>();
        map.put("美女1",168);
        map.put("美女2",178);
        map.put("美女3",165);
        System.out.println(map);
        //删除了,返回值尽量用包装类；防止异常
        Integer integer = map.remove("美女1");
        System.out.println(integer);//这里返回的168 就是删除key值对应的value值
        System.out.println(map);
        System.out.println("================");
        Integer integer1 = map.remove("kou");//这里没有就会返回空
        System.out.println(integer1);//null

    }

    static void show03(){
        //get 方法 通过键来获取值
        Map<String,Integer> map=new HashMap<>();
        map.put("美男子1",180);
        map.put("美男子2",178);
        map.put("美男子3",182);
        Integer v = map.get("美男子2");
        System.out.println(v);

    }
    static void show04(){
        //containsKey();判断集合中是否包含指定的键。
        Map<String,Integer> map=new HashMap<>();
        map.put("美男子1",180);
        map.put("美男子2",178);
        map.put("美男子3",182);
        boolean b = map.containsKey("美男子2");
        System.out.println(b);

    }

}
