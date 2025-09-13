package Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test_selenium_13_checkbox_radio_button {
    public static void main(String []args){
        WebDriver driver = new FirefoxDriver();
            driver.get("https://awesomeqa.com/practice.html");
            driver.manage().window().maximize();

        WebElement name_input_box=driver.findElement(By.xpath("//input[@name='firstname']"));
        name_input_box.sendKeys("Sanu");

        WebElement lastname_input_box=driver.findElement(By.name("lastname"));
        lastname_input_box.sendKeys("Sachan");
        WebElement radio_button =driver.findElement(By.xpath("//input[@id=\'sex-1\']"));
        radio_button.click();

        WebElement exp_radio_button =driver.findElement(By.id("exp-6"));
        exp_radio_button.click();

        WebElement profession_checkbox =driver.findElement(By.id("profession-0"));
        profession_checkbox.click();

        }
    }

