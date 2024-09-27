import com.google.j2objc.annotations.Weak;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class website {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://mysiteonly.pythonanywhere.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.navigate().refresh();
        WebElement button= driver.findElement(By.cssSelector(".button.icon.solid.solo.fa-arrow-down.scrolly"));
        button.click();
        Thread.sleep(3000);
        WebElement aboutlink= driver.findElement(By.linkText("ABOUT"));
        aboutlink.click();
        Thread.sleep(3000);
        WebElement projectslink=driver.findElement(By.linkText("PROJECTS"));
        projectslink.click();
        Thread.sleep(3000);
        WebElement myresumelink=driver.findElement(By.linkText("MY RESUME"));
        myresumelink.click();
        Thread.sleep(3000);
        WebElement homelink=driver.findElement(By.linkText("HOME"));
        homelink.click();
        Thread.sleep(3000);
        for (int i = 0; i < 4; i++) {
            driver.navigate().back();
            Thread.sleep(3000);
        }
        for (int i = 0; i < 4; i++) {
            driver.navigate().forward();
            Thread.sleep(3000);
        }
        driver.close();


    }
}
