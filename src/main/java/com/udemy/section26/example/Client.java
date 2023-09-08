package com.udemy.section26.example;

public class Client {

    public static void main(String[] args) {
        FileWriterCaretaker fileWriterCaretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriterUtil = new FileWriterUtil("data.txt");

        fileWriterUtil.write("First set of data \n Mateusz \n Beata \n Antos\n");

        System.out.println(fileWriterUtil+"\n");
        fileWriterCaretaker.save(fileWriterUtil);

        fileWriterUtil.write("Second set of data \n Rozalia");
        System.out.println(fileWriterUtil+"\n");

        fileWriterCaretaker.undo(fileWriterUtil);
        System.out.println(fileWriterUtil+"\n");

    }

}
