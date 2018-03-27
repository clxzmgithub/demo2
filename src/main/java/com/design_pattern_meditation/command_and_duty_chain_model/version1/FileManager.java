package com.design_pattern_meditation.command_and_duty_chain_model.version1;

/**
 * @author xuzhongming
 * @since 26 三月 2018
 * <p>
 * 文件管理类比较复杂，和window操作系统关联，因此在此用示例代码
 */
public class FileManager {

    /**
     * ls命令
     */
    public static String ls(String path) {
        return "file1\nfile2\nfile3\nfile4";
    }

    /**
     * ls -l命令
     */
    public static String ls_l(String path) {
        String str = "drw-rw-rw root system 1024 2009-8-20 10:23 file1\n";
        str = str + "drw-rw-rw root system 1024 2009-8-20 10:23 file2\n";
        str = str + "drw-rw-rw root system 1024 2009-8-20 10:23 file3\n";
        return str;
    }

    /**
     * ls -a命令
     */
    public static String ls_a(String path) {

        String str = ".\n..\nfile1\nfile2\nfile3";
        return str;
    }
}
