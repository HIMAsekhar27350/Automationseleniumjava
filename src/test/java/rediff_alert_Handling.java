import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff_alert_Handling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(3000);
        driver.findElement(By.name("login")).sendKeys("Hima sekhar");
        Thread.sleep(3000);
        driver.findElement(By.name("proceed")).click();
        Thread.sleep(3000);
        Alert a = driver.switchTo().alert();
        a.accept();
        Thread.sleep(3000);
        driver.close();
    }
}
