package seleniumR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UdatedDropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\flyer\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");


       // System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());

        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
       // System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());

        //count the no. of checkbox
        System.out.println(driver.findElements(By.cssSelector("input[type*='check']")).size());
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
       /* int i=1;
        while(i<5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }   */
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    for(int i=1;i<5;i++){
        driver.findElement(By.id("hrefIncAdt")).click();
    }
        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
       // System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

       // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

       // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        driver.findElement(By.className("picker-second")).getAttribute("style");
        if(driver.findElement(By.className("picker-second")).getAttribute("style").contains("1"))
        {
            System.out.println("its enabled");
            Assert.assertTrue(true);
        }
        else {
            Assert.assertFalse(false);
        }
        driver.findElement(By.cssSelector("td input[value= 'OneWay']")).click();
        driver.findElement(By.className("picker-second")).getAttribute("style");
        if(driver.findElement(By.className("picker-second")).getAttribute("style").contains("0.5"))
        {
            System.out.println("its disabled");
            Assert.assertTrue(true);
        }
        else {
            Assert.assertFalse(false);
        }
    }
}
