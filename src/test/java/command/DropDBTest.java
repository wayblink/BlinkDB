package command;

import conf.ConfigKeys;
import conf.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.FileUtil;

import java.io.File;

import static org.junit.Assert.assertTrue;

public class DropDBTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void cleanUp() throws Exception {
        FileUtil.delFolder(Configuration.getInstance().getProperty(ConfigKeys.DATABASE_ROOT_DIR) + File.separator + "testdb");
    }

    @Test
    public void testDropDB() {
        boolean createSuccess = false;
        boolean dropSuccess = false;
        try {
            createSuccess = CreateDB.execute("testDb");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertTrue(createSuccess);
        try {
            dropSuccess = DropDB.execute("testDb");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertTrue(dropSuccess);


    }
}
