import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windowhanding {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro", Keys.ENTER);
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Apple iPhone 15 Pro Max (256 GB) - Black Titanium']")).click();
        String w1 = driver.getWindowHandle();
        Set<String> w2 =driver.getWindowHandles();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        for(String s:w2){
            driver.switchTo().window(s);
        }
        Thread.sleep(3000);
        String name= driver.findElement(By.xpath("(//*[starts-with(@class,'a-list-item')])[61]")).getText();
        System.out.println(name);
        driver.quit();

    }

}
