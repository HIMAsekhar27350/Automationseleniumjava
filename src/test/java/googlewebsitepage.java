import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.Assertion;

public class googlewebsitepage {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");
        driver=new ChromeDriver(options);
        driver.get("https:www.google.com");
        System.out.println(driver.getTitle());
        String real_title=driver.getTitle();
        String ex_title="Goole";
        Assertion a=new Assertion();
        a.assertEquals(real_title,ex_title,"both are not equal");
        if(ex_title.equalsIgnoreCase(real_title)){
            System.out.println(real_title+" and "+ex_title+" both are True ");
        }else {
            System.out.println(real_title+" and "+ex_title+" both are False ");
        }
        driver.quit();
    }
}
