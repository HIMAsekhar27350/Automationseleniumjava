import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Thread.sleep(3000);
        Actions a = new Actions(driver);
        WebElement drag = driver.findElement(By.xpath("//div[@id = 'column-a']"));
        WebElement drop = driver.findElement(By.xpath("//div[@id = 'column-b']"));
        a.dragAndDrop(drop,drag);
        a.dragAndDrop(drag,drop);
        a.perform();
    }
}
