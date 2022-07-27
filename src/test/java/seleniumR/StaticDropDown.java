package seleniumR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\flyer\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //dropdown with select tag
        WebElement staticdropdown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown=new Select(staticdropdown);
        dropdown.selectByIndex(2);
        dropdown.getFirstSelectedOption();
        dropdown.selectByVisibleText("USD");


    }
}
