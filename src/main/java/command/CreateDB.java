package command;

import conf.ConfigKeys;
import conf.Configuration;
import util.FileUtil;

import java.io.File;

public class CreateDB {
    static Configuration conf = Configuration.getInstance();

    public static boolean execute(String path) throws Exception {
        if(checkInputPath(path)){
            FileUtil.newFolder(conf.getOrDefault(
                    ConfigKeys.DATABASE_ROOT_DIR,
                    ConfigKeys.DATABASE_ROOT_DIR_DEFAULT)
                    + File.separator + path);
            return true;
        }else {
            throw new Exception("Illegal database name. " +
                    "Database name can only contains " +
                    "number, letter, \".\" and \"_\"");
        }
    }

    private static boolean checkInputPath(String path){
        return path.matches("[a-zA-Z0-9._]{1,}");
    }

}
