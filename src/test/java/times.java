import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class times {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.ilovepdf.com/word_to_pdf");
        List<WebElement>text=driver.findElements(By.cssSelector(".tool__header__title"));
        for (WebElement w:text){
            System.out.println(w.getText());
        }
    }
}
