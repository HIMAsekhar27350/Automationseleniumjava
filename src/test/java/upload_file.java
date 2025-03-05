import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_file {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\HIMA SEKHAR V\\Downloads\\Hi, my name is V Hima Sekhar. I hav.txt");
        Thread.sleep(2000);
        driver.quit();
    }
}
