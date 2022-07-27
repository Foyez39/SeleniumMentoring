package seleniumR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\flyer\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("flyer");
        driver.findElement(By.name("inputPassword")).sendKeys("123");
        driver.findElement(By.className("signInBtn")).click();

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ahmed");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ahmed@gmail.com");
       // driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("34576894");

        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
        driver.findElement(By.cssSelector("div button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

        //driver.close();
      /*  driver.get("https://forum.piit.us/");
       driver.findElement(By.cssSelector("input.input_text")).sendKeys("fahmed94");
        driver.findElement(By.cssSelector("input.input_password")).sendKeys("827774063032494");
       //driver.findElement(By.cssSelector("input.button_submit")).click();
       //driver.findElement(By.xpath("//a/strong")).click();
        driver.findElement(By.cssSelector("p input")).click();*/

    }
}
