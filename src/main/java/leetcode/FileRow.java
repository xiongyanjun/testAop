package leetcode;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * @author : xiongyanjun  Date: 2020/11/3 ProjectName: settleprovisions Version: 1.0
 *
 * 统计文件夹下所有文件的行数总和
 *
 */
public class FileRow {
    private static long rows;

    public static void countRow(File file){
        if (true == file.isDirectory()){
            File[] files = file.listFiles();
            for (File f: files) {
                countRow(f);
            }
        }else {
            long lineNumber = getLineNumber(file);
            rows += lineNumber;
        }

    }

    public static void main(String[] args) {
        String path = "C:\\Users\\admin\\Desktop\\testRow";
        File file = new File(path);
        countRow(file);
        System.out.println(rows);
    }

    public static long getLineNumber(File file) {
        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
                LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
                lineNumberReader.skip(Long.MAX_VALUE);
                long lines = lineNumberReader.getLineNumber() + 1;
                fileReader.close();
                lineNumberReader.close();
                return lines;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
