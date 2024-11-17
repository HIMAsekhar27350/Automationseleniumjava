import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class myDetails {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\HIMA SEKHAR V\\IdeaProjects\\Automationseleniumjava\\src\\test\\java\\hima.properties");
        Properties p=new Properties();
        p.load(fis);
        System.out.println(p.getProperty("name"));
        System.out.println(Integer.parseInt(p.getProperty("age"))+25);
        System.out.println(p.getProperty("height"));
    }
}
