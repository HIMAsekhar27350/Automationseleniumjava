import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Doubleclick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
        Actions a = new Actions(driver);
        WebElement double_click = driver.findElement(By.id("doubleClickBtn"));
        a.doubleClick(double_click);
        a.perform();
        //Thread.sleep(3000);
        driver.close();
    }
}
