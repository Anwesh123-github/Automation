import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShotOfResult {

    public static WebDriver driver;

    @Before

    public void setup() {
        //// System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.get("https://letskodeit.teachable.com/p/practice");
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    } //end of setup

    @Test

    public void result() throws InterruptedException, IOException {

        WebElement loginbutton = driver.findElement(By.id("u_0_d"));
        loginbutton.click();

        Thread.sleep(10000);

        File sourcefile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destinationfile = new File("C:\\Users\\anwes\\Documents\\Screenshots\\facebook.png");
        FileUtils.copyFile(sourcefile,destinationfile);



    }




} //end of class
