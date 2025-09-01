package Selenium_basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_selenium_04_browser_command {
    public static void main(String []args){
        WebDriver Driver =new ChromeDriver();
        Driver.get("https://google.com");
        Driver.manage().window().maximize();
        System.out.println(Driver.getTitle());
        System.out.println(Driver.getCurrentUrl());
        System.out.println(Driver.getPageSource());
        Driver.quit();

    }
}
