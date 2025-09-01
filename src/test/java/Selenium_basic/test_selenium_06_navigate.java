package Selenium_basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

public class test_selenium_06_navigate {
    @Description("open the URL")
    @Test
    public void test_selenium(){
        WebDriver driver= new FirefoxDriver();
        driver.navigate().to("http://google.com");
        //driver.navigate().back();
        //driver.navigate().forward();
        driver.navigate().refresh();

        driver.quit();
    }

}
