package util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by reus on 2017/10/12.
 * Base interface to read files
 */
public class IReader {

    public static String readAsString(String filePath) {
            String str="";
            File file=new File(filePath);
            try {
                FileInputStream in=new FileInputStream(file);
                // size  为字串的长度 ，这里一次性读完
                int size=in.available();
                byte[] buffer=new byte[size];
                in.read(buffer);
                in.close();
                str=new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    public static List<String> readAsList(String filePath){
        List<String> resultList = new ArrayList<String>();
        try {
            File file = new File(filePath);
            // 读取文件，并且以utf-8的形式写出去
            BufferedReader bufread;
            String read;
            bufread = new BufferedReader(new FileReader(file));
            while ((read = bufread.readLine()) != null) {
                resultList.add(read);
            }
            bufread.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return resultList;
    }

    //以下暂时不用
    public static void readByBufferedReader(String fileName) {
        try {
            File file = new File(fileName);
            // 读取文件，并且以utf-8的形式写出去
            BufferedReader bufread;
            String read;
            bufread = new BufferedReader(new FileReader(file));
            while ((read = bufread.readLine()) != null) {
                System.out.println(read);
            }
            bufread.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readFileByBytes(String filePath) {
        // 一般先创建file对象
        FileInputStream fileInput = null;
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            byte[] buffer = new byte[1024];
            fileInput = new FileInputStream(file);
            int byteread = 0;
            // byteread表示一次读取到buffers中的数量。
            while ((byteread = fileInput.read(buffer)) != -1) {
                System.out.write(buffer, 0, byteread);
            }

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

            try {
                if (fileInput != null) {
                    fileInput.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

    public static void readFileByChars(String fileName) {
        FileReader reader = null;
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            reader = new FileReader(file);
            char[] buffer = new char[1024];
            int charread = 0;
            while ((charread = reader.read(buffer)) != -1) {
                System.out.print(buffer);
            }
        } catch (IOException e) {
            // TODO: handle exception

        } finally {

            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }



}
