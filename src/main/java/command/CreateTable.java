package command;

import conf.ConfigKeys;
import conf.Configuration;
import util.FileUtil;

import java.io.File;

public class CreateTable {

    public static boolean execute(String path){
        return FileUtil.newFile(path);
    }
}
