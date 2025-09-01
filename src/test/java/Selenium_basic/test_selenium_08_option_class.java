package Selenium_basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class test_selenium_08_option_class {
    public static void main(String[]args){
        FirefoxOptions option = new FirefoxOptions();
        // Example options
        option.addArguments("--private"); // open in private browsing mode
        option.addArguments("--width=1200"); // set browser width
        option.addArguments("--height=800"); // set browser height

        WebDriver driver = new FirefoxDriver() ;
        driver.get("https://app.vwo.com");
         driver.quit();


    }
}
