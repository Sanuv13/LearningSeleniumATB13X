package Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class test_selenium_15_random_class {

        public static void main(String []args){
            WebDriver driver=new EdgeDriver();
            driver.get("https://the-internet.herokuapp.com/dropdown");
            System.out.println(driver.getTitle());
            driver.manage().window().maximize();

            WebElement first = driver.findElement(By.id("dropdown"));
            Select option = new Select(first);
            Random random =new Random();


        }
    }



