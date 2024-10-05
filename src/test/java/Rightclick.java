import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Thread.sleep(3000);
        Actions a = new Actions(driver);
        WebElement right_cilck = driver.findElement(By.id("hot-spot"));
        //WebElement drop = drag.findElement(By.xpath("//div[@id = 'column-b']"));
        a.contextClick(right_cilck);
        a.perform();
        Thread.sleep(3000);
        Alert a1 = driver.switchTo().alert();
        a1.accept();
        driver.close();
    }
}
