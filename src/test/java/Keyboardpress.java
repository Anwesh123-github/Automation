import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Keyboardpress {

    public static WebDriver driver;

    @Before

    public void setup() {
        //// System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://letskodeit.teachable.com/p/practice");
       //driver.get("https://letskodeit.teachable.com/");
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();} //setup end

    @Test

    public void keypress() {
        WebElement loginbutton = driver.findElement(By.linkText("Login"));
        loginbutton.click();

        WebElement username = driver.findElement(By.id("user_email"));
        username.sendKeys("anweshthapa@gmail.com");

        username.sendKeys(Keys.TAB);

        WebElement password = driver.findElement(By.id("user_password"));
        password.sendKeys("123456");
        password.sendKeys(Keys.ENTER);

    } //test ends

    @Test

    public void combinekeypress() throws InterruptedException {

        WebElement currAddr = driver.findElement(By.id("currentAddress"));
        WebElement perAddr = driver.findElement(By.id("permanentAddress"));

        Actions actions = new Actions(driver);

        actions.click(currAddr).sendKeys("adsfsf,fsfafa,123").perform();

        actions.keyDown(currAddr,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        Thread.sleep(14000);

        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(perAddr,Keys.CONTROL).perform();

        Thread.sleep(14000);

        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

    } //test ends


    @Test

    public void combinekeypress2() throws InterruptedException {
        WebElement curraddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        WebElement peraddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));

        Actions actions = new Actions(driver);

        actions.click(curraddress).sendKeys("3 the close,new").perform();

        Thread.sleep(5000);
        actions.keyDown(curraddress,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(peraddress,Keys.CONTROL).perform();

        Thread.sleep(5000);
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

    }

} //end of class
