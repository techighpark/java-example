package ch8;

import java.io.File;

public class ExceptionEx21 {
    public static void main(String[] args) {
        File f = createFile(args[0]);
        System.out.println(f.getName() + " The file has been successfully created.");
    }

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals(""))
                throw new Exception("Invalid File Name.");
        } catch (Exception e) {
            fileName = "untitled.txt";
        } finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }

    static void createNewFile(File f) {
        try {
            f.createNewFile();
        } catch (Exception e) {
            System.out.println("created exception occurred.");
        }
    }
}
