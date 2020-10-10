import io.github.bonigarcia.wdm.WebDriverManager;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AssertionDemo {

    public static WebDriver driver;

    @Before

    public void setup() {
        //// System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.get("https://letskodeit.teachable.com/p/practice");
        //driver.get("https://www.argos.co.uk/");
        driver.get("https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike");
        driver.get("https://www.argos.co.uk/search/puma/?clickOrigin=searchbar:search:term:puma");

        driver.manage().window().maximize();
    } //end of setup

    @Test

    public void argos() {

        String actual = driver.getCurrentUrl();
        //Assert.assertThat(actual, Matchers.containsString("https://www.argos.co.uk/"));
        // Assert.assertThat(actual, Matchers.endsWith("argos.co.uk/"));
        Assert.assertThat(actual, Matchers.equalToIgnoringCase("https://www.argos.co.uk/"));

    }

    @Test

    public void argos1() {

        WebElement header = driver.findElement(By.xpath("//div[@class='styles__SearchTitle-sc-1haccah-0 kAkKBD']"));
        String actual = header.getText();
        Assert.assertThat(actual, Matchers.containsString("nike"));

    }


    @Test

    public void argos2() {
        WebElement bestresults = driver.findElement(By.xpath("//h1[contains(text(),'puma')]"));
        String actual = bestresults.getText();
        Assert.assertThat(actual,Matchers.containsString("puma"));

    }

}
