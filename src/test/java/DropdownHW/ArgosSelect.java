package DropdownHW;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ArgosSelect {

    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
    } //setup ends

    @Test

    public void argossearch() throws InterruptedException {

        WebElement searchbutton = driver.findElement(By.id("searchTerm"));
        searchbutton.sendKeys("nike");

        Thread.sleep(5000);

        List<WebElement> searchdropdowns = driver.findElements(By.cssSelector("._3a8zN"));

        Thread.sleep(5000);

        for (WebElement searchdropdown : searchdropdowns) {
            System.out.println(searchdropdown.getText());

            Thread.sleep(10000);

          if (searchdropdown.getText().contains("nike backpack")) {
              searchdropdown.click();



          } //if ends

        } //for ends
    } //test ends


} //end of class
