package Bright;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserInvoked {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();

//find searchbox element by ID

        //WebElement searchbox = driver.findElement(By.id("searchTerm"));
        //searchbox.sendKeys("Nike");

        //find searchbox element by xpath

       // WebElement searchbox = driver.findElement(By.xpath("//input[@id='searchTerm']"));
        //searchbox.sendKeys("Nike");

        // find searchbox element by css

       WebElement searchbox = driver.findElement(By.cssSelector("input[name=searchTerm]"));
       searchbox.sendKeys("Nike");


        //find account button element by linktext

      //WebElement accountButton = driver.findElement(By.linkText("Account"));
         // accountButton.click();

       // WebElement searchbox = driver.findElement(By.name("searchTerm"));
       // searchbox.sendKeys("Nike");

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        String title = driver.getTitle();
        System.out.println(title);


    }//end of main method

} //end of class
