package seleniumR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calender {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\flyer\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(" input[id='travel_date']")).click();

       String expectedDate="23";
       while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("August")){
           driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
       }



       List<WebElement>dates= driver.findElements(By.className("day"));
       int count= driver.findElements(By.className("day")).size();
       for(int i=0;i<count;i++){
           String text=dates.get(i).getText();
           if(text.equalsIgnoreCase(expectedDate)){
               dates.get(i).click();
               break;
           }
        }



    }
}
