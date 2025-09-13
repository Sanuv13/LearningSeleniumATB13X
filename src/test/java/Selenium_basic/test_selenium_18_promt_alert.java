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

public class test_selenium_18_promt_alert {
    @Description("varification on promt alart")
    @Test
    public void promt_alert(){
        WebDriver driver =new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.getTitle();
        driver.manage().window().maximize();

        WebElement prompt= driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        prompt.click();

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));

        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Sanu");

        alert.accept();
String result=driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You entered: Sanu");

    }
}
