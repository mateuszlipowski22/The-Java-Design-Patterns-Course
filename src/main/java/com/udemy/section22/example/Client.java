package com.udemy.section22.example;

public class Client {

    public static void main(String[] args) {

        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getUnderLayingFileSystem();

        OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);

        FileInvoker fileInvoker = new FileInvoker(openFileCommand);

        fileInvoker.execute();

        WriteFileCommand writeFileCommand=new WriteFileCommand(fileSystemReceiver);
        fileInvoker=new FileInvoker(writeFileCommand);
        fileInvoker.execute();

        CloseFileCommand closeFileCommand=new CloseFileCommand(fileSystemReceiver);
        fileInvoker=new FileInvoker(closeFileCommand);
        fileInvoker.execute();

    }

}
