package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ListOfElements {

    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike");
        driver.manage().window().maximize();
    } //setup method end

    @Test

    public void argosRadioButton() throws InterruptedException {
        List<WebElement> radiobuttons = driver.findElements(By.cssSelector(".RadioListstyles__Label-sc-4132xt-5.gywEET"));

        for (WebElement radiobutton : radiobuttons) {
            System.out.println(radiobutton.getAttribute("id"));

            Thread.sleep(5000);

            if (radiobutton.getAttribute("id").contains("4 or more-label")) {
                radiobutton.click();
            } //if button

        }
    }


    @Test

        public void argosCheckBoxes () throws InterruptedException {
           List<WebElement> checkboxbuttons = driver.findElements(By.cssSelector(".Checkboxstyles__Label-e3lxpy-4.hWEwsp.font-standard"));

            for (WebElement checkboxbutton : checkboxbuttons) {
               System.out.println(checkboxbutton.getAttribute("id"));

                Thread.sleep(5000);

                if (checkboxbutton.getText().contains("filter-price-£15 - £20-label")){
                    checkboxbutton.click();
                }


            }
        } //setup method end

   } //
