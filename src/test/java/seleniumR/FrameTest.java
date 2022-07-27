package seleniumR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\flyer\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
       // System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
        //driver.findElement(By.cssSelector("div[id=draggable]")).click();
        Actions actions=new Actions(driver);
        WebElement source= driver.findElement(By.cssSelector("div[id=draggable]"));
        WebElement target= driver.findElement(By.cssSelector("div[id=droppable]"));
        actions.dragAndDrop(source,target).build().perform();
        driver.switchTo().defaultContent();


    }
}
