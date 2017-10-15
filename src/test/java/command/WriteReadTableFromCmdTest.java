package command;

import conf.ConfigKeys;
import conf.Configuration;

import java.io.File;

public class WriteReadTableFromCmdTest {

    public static void main(String[] args){
        String root = Configuration.getInstance().getProperty(ConfigKeys.DATABASE_ROOT_DIR);

        boolean success = CreateDB.execute(root + File.separator + "testdb")&&
            CreateTable.execute(root + File.separator + "testdb" + File.separator + "testtable");

        if(success){
            WriteTable.writeFromCmd(root + File.separator + "testdb" + File.separator + "testtable");
            ReadTable.readToCmd(root + File.separator + "testdb" + File.separator + "testtable");
        }
    }


}
