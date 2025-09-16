package Selenium_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class test_selenium_23_test_window {
    @Test
    public static void test_window(){
        WebDriver driver=new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();
        driver.getTitle();
        String parent_id=driver.getWindowHandle();
        System.out.println(parent_id);
        System.out.println(driver);
        WebElement link_parent = driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
        link_parent.click();

        Set<String> all_window=driver.getWindowHandles();
        System.out.println(all_window);
        for(String windows :all_window){
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test Cases passed!");
            }
        }


    }
}
