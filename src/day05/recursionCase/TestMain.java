package day05.recursionCase;

import java.io.File;

/**
 * @author JIAJUN KOU
 */
//一个综合案例，文件搜索。
    //搜索盘符的指定文件。

public class TestMain {
    public static void main(String[] args) {
        File file=new File("E:\\jidi\\File_Class_Test\\FileTest01");
        getAllFiles(file);
        //定义一个方法，参数传递File类型的目录，方法对目录遍历
    }
    public static void getAllFiles(File dir){
        File[] files=dir.listFiles();
        for (File file : files) {
            //判断是不是文件夹
            if(file.isDirectory()){
                getAllFiles(file);
            }else {
                //只要.Java文件
                //String fileName=file.getName();
                //String path = file.getPath();
                String s = file.toString();
                //调用String类中的方法endWith（）方法。
                //把字符串换成小写
                String s1 = s.toLowerCase();
                boolean b = s1.endsWith(".java");
                if(b){
                    System.out.println(file);
                }

                //链式编程
                if(file.getName().toString().toLowerCase().endsWith(".java")){
                    System.out.println(file);
                }
            }
        }
    }
}
