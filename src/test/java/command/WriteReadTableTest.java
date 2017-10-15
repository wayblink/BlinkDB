package command;

import conf.ConfigKeys;
import conf.Configuration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import util.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WriteReadTableTest {

    String root = Configuration.getInstance().getProperty(ConfigKeys.DATABASE_ROOT_DIR);

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void cleanUp() throws Exception {
        FileUtil.delFolder(root + File.separator + "testdb");
    }

    @Test
    public void writeAndReadString() {
        String writeContent = "testString";
        String path = root + File.separator + "testdb" + File.separator + "testtable";
        if(createTable()){
            WriteTable.writeString(path, writeContent);
            String readContent = ReadTable.readString(path);
            Assert.assertEquals("输入输出匹配", writeContent,readContent.trim());
        }
    }

    @Test
    public void writeAndReadFromCmd() {
        List<String> writeContent = new ArrayList<String>();
        writeContent.add("string1");
        writeContent.add("string2");
        writeContent.add("string3");
        String path = root + File.separator + "testdb" + File.separator + "testtable";
        if(createTable()){
            WriteTable.writeStringList(path, writeContent);
            List<String> readContent = ReadTable.readStringList(path);
            Assert.assertEquals("输入输出匹配", writeContent,readContent);
        }
    }

    private boolean createTable(){
        boolean isSuccess = false;
        try {
            isSuccess = CreateDB.execute(root + File.separator + "testdb")
                    &&CreateTable.execute(root + File.separator + "testdb" + File.separator + "testtable");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isSuccess;
    }


}
