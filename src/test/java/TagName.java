import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class TagName {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https:www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total Number of Hyper Links = "+links.size());
        for(WebElement w : links ){
            System.out.println(w.getText()+"----->"+w.getAttribute("href"));
            //System.out.println(w.getAttribute("href"));
        }
        driver.close();

    }
}
