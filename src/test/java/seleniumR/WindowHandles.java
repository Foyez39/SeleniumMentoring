package seleniumR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\flyer\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.xpath("//body/a[@class='blinkingText']")).click();
        Set <String> windows=driver.getWindowHandles(); //[parentid,childid]
        Iterator<String> it =windows.iterator();
        String parent=it.next();
        String child = it.next();
        driver.switchTo().window(child);
        String[] message=driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at");
        String[] email =message[1].trim().split(" ");
        String formattingEmail=email[0];
        //System.out.println(formattingEmail);
        driver.switchTo().window(parent);
        driver.findElement(By.cssSelector("#username")).sendKeys(formattingEmail);

    }
}
