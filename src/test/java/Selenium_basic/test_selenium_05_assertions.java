package Selenium_basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class test_selenium_05_assertions {
    @Description("Verify the title is visible.")
    @Test
    public void test_selenium_assestion(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");

        // TestNG Assertion
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com");

        // AssertJ
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com");

        // Rest Assured? (ValidatableResponse)
    }


}
