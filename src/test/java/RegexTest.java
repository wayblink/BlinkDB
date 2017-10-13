import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static void main(String[] args){
        //simple regex
        String regex = "[a-zA-Z0-9._]{1,}";
        String content = "abc_fafw";
        System.out.println(content.matches(regex));

        //complete regex
        String content2 = "testContent";
        String regex2 = "^[a-zA-Z0-9\u4E00-\u9FA5]+$";
        Pattern pattern = Pattern.compile(regex2);
        Matcher match = pattern.matcher(content2);
        boolean b = match.matches();
        System.out.println(b);

        System.out.println("Illegal database name\n" +
                "Database name can only contains number, character, \".\" and \"_\"");
    }
}
