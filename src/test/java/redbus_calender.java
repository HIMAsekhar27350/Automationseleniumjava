import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class redbus_calender {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(options);
        driver.get("https://www.redbus.in/");
    }
}
