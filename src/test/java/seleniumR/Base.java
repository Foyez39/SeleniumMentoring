package seleniumR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Base {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\flyer\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String [] itemNeeded= {"Brocolli","Beetroot","Cucumber","Apple"};

       addItems(driver,itemNeeded);
       driver.findElement(By.cssSelector("img[alt='Cart']")).click();
       driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
       driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
       driver.findElement(By.cssSelector("button.promoBtn")).click();
       //explicit wait

    //   WebDriverWait w= new WebDriverWait(driver,10);
      // w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));



    }





  public static void addItems(WebDriver driver,String[]itemNeeded){

      int j=0;
      List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
      for(int i=0;i<products.size();i++){
          String[] name=products.get(i).getText().split("-");
          String formattingName=name[0].trim();
          List itemNeededList=Arrays.asList(itemNeeded);

          if (itemNeededList.contains(formattingName)){
              driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

              j++;
              if(j==itemNeeded.length){
                  break;
              }


          }

      }


    }












}
