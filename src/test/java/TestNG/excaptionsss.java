package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class excaptionsss extends launch_Browser{
    @Test
    public void excaps() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElements(By.name("q"));
    }
}
