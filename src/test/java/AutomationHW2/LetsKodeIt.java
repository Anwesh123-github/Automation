package AutomationHW2;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LetsKodeIt {

    public static WebDriver driver;

    @Before

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://letskodeit.teachable.com/p/practice");
        driver.manage().window().maximize();
    } //end of setup

    @Test

    public void LKIradiobutton() {
        List<WebElement> radiobuttons = driver.findElements(By.cssSelector("input[type = radio]"));

        for (WebElement radiobutton : radiobuttons) {
            System.out.println(radiobutton.getAttribute("id"));

            if (radiobutton.getAttribute("id").contains("benzradio")) {
                radiobutton.click();

            }//if end



                System.out.println(radiobutton.isSelected());

        }//for end

        } //test method


@Test

public void LKIcheckboxbutton() {
        List<WebElement> checkboxbuttons = driver.findElements(By.cssSelector("input[type = checkbox]"));

    for (WebElement checkboxbutton : checkboxbuttons) {
        System.out.println(checkboxbutton.getAttribute("id"));

        if (checkboxbutton.getAttribute("id").contains("benzcheck")) {
            checkboxbutton.click();

        }//if ends
        System.out.println(checkboxbutton.isSelected());

    } //for end
    } //test method

} //class ends