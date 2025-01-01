import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class apsrtc {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver;
        driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.apsrtconline.in/");

        // Locate the logo div
        WebElement logo = driver.findElement(By.xpath("//div[@class='headerLogo']"));

        // Verify the logo is displayed
        if (logo.isDisplayed()) {
            System.out.println("Logo is displayed.");
        } else {
            System.out.println("Logo is not displayed.");
        }

        // Close the browser
        driver.quit();
    }
}


