
/**
 * Created by reus on 2017/10/12.
 */
public class SQLProcessor {

    public void process(String SQLString){
        SQL sql = new SQL();
        try{
            sql = SQLParser.parse(SQLString);
        }catch(SQLException e){
            e.printStackTrace();
        }

        //read data

        //process data

        //write data

        //output data


    }
}
