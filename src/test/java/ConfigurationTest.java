import java.util.Map;

/**
 * Created by reus on 2017/10/12.
 */
public class ConfigurationTest {

    public static void main(String[] args){
        Configuration conf1 = Configuration.getInstance();
        Configuration conf2 = Configuration.getInstance();
        System.out.println(conf1==conf2);

        Map<String,String> map = conf1.getPropertyMap();
        System.out.println(map.size());
        System.out.println(conf1.getOrDefault(ConfigKeys.DATABASE_ROOT_DIR, ConfigKeys.DATABASE_ROOT_DIR_DEFAULT));
    }
}
