package Selenium_basic;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test_selenium_11_webtable {
    @Description("TC01#Able to work on Webtable")
    @Test
    public void selenium_webtable() {
        WebDriver webdriver = new FirefoxDriver();
        webdriver.get("https://awesomeqa.com/webtable.html");

        String First = "//table[@id=\"customers\"]/tbody/tr[";
        String Second = "]/td[";
        String Third = "]";
        int Row = webdriver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int Column = webdriver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();
        for (int i = 2; i <= Row; i++) {
            for (int j = 1; j <= Column; j++) {
                String dynamic_path = First + i + Second + j + Third;
                //System.out.println(dynamic_path);
                String data = webdriver.findElement(By.xpath(dynamic_path)).getText();
                System.out.println(data);
                if (data.contains("Helen Bennett")) {
                    String Country = dynamic_path + "/following-sibling::td";
                    String Country_path = webdriver.findElement(By.xpath(Country)).getText();
                    System.out.println("Helen Bennett is " + Country_path);
                }
            }
        }
    }
}
