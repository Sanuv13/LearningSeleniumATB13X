package Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.testng.Assert;

import java.time.Duration;

import java.time.Duration;

public class test_selenium_16_Alert {
    public static void main(String[] args){

        WebDriver driver =new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement Alert = driver.findElement(By.xpath("//button[@onclick=\'jsAlert()\']"));
        Alert.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
       // wait.until(ExpectedCondition.alertIsPresent());
        Alert alert=driver.switchTo().alert();
        alert.accept();
String result=driver.findElement(By.id("result")).getText();

        Assert.assertEquals(result,"You successfully clicked an alert");

    }
}
