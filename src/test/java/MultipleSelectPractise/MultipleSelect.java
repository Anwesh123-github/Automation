package MultipleSelectPractise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class MultipleSelect {

    public static WebDriver driver;

    @Before

    public void setup() {
        //// System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       // driver.get("https://letskodeit.teachable.com/p/practice");
        driver.get("https://www.coop.co.uk/");
        driver.manage().window().maximize();} //end of setup

    @Test

     public void multipleselectoptions() throws InterruptedException {

        WebElement multipleselect = driver.findElement(By.xpath("//span[@class='coopssn-c-nav__link__text'][contains(text(),'Food')]"));
        multipleselect.click();

        WebElement foodselect = driver.findElement(By.id("cn_products_wines"));
        Select sel = new Select(foodselect);



        sel.selectByValue("Rose");

        Thread.sleep(5000);








    }   //end of test




} //end of class
