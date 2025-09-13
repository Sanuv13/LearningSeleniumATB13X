package Selenium_Action_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class test_selenium_21_make_my_trip {
    public static void main(String []args){
        WebDriver driver =new EdgeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(3));
        //WebElement modal=driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        //modal.click();
        WebElement from_city=driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));
        WebElement to_city = driver.findElement(By.xpath("//input[@data-cy=\"toCity\"]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(from_city).click().sendKeys("IXC").build().perform();
        actions.moveToElement(to_city).click().sendKeys("BLR").build().perform();

        WebDriverWait wait2=new WebDriverWait(driver , Duration.ofSeconds(5));
        List<WebElement> suggesion_list=driver.findElements(By.xpath("//*[@class=\"react-autosuggest__suggestion\"]"));
        try {
            for (WebElement e : suggesion_list) {
                if (e.getText().contains("Chandigarh")) {
                    e.click();
                }
            }
            }catch(Exception e){
                System.out.println("ok");
            }


    }
}
