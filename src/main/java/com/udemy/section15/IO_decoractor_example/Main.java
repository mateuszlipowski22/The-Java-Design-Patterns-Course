package com.udemy.section15.IO_decoractor_example;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        int c;

        try {
            InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/main/java/com/udemy/section15/IO_decoractor_example/text.txt")));

            while ((c=inputStream.read())>0){
                System.out.print((char) c);
            }
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
