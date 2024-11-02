import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class webdrive1 {
    public static void main(String[] args) throws InterruptedException {
        webdrive.webdrive_input();
        WebDriver driver=webdrive.getDriver();
        String searchbardetails="hyd";
        driver.findElement(By.id("src")).sendKeys(searchbardetails, Keys.ENTER);
        Thread.sleep(2000);
        List<WebElement> dropdownitems=driver.findElements()
        webdrive.closeDriver();
    }
}
