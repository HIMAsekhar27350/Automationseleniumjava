import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HyperLinks_Amazon {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);
        int i = 1;
        List<WebElement> links =driver.findElements(By.tagName("a"));
        System.out.println("In Amazon Website HyperLinks = "+links.size());
       while (i<=links.size()){
           System.out.println(i+" " +links.get(i).getText());
           System.out.println(links.get(i).getAttribute("href"));
            i++;
        }
    }
}
