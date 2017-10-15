package client;

import conf.ConfigKeys;
import conf.Configuration;

import java.util.Scanner;

public class Client {

    private String pwd;
    private Configuration conf;

    public Client(){

    }

    public void init(){
        conf = Configuration.getInstance();
        pwd = conf.getProperty(ConfigKeys.DATABASE_ROOT_DIR);
    }

    public void execute(){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print(">>>");
            String ql = sc.nextLine();
            if (ql.equals("exit"))
                break;
            if(ql.equals("pwd"))
                System.out.println(pwd);
        }
    }

}
