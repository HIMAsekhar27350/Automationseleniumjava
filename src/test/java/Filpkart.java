import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Filpkart {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        System.out.println(" In 'a' tagname links = "+links.size());
        System.out.println("In 'a' tagname getting text ======== ");
        for (WebElement w : links){
            System.out.println(w.getText()+"-------> "+w.getAttribute("href"));
        }
        driver.close();
    }
}
