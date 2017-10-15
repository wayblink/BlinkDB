package command;

import conf.ConfigKeys;
import conf.Configuration;
import util.FileUtil;

import java.io.File;

public class CreateDB {

    public static boolean execute(String path){
        return FileUtil.newFolder(path);
    }


}
