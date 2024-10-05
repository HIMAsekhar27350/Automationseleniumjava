import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPrompt {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(3000);
        Alert a = driver.switchTo().alert();
        Thread.sleep(2000);
        a.sendKeys("Hi Hello Roman");
        Thread.sleep(3000);
        a.accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        a.dismiss();
        Thread.sleep(3000);
        driver.close();


    }
}