import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFacebook {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Hima");
        driver.findElement(By.name("lastname")).sendKeys("Sekhar");
        WebElement date = driver.findElement(By.id("day"));
        Select day_date = new Select(date);
        day_date.selectByIndex(24);
        WebElement months = driver.findElement(By.id("month"));
        Select mon = new Select(months);
        mon.selectByIndex(11);
        WebElement years =driver.findElement(By.name("birthday_year"));
        Select y = new Select(years);
        y.selectByValue("1999");
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        driver.findElement(By.name("reg_email__")).sendKeys("himasekhar286425@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("Hima@123465");
        Thread.sleep(3000);
        driver.close();
    }
}
