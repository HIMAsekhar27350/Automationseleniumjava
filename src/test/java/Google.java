import com.google.j2objc.annotations.Weak;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) throws InterruptedException {
        String code ,url ,title;
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Images")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.linkText("हिन्दी")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.linkText("বাংলা")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.linkText("తెలుగు")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.linkText("मराठी")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.linkText("தமிழ்")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.linkText("ગુજરાતી")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.linkText("ಕನ್ನಡ")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.linkText("മലയാളം")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.linkText("ਪੰਜਾਬੀ")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Ima")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        code = driver.getPageSource();
        System.out.println(code);
        url =driver.getCurrentUrl();
        System.out.println(url);
        title = driver.getTitle();
        System.out.println(title);

        driver.close();

    }
}
