package AutomationPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Practise1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();

        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("Nike");


        Thread.sleep(3000);

        WebElement searchbutton = driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']"));
        searchbutton.click();


        Thread.sleep(3000);

        WebElement customerreveiw = driver.findElement(By.id("p_72/419153031"));
        customerreveiw.click();

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        String title = driver.getTitle();
        System.out.println(title);


    }//end of method


} //end of class
