package seleniumR;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\flyer\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        //sending all capital letters
        WebElement move=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        Actions action =new Actions(driver);
        action.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        //Right click on element
        action.moveToElement(move).contextClick().build().perform();





    }
}
