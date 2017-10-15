package command;

import util.IReader;

import java.util.ArrayList;
import java.util.List;

public class ReadTable {

    public static boolean readToCmd(String path){
        List<String> content = new ArrayList<String>();
        content = IReader.readAsList(path);
        for (int i = 0; i < content.size(); i++){
            System.out.println(content.get(i));
        }
        return true;
    }

    public static List<String> readStringList(String path){
        return IReader.readAsList(path);
    }

    public static String readString(String path){
        return IReader.readAsString(path);
    }
}
