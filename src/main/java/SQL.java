import java.util.ArrayList;

/**
 * Created by reus on 2017/10/12.
 * The structure of a SQL
 */
public class SQL {

    private boolean isSelect;
    private boolean isAdd;
    private boolean isDel;
    private boolean isUpdate;

    private String table_name;
    private String database_name;

    private ArrayList<String> queryColumns;
}
