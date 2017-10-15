package command;

import util.IWriter;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class WriteTable {


    public static boolean writeFromCmd(String path) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String ql = sc.nextLine();
            if (ql.equals("exit"))
                break;
            writeString(path,ql+"\n");
        }
        return true;
    }

    public static boolean writeString(String path, String content) {
        File file = new File(path);
        IWriter.writeString(content,file);
        return true;
    }

    public static boolean writeStringList(String path, List<String> content) {
        File file = new File(path);
        IWriter.writeStringList(content, file);
        return true;
    }
}
