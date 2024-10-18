import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_java_method {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        String url,text;
        url ="https://www.facebook.com/";
        driver = new ChromeDriver();
        driver.get(url);
        WebElement element = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
        text =element.getText();
        char firstchar = text.charAt(0);
        int length = text.length();
        boolean isEqual = text.equals("Facebook");
        String[] parts = text.split(" ");
        boolean isEqualTgnorecase = text.equalsIgnoreCase("facebook");
        String UpperText = text.toUpperCase();
        String LowerText = text.toLowerCase();
        String replaceText =text.replace('h','$');
        String Substring = text.substring(0,5);
        boolean startswidth = text.startsWith("Fac");
        boolean endswith = text.endsWith("fe.");
        System.out.println("The text is take in the Facebook Login Page");
        System.out.println("--->'Facebook helps you connect and share with the people in your life.'<----");
        System.out.println("First Charater Letter = "+firstchar);
        System.out.println("Length of the Text = "+length);
        System.out.println("Text isEqual to Given Text = "+isEqual);
        System.out.println("String Parts = "+String.join(",",parts));
        System.out.println("isEqualTgnorecase the Given Text = "+isEqualTgnorecase);
        System.out.println("To Convert all in Uppercase = "+UpperText);
        System.out.println("To Convert all in Lowercase = "+LowerText);
        System.out.println("Replace the Letter 'h' to '$' = "+replaceText);
        System.out.println("Substring = "+Substring);
        System.out.println("Startswith = "+startswidth);
        System.out.println("Endswith = "+endswith);

        driver.quit();
    }
}
