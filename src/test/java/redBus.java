import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class redBus
{
    public static void main(String[] args) throws InterruptedException {
        webdrive.webdrive_input();
        WebDriver driver=webdrive.getDriver();
        String searchbardetails="hyd";
        driver.findElement(By.id("src")).sendKeys(searchbardetails);
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']//li")));

        List<WebElement> dropdown1=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']//li"));

        for(WebElement item:dropdown1){
            if(item.getText().equalsIgnoreCase("ameerpet")){
                item.click();
                System.out.println("Clicked the ameerpet");
                break;
            }
        }
        //webdrive.closeDriver();
    }
}
