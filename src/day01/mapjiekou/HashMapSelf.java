package day01.mapjiekou;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * @author JIAJUN KOU
 */

//HashMap集合来存储自定义类的键与值。
    //作为key的元素必须重写hashcode（）方法和equals（）方法；以保证key的唯一。

public class HashMapSelf {
    public static void main(String[] args) {

        //show01();
        show02();
    }

    /*
    key:
        String类型
        String类已经重写了hashCode（）方法和equals()方法，保证了key的的唯一。
    value：
         用Person类型
         value可以重复（同名同年龄的人视为同一个人）
     */
    static void show01(){
        //首先创建HashMap集合
        HashMap<String,Person> map=new HashMap<>();
        //往集合中添加元素
        map.put("成都",new Person("王",19));
        map.put("北京",new Person("佳",21));
        map.put("成都",new Person("寇",20));//这里的key相同会替换掉前面的19岁
        map.put("上海",new Person("军",22));
        //System.out.println(map);
        //遍历一下map集合
        //使用keySet再用增强for来循环
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key+"="+value);
        }
    }

    /*
    key:
        用Person类型
        这里就必须重写hashCode()方法和equals()方法，来保证key的的唯一。
    value：
         用String类型
         value可以重复（同名同年龄的人视为同一个人）
     */
    static void show02(){
        HashMap<Person,String> map=new HashMap<>();
        //往集合中添加元素
        map.put(new Person("女王",18),"英国");
        map.put(new Person("秦始皇",19),"中国");
        map.put(new Person("普京",50),"俄罗斯");
        map.put(new Person("女王",18),"德国");
        //System.out.println(map);
        //使用Entry来遍历map集合。
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(value+"="+key);
        }
    }
}


class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}