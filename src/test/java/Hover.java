import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Hover {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        WebElement m = driver.findElement(By.xpath("(//img)[4]"));
        act.moveToElement(m);
        act.build().perform();
        Thread.sleep(3000);
        WebElement m2 = driver.findElement(By.xpath("(//img)[2]"));
        act.moveToElement(m2);
        act.build().perform();
        Thread.sleep(3000);
        WebElement m3 = driver.findElement(By.xpath("(//img)[3]"));
        act.moveToElement(m3);
        act.build().perform();
        Thread.sleep(3000);

        driver.close();
    }
}
