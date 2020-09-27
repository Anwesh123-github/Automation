package AutomationPractise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Practise2 {

    public static WebDriver driver;

    @Before

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();


} //end of setup

@Test

    public void navigatetest1() throws InterruptedException {

        driver.navigate().to("https://www.amazon.co.uk/s?k=nike&ref=nb_sb_noss_1");
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().refresh();

        driver.getTitle();


        String CurrentURL = driver.getCurrentUrl();
        System.out.println(CurrentURL);

    } //navigate ends

    @After

    public void teardown(){
        driver.quit();
    } //after ends


} //end of class


