import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgeBrowers {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.close();
    }
}
