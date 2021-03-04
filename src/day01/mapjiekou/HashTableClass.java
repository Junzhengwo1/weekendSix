package day01.mapjiekou;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author JIAJUN KOU
 */
    //java.util.Hashtable,集合。
        //HashTable是最早期的双列集合；线程安全，速度慢，不可以存储空值空键。
        //HashMap 集合线程不安全；里面可以存储空值空键。
    //Hashtable的 properties集合依然活跃。

public class HashTableClass {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null,"a");
        map.put(null,null);
        System.out.println(map);

        Hashtable<String,String> hashtable=new Hashtable<>();
        hashtable.put(null,"ada");
        System.out.println(hashtable);//会报错。

    }
}
