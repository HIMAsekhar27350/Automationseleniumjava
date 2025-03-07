import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class facebook_file {
    @Test(dataProvider = "bharath")
    public void lanuch(String username,String passward) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(passward);
        Thread.sleep(2000);
    }
    @DataProvider(name="bharath")
    public Object[][] hima(){
        Object[][] facebook_details=new Object[2][2];
        facebook_details[0][0]="himasekahr";
        facebook_details[0][1]="Hima@123465";
        facebook_details[1][0]="arunkumar";
        facebook_details[1][1]="arun@123465";
        return facebook_details;
    }
}
