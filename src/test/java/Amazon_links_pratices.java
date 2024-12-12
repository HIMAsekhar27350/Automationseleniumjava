import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Amazon_links_pratices {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        int i = 1;
        driver.get("https://www.amazon.com/");
        List<WebElement> l = driver.findElements(By.tagName("div"));
        System.out.println("Total= "+ l.size());
        while (i <=l.size()){
            System.out.println(l.get(i).getText());
            System.out.println(i+" . " +l.get(i).getAttribute("id"));
            i++;
        }
        driver.close();
    }
}
