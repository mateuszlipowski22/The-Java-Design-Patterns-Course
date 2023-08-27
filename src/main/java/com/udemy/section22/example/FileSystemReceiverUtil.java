package com.udemy.section22.example;

public class FileSystemReceiverUtil {

    public static FileSystemReceiver getUnderLayingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlaying OS is "+osName);

        if(osName.contains("Windows")){
            return new WindowsFileSystemReceiver();
        }else {
            return new UnixFileSystemReceiver();
        }
    }

}
