package day01.mapjiekou;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author JIAJUN KOU
 */
//LinkedHashMap集合。
    //底层是（链表加hash表） 这就是有序集合。
public class LinkedHashMapTest {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("d","d");
        System.out.println(map);//这是无序的集合
        LinkedHashMap<String,String> linked=new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("d","d");
        linked.put("c","c");
        linked.put("e","e");
        System.out.println(linked);//这就是有序的集合
    }
}
