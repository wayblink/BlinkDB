package command;

import util.FileUtil;

public class DropTable {

    public static boolean execute(String path) throws Exception {
        return FileUtil.delFile(path);
    }
}
