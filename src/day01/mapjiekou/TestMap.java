package day01.mapjiekou;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @author JIAJUN KOU
 */
/*
    计算字符串中的每个字符出现的次数
    例如：
    使用Scanner获取输入的字符串。
    aaaabbbccc
    a   4
    b   3
    c   3
    步骤：
        1、使用Scanner获取用户输入的字符串
        2、创建Map集合，key是字符的中的字符，value是字符的个数。
        3、遍历字符串的，获取每一个字符
        4、使用获取到的字符，去Map集合判断Key是否存在
        5、遍历map集合，输出结果
 */
public class TestMap {
    public static void main(String[] args) {
        //1、使用Scanner获取用户输入的字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String str=sc.next();
        // 2、创建Map集合，key是字符的中的字符，value是字符的个数
        HashMap<Character,Integer> map=new HashMap<>();
        //3、遍历字符串的，获取每一个字符
        char[] chars = str.toCharArray();
        for (char c:chars){
               // 4、使用获取到的字符，去Map集合判断Key是否存在
                if(map.containsKey(c)){
                    //若key存在
                    Integer value = map.get(c);
                    value++;
                    map.put(c,value);
                }else {
                    //key不存在
                    map.put(c,1);
                }
            }
        //5、遍历map集合，输出结果
        Set<Character> set = map.keySet();
        for (Character key :set){
            Integer value=map.get(key);
            System.out.println(key+"="+value);
        }

    }
}
