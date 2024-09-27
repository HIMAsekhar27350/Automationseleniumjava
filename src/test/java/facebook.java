import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
    public static void main(String[] args) throws InterruptedException {
        String code,url,title;
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("9963600932");
        driver.findElement(By.id("pass")).sendKeys("HimaSekhar@123465");
        driver.findElement(By.id("loginbutton")).click();
        Thread.sleep(3000);
        code = driver.getPageSource();
        System.out.println(code);
        url = driver.getCurrentUrl();
        System.out.println("url="+url);
        title = driver.getTitle();
        System.out.println("Title="+title);
        // driver.close();
    }
}
