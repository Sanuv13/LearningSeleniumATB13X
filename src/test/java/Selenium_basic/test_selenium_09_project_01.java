package Selenium_basic;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_selenium_09_project_01 {
    @Description("TC#1:Verify particular text is available on the home page")
    @Test
    public void test_selenium_text_on_katelon_website(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        //System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getPageSource());
        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test case passed");
        }
        else
        {
            System.out.println("Test case failed");
        }
        driver.quit();


    }

}
