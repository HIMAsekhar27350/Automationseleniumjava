import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Date {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.cleartrip.com/");
        Thread.sleep(2000);
        Actions a=new Actions(driver);
        WebElement notification=driver.findElement(By.xpath("(//*[starts-with(@d,'M18')])[3]"));
        a.moveToElement(notification);
        a.click().perform();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".w-100p.fs-16.fw-500.c-neutral-900")).sendKeys("hyd");
        Thread.sleep(2000);
        List<WebElement> fromsourceDisnation=driver.findElements(By.xpath("//div[@class='dropdown p-absolute t-13 ln-1 w-100p']//ul/li"));
        System.out.println("Total = "+fromsourceDisnation.size());
        int i =1;
        for(WebElement w:fromsourceDisnation){
            System.out.println(i+" = "+w.getText());
            i++;
            if(w.getText().startsWith("HYD")){
                w.click();
                break;
            }
        }
        driver.findElement(By.cssSelector(".w-100p.fs-16.fw-500.c-neutral-900")).sendKeys("ban");
        Thread.sleep(2000);
        List<WebElement> tosourceDisnation=driver.findElements(By.xpath("//div[@class='dropdown p-absolute t-13 ln-1 w-100p']//ul/li"));
        Thread.sleep(2000);
        System.out.println("Total = "+tosourceDisnation.size());
        for (WebElement w1:tosourceDisnation){
            System.out.println(i+" = "+w1.getText());
            i++;
            if(w1.getText().startsWith("BLR")){
                w1.click();
                break;
            }
        }
        driver.quit();
    }
}
