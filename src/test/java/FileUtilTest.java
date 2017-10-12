/**
 * Created by reus on 2017/10/12.
 */
public class FileUtilTest {

    public static void main(String[] args){
        FileUtil.newFolder(Configuration.DATABASE_ROOT_DIRECTORY);
        FileUtil.newFolder(Configuration.DATABASE_ROOT_DIRECTORY+"/database");
    }

}
