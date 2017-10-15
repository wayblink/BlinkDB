package command;

import static org.junit.Assert.*;

import conf.ConfigKeys;
import conf.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.FileUtil;

import java.io.File;

public class CreateDBTest {

    private Configuration conf = Configuration.getInstance();
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void cleanUp() throws Exception {
        FileUtil.delFolder(conf.getProperty(ConfigKeys.DATABASE_ROOT_DIR) + File.separator + "testdb");
    }

    @Test
    public void testCreateDB() {
        boolean isSuccess = false;
        try {
            isSuccess = CreateDB.execute(conf.getProperty(ConfigKeys.DATABASE_ROOT_DIR) + File.separator + "testdb");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertTrue(isSuccess);
    }
}
