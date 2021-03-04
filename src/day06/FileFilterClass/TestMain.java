package day06.FileFilterClass;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author JIAJUN KOU
 */
/*
       文件过滤器的使用。
 */
public class TestMain {
    public static void main(String[] args) {
        File file = new File("E:\\jidi\\File_Class_Test\\FileTest01");
        getAllFiles(file);

    }

    //定义一个方法，参数传递File类型的目录，方法对目录遍历
    public static void getAllFiles(File dir) {
        //使用FileFilter过滤器过滤
        //File[] files = dir.listFiles(new FileFilterImpl());
        //使用FilenameFilter过滤 。。这里使用了匿名内部类。
        File[] files=dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
            }
        });

        //还可以用拉姆达表达式



        for (File file : files) {
            //判断是不是文件夹
            if (file.isDirectory()) {
                getAllFiles(file);
            } else {

                System.out.println(file);
            }

        }
    }
}
