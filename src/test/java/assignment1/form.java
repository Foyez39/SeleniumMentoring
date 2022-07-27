package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class form {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\flyer\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
      driver.findElement(By.xpath("//div/input[@name='name']")).sendKeys("Foyez");
      driver.findElement(By.xpath("//div/input[@name='email']")).sendKeys("foyez@yahoo.com");
      driver.findElement(By.cssSelector("input#exampleInputPassword1")).sendKeys("abc123");
      driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
       WebElement staticdropdown=driver.findElement(By.cssSelector("select#exampleFormControlSelect1"));
        Select obj= new Select(staticdropdown);
        obj.selectByVisibleText("Female");
        driver.findElement(By.cssSelector("input#inlineRadio1")).click();
        driver.findElement(By.name("bday")).sendKeys("04/21/1999");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("div[class*='alert']")).getText());
    }
}
