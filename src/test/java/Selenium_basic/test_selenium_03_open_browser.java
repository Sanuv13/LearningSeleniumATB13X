package Selenium_basic;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class test_selenium_03_open_browser {
    public static void main(String args[]){
        WebDriver driver =new FirefoxDriver();
        driver.get("https://app.vwo.com");
    }

}
