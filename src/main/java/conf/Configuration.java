package conf;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Configuration {


    //配置项键值对
    private Map<String,String> propertyMap = new HashMap<String, String>();

    public String getOrDefault(String key, String defaultValue){
        String trueValue = propertyMap.get(key);
        if(trueValue == null||trueValue == ""){
            return defaultValue;
        }else{
            return trueValue;
        }
    }

    //Singeleton pattren
    private static class SingletonHolder {
        private static final Configuration INSTANCE = new Configuration();
    }

    public static Configuration getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private Configuration (){
        SAXReader reader = new SAXReader();
        File file = new File(System.getProperty("user.dir")+"/src/main/resources/properties.xml");
        Document document = null;
        try {
            document = reader.read(file);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        Element xmlRoot = document.getRootElement();
        List<Element> properties = xmlRoot.elements();
        for (Element property : properties) {
            List<Element> eleList = property.elements();
            Map<String,String> tempMap = new HashMap();
            for (Element ele : eleList) {
                tempMap.put(ele.getName(),ele.getText());
            }
            propertyMap.put(tempMap.get("name"),tempMap.get("value"));
        }
    }

    //Getters && Setters
    public Map<String, String> getPropertyMap() {
        return propertyMap;
    }

    public String getProperty(String key){
        return propertyMap.get(key);
    }
}
