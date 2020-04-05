package Less_IO_NIO;

import java.io.*;
import java.util.Arrays;

public class SomeTextFileReader {
    public static void main(String[] args) {

        File file = new File("E:\\JAVA\\repository\\java-course\\CourseTV\\src\\Less_IO_NIO/someText.txt");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"))) {
            int str;
            while ((str = reader.read()) != -1)
                System.out.print((char) str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
