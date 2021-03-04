package day04.fileClass;

import java.io.File;
import java.io.IOException;

/**
 * @author JIAJUN KOU
 */
//File类的常用方法
    /*
    1、获取方法中有四个：
       1-getAbsolutePath(); 返回的都是绝对路径
       2-getPath 返回值是根据传入的路径；若是相对则打印相对；若是绝对，就是绝对。
       3-getName()这个方法返回的就是 结尾部分。
       4-length() 获取的是file表示的文件长度。 如果给出的路径不存在，则返回0
    2、判断功能的方法 共有三个；返回的都是boolean类型
        1-exists();判断文件或者目录是否实际存在
        2-isDirectory();判断是否是文件夹结尾
        3-isFile();判断是否是文件
    3、创建和删除功能的方法。
        1-mkdir();只能创建单极的文件夹。
        2-mkdirs();既可以创建单级文件夹，也可以多级。
        3-delete()；直接在硬盘删除文件或文件夹不会走回收站。
    4、目录的遍历功能；共有两个。
        1-public String[] list();
        2-public File[] listFiles();
        3-list方法和listFile方法遍历的是构造方法中给出的目录。
        如果路径不存在则 会空指针异常。
        给出的路径不是目录，也会异常。
        遍历的结果是排序的。
    */

public class File_changyongfangfa {

    //获取方法的四种
    public static void show01(){
        //getAbsolutePath()
        File file=new File("F:\\JZW_Java\\MyShout\\src\\com\\tarena\\shout\\a.txt");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        File file2 = new File("MyShout");
        File file1= file2;
        String absolutePath1 = file1.getAbsolutePath();
        System.out.println(absolutePath1);

        //getPath 返回值是根据传入的路径；若是相对则打印相对；若是绝对，就是绝对。
        File file3=new File("F:\\JZW_Java\\MyShout\\src\\com\\tarena\\shout\\a.txt");
        String path = file3.getPath();
        System.out.println(path);
        File file4 = new File("MyShout");
        String path1 = file4.getPath();
        System.out.println(path1);

        //getName()这个方法返回的就是 结尾部分。
        String name = file.getName();
        System.out.println(name);
        String name1 = file4.getName();
        System.out.println(name1);

        //length() 获取的是file表示的文件长度。 如果给出的路径不存在，则返回0
        File file5=new File("F:\\JZW_Java\\MyShout\\src\\com\\tarena\\shout\\Airplane.java");
        long length = file5.length();
        System.out.println(length);
        File file6=new File("E:\\2020-3小学期\\报告\\总报告\\17312020240-寇佳军-小学期实训报告.docx");
        long length1 = file6.length();
        System.out.println(length1);
    }

    //判断功能的方法 共有三个；返回的都是boolean类型
    public static void show02(){
        File file=new File("E:\\2020-3小学期\\报告\\总报告\\17312020240-寇佳军-小学期实训报告.docx");
        //exists();判断文件或者目录是否实际存在
        boolean exists = file.exists();
        System.out.println(exists);

        //isDirectory();判断是否是文件夹结尾
        //isFile();判断是否是文件
        //保证路径都是存在的 否则返回都是false;所以最好是有个判断
        File file1=new File("F:\\2020-3小学期\\报告\\总报告");
        if(file1.exists()){
            boolean file2 = file1.isFile();
            boolean directory = file1.isDirectory();
            System.out.println(file2);
            System.out.println(directory);
        }else {
            System.out.println("该文件或文件夹不存在：");
        }
    }

    //创建和删除功能的方法。
    public static void show03(){
        //创建一个新的文件 createNewFile(); 只能创建文件；不能创建文件夹
        //这个方法声明了IO异常。
            //创建文件的路径和名称，在构造方法给出。返回值是boolean值
            //文件不存在，创建文件，返回true
            //文件存在，不创建，返回false
        //要保证路经真实存在。
        File file =new File("E:\\jidi\\File_Class_Test\\FileTest01\\kou.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }


        //创建文件夹的方法；mkdir();只能创建单极的文件夹。
        //mkdirs();既可以创建单级文件夹，也可以多级。
        //创建文件夹的路径也是在构造器中给出。
        //此方法只能创建文件夹不能创建文件。
        //要是文件路径不存在，不会有异常，他就不创建了。
        File file2=new File("E:\\jidi\\File_Class_Test\\FileTest01\\kou");
        File file3=new File("E:\\jidi\\File_Class_Test\\FileTest01\\kou\\jia\\jun");

        boolean mkdir = file2.mkdir();
        System.out.println(mkdir);
        boolean mkdirs = file3.mkdirs();
        System.out.println(mkdirs);

        //文件或文件夹的删除方法；delete()；
        //直接在硬盘删除文件或文件夹不会走回收站。
        //删除成功返回true
        File file4=new File("E:\\jidi\\File_Class_Test\\FileTest01\\kou\\jia\\jun");
        boolean delete = file4.delete();//这里就把jun这个文件夹删除了。
        System.out.println(delete);

    }

    //目录的遍历功能；共有两个。
    //public String[] list();
    //public File[] listFiles();
    //list方法和listFile方法遍历的是构造方法中给出的目录。
    //如果路径不存在则 会空指针异常。
    //给出的路径不是目录，也会异常。
    //遍历的结果是排序的。
    public static void show04(){
        File file=new File("E:\\jidi\\File_Class_Test\\FileTest01\\kou\\jia");
        String[] arr = file.list();
        for (String fileName : arr) {
            //System.out.println(arr);
            System.out.println(fileName);
        }

        File[] files = file.listFiles();
        for (File ml : files) {
            System.out.println(ml);//路径一起打印出来。
        }

    }

    public static void main(String[] args) {
        //show01();
        //show02();
        //show03();
        show04();
    }
}
