import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrive {
    private static WebDriver driver;
    public static void webdrive_input() {
        String url;
        url="https://www.redbus.in";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
    public static WebDriver getDriver(){
        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
        }
    }
}
