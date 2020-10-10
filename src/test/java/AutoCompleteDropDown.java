import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoCompleteDropDown {

    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://www.esky.co.uk/");
        driver.get("https://www.southalltravel.co.uk/");
        //driver.get("https://www.expedia.co.uk/?pwaLob=wizard-hotel-pwa-v2");
        driver.manage().window().maximize();
    } //setup

    @Test
    public void southall() throws InterruptedException {
        WebElement departfrom = driver.findElement(By.id("DestinationFrom1"));
        departfrom.sendKeys("Lon");
        Thread.sleep(10000);

        List<WebElement> departdropdowns = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));

        for (WebElement departdropdown : departdropdowns) {
            System.out.println(departdropdown.getText());

            Thread.sleep(5000);

            if (departdropdown.getText().contains("London Heathrow Airport (LHR), UK")){
                departdropdown.click();}


        }


    }//end of test




}
