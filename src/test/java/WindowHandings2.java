import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandings2 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.findElement(By.xpath("(//button[@class='whButtons'])[1]")).click();
        String a = driver.getWindowHandle();
        System.out.println(a);
        Set<String> s = driver.getWindowHandles();
        for (String d : s) {
            System.out.println(d);
            if (!d.equals(a)) {
                driver.switchTo().window(d);

                driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("vdbbv");
            }
        }
        driver.switchTo().window(a);


        driver.findElement(By.xpath("(//button[@class='whButtons'])[2]")).click();
        Set<String> b = driver.getWindowHandles();
        for (String c : b) {
            if (!b.equals(a)) ;

            {
                driver.switchTo().window(c);
            }
        }

    }
}
