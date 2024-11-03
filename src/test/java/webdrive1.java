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
        List<WebElement> dropdownitems=driver.findElements(By.xpath("//div[@class='sc-gZMcBi hviMLb']"));
        if(dropdownitems.size()>=3){
            dropdownitems.get(2).click();
            Thread.sleep(2000);
        }else{
            System.out.println("Less than three option are available in the dropdown ");
        }
        //webdrive.closeDriver();
    }
}
