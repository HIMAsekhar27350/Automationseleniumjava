import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(3000);
       List< WebElement> lang = driver.findElements(By.xpath("//select[@id ='searchLanguage']/option"));
        System.out.println("Total languages = " +lang.size());
        int i = 1;
        for (WebElement w :lang ){
            System.out.println(i+". "+w.getText());
            i++;
        }
        WebElement l =driver.findElement(By.id("searchLanguage"));
        Select s = new Select(l);
        s.selectByVisibleText("Ελληνικά");
        Thread.sleep(3000);
        s.selectByValue("eo");
        Thread.sleep(3000);
        s.selectByIndex(6);
        Thread.sleep(3000);
        driver.close();

    }
}
