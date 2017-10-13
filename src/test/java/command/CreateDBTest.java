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

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void cleanUp() throws Exception {
        FileUtil.delFolder(Configuration.getInstance().getProperty(ConfigKeys.DATABASE_ROOT_DIR) + File.separator + "testdb");
    }

    @Test
    public void testCreateDB() {
        boolean isSuccess = false;
        try {
            isSuccess = CreateDB.execute("testDb");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertTrue(isSuccess);
    }
}
