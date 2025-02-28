import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.Assertion;

import java.util.List;

public class googlewebsitepage {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");
        driver=new ChromeDriver(options);
        driver.get("https:www.google.com");
        System.out.println(driver.getTitle());
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Size of links having the tagname 'a' "+links.size());
        for (WebElement w:links){
            System.out.println(w.getAttribute("href"));
        }
        System.out.println(" ***** *** * ** * * * **   - ");
        List<WebElement>src=driver.findElements(By.tagName("link"));
        System.out.println("Count = "+src.size());
        for (WebElement w1:src){
            System.out.println(w1.getAttribute("rel"));
        }
        WebElement email=driver.findElement(By.className("gb_W"));
        System.out.println(email.getText());
        System.out.println(email.isDisplayed());
        System.out.println(email.getSize());
        System.out.println(email.getAttribute("class"));
        System.out.println(email.getAttribute("href"));
        System.out.println(email.getAttribute("data-pid"));
        driver.quit();
    }
}
