package day01.hashjihe.setjiekou;



import java.util.HashSet;
import java.util.Objects;

/**
 * @author JIAJUN KOU
 */

//使用HashSet集合存储自定义类型元素。
    //必须重写toString（）和equals（）方法。
public class HashSetSelf {
    public static void main(String[] args) {
        //先创建一个HashSet集合来存储Person
        HashSet<Person> set=new HashSet<>();

        Person person1=new Person("kou",20);
        Person person2=new Person("kou",20);
        Person person3=new Person("kou",23);
        set.add(person1);
        System.out.println(person1.hashCode());
        set.add(person2);
        System.out.println(person2.hashCode());
        set.add(person3);
        System.out.println(set);

        System.out.println("=================================");
        //我们要求同名字和同年龄的人为同一个人
        HashSet<Person2> set2=new HashSet<>();
        Person2 person01=new Person2("jia",20);
        Person2 person02=new Person2("jia",20);
        Person2 person03=new Person2("jun",23);
        set2.add(person01);
        System.out.println(person01.hashCode());
        set2.add(person02);
        System.out.println(person02.hashCode());
        set2.add(person03);
        System.out.println(set2);
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
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
}


class Person2{
    private String name;
    private int age;

    public Person2() {
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return age == person2.age &&
                Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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
}