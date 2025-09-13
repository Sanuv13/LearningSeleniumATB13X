package Selenium_Action_classes;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class test_selenium_19_action_with_shift_key {
    @Description("Validation the actione with shift key")
    @Test
    public void shift_key(){
        WebDriver driver =new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");

        WebElement fristname= driver.findElement(By.xpath("//input[@name='firstname']"));
        Actions action =new Actions(driver);
        action.keyDown(Keys.SHIFT).sendKeys(fristname,"sanu");
        action.keyUp(Keys.UP).build().perform();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        //driver.quit();


    }
}
