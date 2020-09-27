import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionDemo {

    public static WebDriver driver;

    @Before

    public void setup() {
        //// System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://letskodeit.teachable.com/p/practice");
        driver.manage().window().maximize();}

        @Test

    public void action() throws InterruptedException {

            //JavascriptExecutor js = (JavascriptExecutor) driver;
                   // js.executeScript("window.scrollBy(0,1000);");

            WebElement mousehover = driver.findElement(By.id("mousehover"));

            Actions actions = new Actions(driver);
            actions.moveToElement(mousehover).perform();

            Thread.sleep(7000);

            WebElement subelement = driver.findElement(By.linkText("Top"));

            actions.moveToElement(subelement).click().perform();


        }

} //end of class
