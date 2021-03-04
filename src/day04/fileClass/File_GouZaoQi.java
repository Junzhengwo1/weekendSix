package day04.fileClass;

import java.io.File;

/**
 * @author JIAJUN KOU
 */
//File类的构造方法。
public class File_GouZaoQi {
    public static void main(String[] args) {
    show01();
    show02("c:","\\HTML5");
    }

    public static void show01(){
        File fi=new File("F:\\HTML5");
        System.out.println(fi);//重写了toString方法。 会打印路径。
    }

    public static void show02(String parent,String child){
        File file=new File(parent,child);
        System.out.println(file);
    }

}
