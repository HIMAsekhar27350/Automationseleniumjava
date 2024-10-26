import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class notifications_handling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        String url,Xpath,hover,hover1,hover2,hover3,hover4,hover5;
        Xpath="(//*[starts-with(@d,'M13')])[3]";
        url = "https://www.indusind.com/";
        hover = "//a[text()='Products']";
        hover1="//a[text()='Accounts']";
        hover2 ="//a[@href='javascript:;'][normalize-space()='Deposit']";
        hover3 ="//a[@href='javascript:;'][normalize-space()='Loans']";
        hover4="//a[@href='javascript:;'][normalize-space()='Cards']";
        hover5="//a[@href='javascript:;'][normalize-space()='Insurance']";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath(Xpath)).click();
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        WebElement w = driver.findElement(By.xpath(hover));
        act.moveToElement(w);
        act.build().perform();
        //Thread.sleep(3000);
        WebElement w1 =driver.findElement(By.xpath(hover1));
        act.moveToElement(w1);
        act.build().perform();
        //Thread.sleep(2000);
        WebElement w2 =driver.findElement(By.xpath(hover2));
        act.moveToElement(w2);
        act.build().perform();
        //Thread.sleep(2000);
        WebElement w3 =driver.findElement(By.xpath(hover3));
        act.moveToElement(w3);
        act.build().perform();
        //Thread.sleep(2000);
        WebElement w4 =driver.findElement(By.xpath(hover4));
        act.moveToElement(w4);
        act.build().perform();
        //Thread.sleep(2000);
        //Thread.sleep(2000);
        WebElement w5 =driver.findElement(By.xpath(hover5));
        act.moveToElement(w5);
        act.build().perform();
        /*List<WebElement> text =driver.findElements(By.xpath("(//div[@class='col-3 ']//ul//li//a)"));
        for (WebElement ele : text){
            System.out.println("----------->"+ele.getText());
        }*/
        driver.close();
    }
}
