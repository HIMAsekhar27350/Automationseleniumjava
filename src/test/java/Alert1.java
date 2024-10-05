import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(3000);
        //we will use this type of xpath also = "(//button)[3]"
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(3000);
        Alert a = driver.switchTo().alert();
        Thread.sleep(2000);
        a.dismiss();
        driver.close();

    }
}
