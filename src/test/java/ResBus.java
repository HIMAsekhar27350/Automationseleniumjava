import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ResBus {
    public static void main(String[] args) throws InterruptedException {
        String url ,fromDistance="Bang",toDistance="hyd";
        url="https://www.redbus.in";
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.id("src")).sendKeys(fromDistance);
        Thread.sleep(2000);
        List<WebElement> sp=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']/li"));
        Thread.sleep(2000);
        System.out.println("No Of Boarding Point in Bangalore = "+sp.size());
        int i =1;
        for(WebElement w:sp){
            System.out.println(i+" . "+w.getText());
            i++;
            if(w.getText().equalsIgnoreCase("Hyderabad Airport")){
                w.click();
                System.out.println("the Bangalore is clicked");
                break;
            }
        }
        Thread.sleep(2000);
        driver.findElement(By.id("dest")).sendKeys(toDistance);
        Thread.sleep(2000);
        List<WebElement> sp1=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']/li"));
        Thread.sleep(2000);
        System.out.println("No Of Boarding Point in Hyderbad = "+sp1.size());
        int n =1;
        for(WebElement w1:sp1){
            System.out.println(n+" . "+w1.getText());
            n++;
            if(w1.getText().equalsIgnoreCase("Hyderabad Airport")){
                w1.click();
                break;
            }
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='dateText']")).click();
        Thread.sleep(2000);
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
        for (WebElement date : dates) {
            if (date.getText().equals("15")) {  // Replace "15" with your desired day of the month
                date.click();
                System.out.println("Date selected: 15");
                break;
            }
        }
        //driver.quit();
    }
}
