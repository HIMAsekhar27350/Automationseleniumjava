import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

// lanch the chrome brower land on bookmyshow.com website and count no of due taxes
public class HyperLinkstags {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://in.bookmyshow.com/");
        List<WebElement> links = driver.findElements(By.tagName("div"));
        int i = 1;
        System.out.println("BookMyShow Website Count: "+
                links.size());
    }
}
