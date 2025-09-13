package Selenium_basic;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_selenium_10_project_02 {
    @Description("Verify error throwing if user enter wrong email id or password")
    @Test

    public void test_selenium_verifyinge_error_message()

    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com/");
        driver.manage().window().maximize();

// Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password  and enter the 1234.
        // Step 3 - Find the Submit  and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.
//<input type="email"
// class="text-input W(100%)"
// name="username"
// id="login-username"
// data-qa="hocewoqisi">
        WebElement input_box = driver.findElement(By.id("login-username"));
        input_box.sendKeys("admin@admin.com");
        WebElement pass_input_box = driver.findElement(By.name("password"));
        pass_input_box.sendKeys("1234");
        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
//<div class="notification-box-description"
// id="js-notification-box-msg"
// data-qa="rixawilomi">Your email,
// password, IP address or location did not match</div>
        WebElement error_msg=driver.findElement(By.className("notification-box-description" ));
        System.out.println(error_msg.getText());
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        try {
            Thread.sleep(5000);
        }catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
        }
        driver.quit();
    }

    }


