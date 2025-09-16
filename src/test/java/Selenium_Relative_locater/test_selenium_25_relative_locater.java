package Selenium_Relative_locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class test_selenium_25_relative_locater {
    @Test

    public void relative_locater(){

        WebDriver driver=new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();
        WebElement experience =driver.findElement(By.xpath("//span[text()=\"Years of Experience\"]"));
        driver.findElement(with(By.id("exp-2")).toRightOf(experience)).click();;


    }
}
