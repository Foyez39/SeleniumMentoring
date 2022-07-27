package seleniumR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;


import java.time.Duration;

public class Locators2 {

    public static void main(String[] args) throws InterruptedException {
        String name = "flyer";
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\flyer\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
       // WebDriver driver=new ChromeDriver();
       // System.setProperty("webdriver.gecko.driver","C:\\Users\\flyer\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
       //  WebDriver driver= new FirefoxDriver();
        System.setProperty("webdriver.edge.driver","C:\\Users\\flyer\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String password =getpassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
       Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
      // driver.findElement(By.cssSelector("div h2")).getText();
       Assert.assertEquals(driver.findElement(By.cssSelector("div h2")).getText(),"Hello " +name+",");
       // driver.findElement(By.cssSelector("button.logout-btn")).click();
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        driver.close();
    }

    public static String getpassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        String passwordText=(driver.findElement(By.cssSelector("p.infoMsg")).getText());
       // Please use temporary password 'rahulshettyacademy' to Login.

        String [] passwordArray= passwordText.split("'");
        String password = passwordArray[1].split("'")[0];
        return password;




    }


}
