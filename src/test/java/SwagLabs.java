import com.google.j2objc.annotations.Weak;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        String code,url,titile;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);
        for (int i =0;i < 2;i++){
            js.executeScript("window.scrollBy(0,200);");
            Thread.sleep(200);
        }
        Thread.sleep(2000);
        for (int i =0;i < 2;i++){
            js.executeScript("window.scrollBy(0,-200);");
            Thread.sleep(200);
        }
        Thread.sleep(2000);
        driver.findElement(By.linkText("Sauce Labs Backpack")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("add-to-cart")).click();
        Thread.sleep(3000);
        //driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='back-to-products']")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Sauce Labs Bike Light")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("add-to-cart")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='back-to-products']")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("first-name")).sendKeys("Hima");
        Thread.sleep(1000);
        driver.findElement(By.id("last-name")).sendKeys("Sekhar");
        Thread.sleep(1000);
        driver.findElement(By.id("postal-code")).sendKeys("517247");
        Thread.sleep(1000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(3000);
        for (int i =0;i < 4;i++){
            js.executeScript("window.scrollBy(0,200);");
            Thread.sleep(200);
        }
        Thread.sleep(3000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("About")).click();
        Thread.sleep(3000);
        for (int i =0;i < 14;i++){
            js.executeScript("window.scrollBy(0,200);");
            Thread.sleep(200);
        }
        Thread.sleep(3000);
        for (int i =0;i < 14;i++){
            js.executeScript("window.scrollBy(0,-200);");
            Thread.sleep(200);
        }
        code = driver.getPageSource();
        url = driver.getCurrentUrl();
        titile = driver.getTitle();
        System.out.println("code = "+code);
        System.out.println("url = "+url);
        System.out.println("Title = "+titile);
        driver.close();
    }
}
