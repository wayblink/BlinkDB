import util.FileUtil;

/**
 * Created by reus on 2017/10/12.
 */
public class FileUtilTest {

    public static void main(String[] args){
        //System.out.print(System.getProperty("user.dir"));//输出项目的根目录
        FileUtil.newFile(System.getProperty("user.dir")+"/fir/abc/temp");
//        FileUtil.newFolder(Configuration.DATABASE_ROOT_DIRECTORY);
//        FileUtil.newFolder(Configuration.DATABASE_ROOT_DIRECTORY+"/database");
    }

}
