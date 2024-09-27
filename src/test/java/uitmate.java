import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uitmate {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://ultimateqa.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(2, 400);");
        for (int i = 0; i < 40; i++)
        {  // Scroll 10 times
            js.executeScript("window.scrollBy(0, 200);");  // Scroll down by 400 pixels
            Thread.sleep(200);  // Wait for 0.5 seconds between each scroll

        }
        Thread.sleep(2000);
        for (int i = 0; i < 40 ;i++)

        {
            js.executeScript("window.scrollBy(0,-200);");
            Thread.sleep(200);
        }
        driver.close();
    }
}
