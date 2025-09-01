package Selenium_basic;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_Selenium_01 {
    @Test

    public void test_code(){
        Assert.assertEquals("Sanu", "Sanu");
    }
@Test
    public void openthetestinfacadamypage() {
        FirefoxDriver driver = new FirefoxDriver() ;
           driver.get("https://thetestingacademy.com");

        }

    }

