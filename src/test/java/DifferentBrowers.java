import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DifferentBrowers {
    public static void main(String[] args) {
        WebDriver driver = null;
        int choice;
        choice = 2;
        if(choice==1){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        if (choice==2){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        if(choice==3){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        driver.get("https://google.com");
    }
}

