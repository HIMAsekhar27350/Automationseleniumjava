import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class University {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        Thread.sleep(3000);
        driver.get("https://www.webdriveruniversity.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor)  driver;
        for(int i =  0;i < 5;i++){
            js.executeScript("window.scrollBy(0,200);");
            Thread.sleep(3000);
        }

    }
}
