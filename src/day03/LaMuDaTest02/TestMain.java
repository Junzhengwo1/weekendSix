package day03.LaMuDaTest02;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author JIAJUN KOU
 */

//无参无返回的 拉姆达练习
public class TestMain {
    public static void main(String[] args) {
        //创建一个数组来存储多个Person对象
        Person[] arr={
                new Person("kou",20),
                new Person("jia",21),
                new Person("jun",22)
        };
//        //对数组中Person对象使用Array的Sort方法升序排序。
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();//升序
//            }
//        });

        /**  使用拉姆达表达式来简化代码  */
        Arrays.sort(arr,(Person o1,Person o2) ->{
            return o1.getAge()-o2.getAge();
        });

        //优化省略拉姆达
        Arrays.sort(arr,(o1, o2) -> o1.getAge()-o2.getAge());


        //遍历数组
        for (Person person : arr) {
            System.out.println(person);
        }

    }
}
