package seleniumR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Intro {
    public static void main(String[] args) {




       // System.setProperty("webdriver.chrome.driver","C:\\Users\\flyer\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver1= new ChromeDriver();



      //  System.setProperty("webdriver.gecko.driver","C:\\Users\\flyer\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
      //  WebDriver driver2= new FirefoxDriver();

        System.setProperty("webdriver.edge.driver","C:\\Users\\flyer\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        System.out.println( driver.getCurrentUrl());
        driver.close();
       // driver.quit();





    }

}
