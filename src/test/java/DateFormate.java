import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DateFormate {
    WebDriver driver;
    @BeforeMethod
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
    @Test
    public void Date_picker() throws InterruptedException {
        WebElement demo_iframe= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(demo_iframe);
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        Thread.sleep(2000);
        String expected_date="December2025";
        String month="";
        String year="";
        String actual_date="";
        while (true){
            month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            actual_date=month+year;

            if(expected_date.equalsIgnoreCase(actual_date)){
                break;
            }
            driver.findElement((By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"))).click();
        }
       WebElement DOB= driver.findElement(By.xpath("//a[contains(text(),'25')]"));
        DOB.click();
        System.out.println(DOB.getText());
        System.out.println(actual_date);
    }
    @AfterMethod
    public void close_page() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
