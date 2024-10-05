import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HyperLinks_website_heroku {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.heroku.com/");
        List<WebElement>links = driver.findElements(By.tagName("a"));
        System.out.println("In Website Heroku Hyperlinks "+links.size());
        int i = 1;
        while (i <=links.size()){
            //System.out.println(links.get(i).getText());
            System.out.println(i+" "+links.get(i).getAttribute("class"));
            i++;
        }
        driver.close();
    }
}
