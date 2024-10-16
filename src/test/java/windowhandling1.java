import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowhandling1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        String url = "https://www.amazon.in/";
        driver.get(url);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 16 pro", Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[text()='Apple iPhone 16 Pro (128 GB) - Natural Titanium'])[2]")).click();
        Thread.sleep(2000);
        String w1 = driver.getWindowHandle();
        Set<String> w2 =driver.getWindowHandles();
        for(String s:w2){
            driver.switchTo().window(s);
        }
        System.out.println(w1);
        System.out.println(w2);

        driver.close();
    }
}