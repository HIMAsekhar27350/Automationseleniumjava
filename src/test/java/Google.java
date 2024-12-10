
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {
    public static void main(String[] args) throws InterruptedException {
        String code ,url ,title;
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops=new ChromeOptions();
        ops.addArguments("--headless");
        driver= new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        /*WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        EdgeOptions ops=new EdgeOptions();
        ops.addArguments("--headless");
        driver.get("https://www.google.com");
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.get("https://www.google.com");
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
        System.out.println(code);*/
        url =driver.getCurrentUrl();
        System.out.println(url);
        title = driver.getTitle();
        System.out.println(title);
        driver.close();

    }
}
