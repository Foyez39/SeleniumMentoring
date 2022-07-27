package seleniumR;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\flyer\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        //count of links
        System.out.println(driver.findElements(By.tagName("a")).size());
        //count of links from footer
        WebElement footerDriver=driver.findElement(By.cssSelector("div[id='gf-BIG']")); //limiting WebDriver scope
        System.out.println(footerDriver.findElements(By.tagName("a")).size());
        //count of links from column footer
        WebElement columnDriver=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
       // System.out.println(columnDriver.findElements(By.tagName("a")).size());
        int size=columnDriver.findElements(By.tagName("a")).size();

        //click on each link in the column and check if the pages are opening
        for(int i=1; i<size; i++) {
            String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
        }

            Set <String> window=driver.getWindowHandles();
            Iterator<String> it=window.iterator();
            while (it.hasNext()){
                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());
            }



        }


    }

