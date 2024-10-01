import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.TreeMap;

public class Web_Form_Partices {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement ele = driver.findElement(By.xpath("//h1[@class='display-6']"));
        String first_name= ele. getText();
        System.out.println(first_name);
        if(first_name.equalsIgnoreCase("web form")){
            System.out.println("The Given Case is Passed");
        }else {
            System.out.println("The Given Case is Failed");
        }
        driver.findElement(By.id("my-text-id")).sendKeys("Hima Sekhar");
        driver.findElement(By.name("my-password")).sendKeys("Hima@123456");
        Thread.sleep(3000);
        driver.findElement(By.name("my-textarea")).sendKeys("Hi,This is the Hima Sekhar , iam learning the java and selenium programs");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Return to index")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("blank.html")).click();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        Select ele1 = new Select(driver.findElement(By.name("my-select")));
        ele1.selectByValue("2");
        Thread.sleep(3000);
        driver.findElement(By.name("my-file")).sendKeys("C:\\Users\\HIMA SEKHAR V\\OneDrive\\Desktop\\9346744413h@gmail.com.pdf");
        Thread.sleep(3000);
        driver.findElement(By.name("my-check")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("my-radio-2")).click();
        Thread.sleep(3000);
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
