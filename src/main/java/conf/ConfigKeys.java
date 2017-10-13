package conf;

import java.io.File;

/**
 * Created by reus on 2017/10/12.
 */
public class ConfigKeys {
    public static final String DATABASE_ROOT_DIR = "database.root.dir" ;
    public static final String DATABASE_ROOT_DIR_DEFAULT = System.getProperty("user.dir") + File.separator + "data";
}
