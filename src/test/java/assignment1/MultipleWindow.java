package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindow {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\flyer\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Set<String> window =driver.getWindowHandles();
        Iterator<String> it=window.iterator();
        String parent=it.next();
        String child=it.next();
        driver.switchTo().window(child);
        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
        driver.switchTo().window(parent);
        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());



    }
}
