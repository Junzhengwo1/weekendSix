package day06.FileFilterClass;

import java.io.File;
import java.io.FileFilter;

/**
 * @author JIAJUN KOU
 */
public class FileFilterImpl implements FileFilter {
    //重写accept方法
    @Override
    public boolean accept(File pathname) {
        //过滤的规则； 判断File对象是不是以.java文件结尾的。
        //还要判断是不是文件夹，如果是  就再次过滤
        if(pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
