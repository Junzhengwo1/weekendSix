package day05.recursionTest;

import java.io.File;

/**
 * @author JIAJUN KOU
 */
/*
    递归打印多级目录
 */
public class Test03 {
    public static void main(String[] args) {

        File file=new File("E:\\jidi\\File_Class_Test\\FileTest01");
        getAllFiles(file);

    }
    //定义一个方法，参数传递File类型的目录，方法对目录遍历
    public static void getAllFiles(File dir){
        File[] files=dir.listFiles();
        for (File file : files) {
            //判断是不是文件夹
            if(file.isDirectory()){
                getAllFiles(file);
            }else {
                System.out.println(file);
            }
        }
    }

}
