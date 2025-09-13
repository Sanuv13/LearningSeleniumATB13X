package Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class test_selenium_14_select_drop_down {
    public static void main(String []args){
        WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement first = driver.findElement(By.id("dropdown"));
        Select option = new Select(first);
        option.selectByVisibleText("Option 2");
    }
}
