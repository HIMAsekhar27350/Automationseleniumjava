import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(6000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15", Keys.ENTER);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("moondal");
        Thread.sleep(3000);
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lays",Keys.ENTER);
        //driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.close();

    }
}