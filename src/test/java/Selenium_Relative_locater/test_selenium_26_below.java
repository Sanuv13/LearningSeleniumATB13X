package Selenium_Relative_locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class test_selenium_26_below {
    @Test
    public void below_text(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");

        driver.manage().window().maximize();
        driver.switchTo().frame("result");
        WebElement user_name=driver.findElement(By.id("username"));
        WebElement submit=driver.findElement(By.xpath("//button[text()=\"Submit\"]"));
        submit.click();
       WebElement error_txt= driver.findElement(with(By.tagName("small")).below(user_name));
       String text=error_txt.getText();
        System.out.println(text);
        Assert.assertEquals(text,"Username must be at least 3 characters");
        driver.quit();


    }
}
