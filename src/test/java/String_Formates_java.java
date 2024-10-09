import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class String_Formates_java {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        String url = "https:www.google.com";
        String code,title,page_source;
        driver.get(url);
        driver.manage().window().maximize();
        code = driver.getCurrentUrl();
        System.out.println(code);
        title =driver.getTitle();
        System.out.println(title);
        page_source = driver.getPageSource();
        System.out.println(page_source);
        driver.close();
    }
}
