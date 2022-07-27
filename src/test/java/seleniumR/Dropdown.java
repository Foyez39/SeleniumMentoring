package seleniumR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\flyer\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
      //  driver.findElement(By.xpath("//a[@value='BLR']")).click();
       // Thread.sleep(1000);
       // driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click();
        Thread.sleep(1000);
       driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
       //This is called parent-child relationship

        driver.findElement(By.cssSelector("a[class*='ui-state-highlight'")).click();

    }
}
