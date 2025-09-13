package Selenium_basic;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class test_selenium_17_confirmation_alert {

        @Description("check the confirmation alert")
                @Test
        public void alert(){
            WebDriver driver=new EdgeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            WebElement confirmation = driver.findElement(By.xpath("//button[@onclick=\'jsConfirm()']"));
            confirmation.click();
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
            Alert alert=driver.switchTo().alert();
            alert.dismiss();
            String result=driver.findElement(By.id("result")).getText();
            Assert.assertEquals(result,"You clicked: Cancel");




    }
}
