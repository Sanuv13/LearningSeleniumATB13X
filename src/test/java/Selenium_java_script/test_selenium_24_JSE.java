package Selenium_java_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class test_selenium_24_JSE {
    @Test
    public  static void java_script_executer_ex(){

        WebDriver driver=new EdgeDriver();
        JavascriptExecutor JS=(JavascriptExecutor) driver;
        JS.executeScript("window.location = 'https://www.google.com'");
        driver.manage().window().maximize();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement scroll = driver.findElement(By.xpath("//div[@id='userName']"));
        JS.executeScript("window.scrollBy(0,500)");
        JS.executeScript("window.scrollBy(0,500)");
        String url = JS.executeScript("return document.URL;").toString();
        String title = JS.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);
    }
}
