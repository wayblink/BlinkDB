package command;

import conf.ConfigKeys;
import conf.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.FileUtil;

import java.io.File;

import static org.junit.Assert.assertTrue;

public class CreateTableTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void cleanUp() throws Exception {
        FileUtil.delFolder(Configuration.getInstance().getProperty(ConfigKeys.DATABASE_ROOT_DIR) + File.separator + "testdb");
    }

    @Test
    public void testCreateTable() {
        boolean isSuccess = false;
        try {
            String root = Configuration.getInstance().getProperty(ConfigKeys.DATABASE_ROOT_DIR);
            isSuccess = CreateDB.execute(root + File.separator + "testdb")
            &&CreateTable.execute(root + File.separator + "testdb" + File.separator + "testtable");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertTrue(isSuccess);
    }
}
