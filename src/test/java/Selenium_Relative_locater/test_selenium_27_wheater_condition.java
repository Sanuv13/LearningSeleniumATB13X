package Selenium_Relative_locater;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class test_selenium_27_wheater_condition {
    @Test
    public static void indiaan_air_quality(){

        WebDriver driver =new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search\"]")));
        element.sendKeys("India"+ Keys.ENTER);
        List<WebElement> locations = driver.findElements(By.xpath("//div[contains(@class,\"location-name\")]/p"));
        for(WebElement location : locations){
            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
            String aqi = driver.findElement(with(By.tagName("p")).toRightOf(location)).getText();


            System.out.println("| +" + rank + " | " + location.getText() + " | " + aqi + " | ");


        }

    }

}
