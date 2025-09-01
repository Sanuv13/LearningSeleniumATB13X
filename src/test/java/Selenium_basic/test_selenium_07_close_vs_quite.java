package Selenium_basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class test_selenium_07_close_vs_quite {
    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.close();
        // Close - will close the current tab, not the session (not the all tabs)
//        // session id != null



//        driver.quit();
        // It will close all the tabs. - session id == null
    }
}
