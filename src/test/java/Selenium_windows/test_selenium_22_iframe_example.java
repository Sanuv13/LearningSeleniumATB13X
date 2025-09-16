package Selenium_windows;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class test_selenium_22_iframe_example {
    public static void main(String[]args){
        WebDriver driver =new FirefoxDriver();
        driver.get("https://app.vwo.com/#/analyze/heatmap/3/reports?token=eyJhY2NvdW50X2lkIjoxMTM0NTkxLCJleHBlcmltZW50X2lkIjozLCJjcmVhdGVkX29uIjoxNzU2MDA4MDkyLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiZTlmNmY0ZGZlMGJhMGIxNmQxMjZmMGJlOTUyMDQ3MmEiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&accountId=1134591");
        driver.manage().window().maximize();
        String parent_id = driver.getWindowHandle();
        System.out.println("parent window id is" + parent_id);
        System.out.println("Parent title: " + driver.getTitle());
        WebDriverWait wait0=new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement url=driver.findElement(By.xpath("//input[@name='primaryUrl']"));
        url.clear();
        url.sendKeys("https://thetestingacademy.com");
        WebElement view_heatmap=driver.findElement(By.xpath("//button[text()=\" View Heatmap \"]"));
        view_heatmap.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        String child_id = driver.getWindowHandle();
        System.out.println("child id" +child_id);
        Set<String> all_window_handles=driver.getWindowHandles();
        WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(4));
        boolean twoWindows = wait1.until(driver1 -> driver1.getWindowHandles().size() > 1);
        System.out.println("all id" + all_window_handles);
        for(String handles: all_window_handles){
            if(!handles.equals(parent_id)){
                driver.switchTo().window(handles);
                driver.switchTo().frame("heatmap-iframe");
                System.out.println(driver.getPageSource());
                WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement navigate_button = driver.findElement(By.xpath("//span[text()=\"Compare\"]"));
                //navigate_button.click();
                Actions action =new Actions(driver);
                action.moveToElement(navigate_button).click().build().perform();
            }
        }
    }
}
