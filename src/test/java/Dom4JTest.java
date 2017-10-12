import java.io.File;
import java.util.List;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class Dom4JTest {

    public static void main(String[] args) throws Exception {
        SAXReader reader = new SAXReader();
        File file = new File(System.getProperty("user.dir")+"/src/main/resources/properties.xml");
        Document document = reader.read(file);
        Element root = document.getRootElement();
        List<Element> properties = root.elements();
        System.out.println(properties.size());
        for (Element property : properties) {
            //未知属性名情况下
//            List<Attribute> attributeList = property.attributes();
//            for (Attribute attr : attributeList) {
//                System.out.println(attr.getName() + ": " + attr.getValue());
//            }

            //已知属性名情况下
//            System.out.println("id: " + property.attributeValue("id"));

            //未知子元素名情况下
            List<Element> elementList = property.elements();
            System.out.println(elementList.size());
            for (Element ele : elementList) {
                System.out.println(ele.getName() + ": " + ele.getText());
            }
            System.out.println();

            //已知子元素名的情况下
//            System.out.println("title" + property.elementText("title"));
//            System.out.println("author" + property.elementText("author"));
            //这行是为了格式化美观而存在
//            System.out.println();
        }
    }
}
