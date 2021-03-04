package day04.fileClass;

import java.io.File;

/**
 * @author JIAJUN KOU
 */

//file类
    //：file
    //：directory
    //:path

public class TestMain {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);

        String separator = File.separator;
        System.out.println(separator);
    }
}
