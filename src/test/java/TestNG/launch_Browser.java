package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class launch_Browser {

    WebDriver driver;

    @BeforeClass
    public void lauchingBrowser()throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https:www.google.com");
        Thread.sleep(2000);
    }

    @AfterClass
    public void quit_Browser()throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }

}
