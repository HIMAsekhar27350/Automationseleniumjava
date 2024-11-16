package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FaceBook_login extends launch_Browser {
    @Test
    public void message()throws InterruptedException{
        String actural_title,expected_title;
        actural_title="Google";
        expected_title=driver.getTitle();
        Assert.assertEquals(actural_title,expected_title,"it is not working");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("Bangalore", Keys.ENTER);
    }
}
