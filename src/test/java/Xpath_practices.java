import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static com.sun.tools.attach.VirtualMachine.list;

public class Xpath_practices {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Navigate to Flipkart
        driver.get("https://www.flipkart.com/");

        // Close the login popup if it appears
        WebElement loginText1 = driver.findElement(By.xpath("//a[text()='Login']"));
        if (loginText1.isDisplayed()) {
            System.out.println("Login button is Displayed: " + loginText1.getText());
        } else {
            System.out.println("Login button is not there in the web page");
        }
        List<WebElement> items = driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']"));
        System.out.println("Size of Items = "+items.size());
        int i = 1;
        for (WebElement w : items) {
            System.out.println(i + "." + w.getText());
            i++;
        }
        WebElement Fashion_TEXT= driver.findElement(By.xpath("//span[text()='Fashion']"));
        Actions a = new Actions(driver);
        a.moveToElement(Fashion_TEXT);
        a.build().perform();
        Thread.sleep(2000);
        driver.quit();
    }
}
