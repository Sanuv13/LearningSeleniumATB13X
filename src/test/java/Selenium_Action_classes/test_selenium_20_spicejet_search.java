package Selenium_Action_classes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class test_selenium_20_spicejet_search {
    public static void main(String []args){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        //driver.getTitle();
        //Alert alert=driver.switchTo().alert();
        //alert.dismiss();
        WebElement from =driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        Actions action =new Actions(driver);

        WebElement to =driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]/div/div/input"));
        action.moveToElement(from).click().sendKeys("BLR").build().perform();
       action.moveToElement(to).click().sendKeys("DEL").build().perform();
       driver.quit();


    }
}
