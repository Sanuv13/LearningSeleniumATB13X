package Selenium_basic;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class test_selenium_12_webtable2 {

    @Description("TC01#Able to work on Dynamic Webtable")
    @Test
    public void selenium_Dynamic_webtable() {
        WebDriver webdriver = new FirefoxDriver();
        webdriver.get("https://awesomeqa.com/webtable1.html");
        webdriver.manage().window().maximize();
        WebElement table = webdriver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));
        List<WebElement> rows=table.findElements(By.tagName("tr"));
        for(int i = 0; i< rows.size(); i++){
            List<WebElement> column=rows.get(i).findElements(By.tagName("td"));
            for(int j=0;j< column.size();j++){
                System.out.println(column.get(j).getText());

            }

        }

    }
}


