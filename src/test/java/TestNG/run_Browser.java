package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class run_Browser extends launch_Browser {

    @Test(priority = 1)
    public void searching()throws InterruptedException{
        driver.findElement(By.name("q")).sendKeys("Bangalore photos", Keys.ENTER);
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void back_page()throws InterruptedException{
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.name("q")).sendKeys("Madhanaplli photos",Keys.ENTER);
    }
}
