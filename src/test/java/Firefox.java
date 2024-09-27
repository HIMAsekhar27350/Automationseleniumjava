import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {
        System.setProperty("Webdriver.gecko.driver","C:\\Users\\HIMA SEKHAR V\\IdeaProjects\\Automationseleniumjava\\Browers\\geckodriver.exe");
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.get("https://google.com");

    }
}
