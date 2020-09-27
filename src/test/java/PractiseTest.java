import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PractiseTest {

    public static WebDriver driver;

    @Before

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike");
        //driver.get("https://www.southalltravel.co.uk/");
        //driver.get("https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike");
        driver.manage().window().maximize();
    } //end of setup

    @Test

    public void ArgosCheckBox () throws InterruptedException {
        List<WebElement> checkboxbuttons = driver.findElements(By.cssSelector(".Checkboxstyles__LabelValue-e3lxpy-6.fOQrQk"));

        for (WebElement checkboxbutton : checkboxbuttons) {
            System.out.println(checkboxbutton.getText());

            Thread.sleep(10000);

            if (checkboxbutton.getText().contains("Smartwatch")) {

                Thread.sleep(10000);
            checkboxbutton.click();
            } //if ends



        }//for ends

        } //test end

    @Test

    public void SouthhallTravel() throws InterruptedException {

        WebElement arrivaldate = driver.findElement(By.id("retdateit"));
        arrivaldate.click();

        List<WebElement> alldates = driver.findElements(By.cssSelector(".ui-state-default"));

        for (WebElement date : alldates) {
            System.out.println(date.getText());

            Thread.sleep(3000);

            if (date.getText().equals("15")) {

               date.click();

            } //if ends

        } //for ends


    } //end of test

    @Test

    public void NikeProducts() throws InterruptedException {
        List<WebElement> nikeimages = driver.findElements(By.cssSelector(".ProductCardstyles__Title-l8f8q8-12.dIoOnG"));

        for (WebElement nikeimage : nikeimages) {
            System.out.println(nikeimage.getText());


            if (nikeimage.getText().contains("Nike Lean Armbands")) {
                nikeimage.click();

            } //if ends


        } //for ends

        Thread.sleep(10000);

    } //test ends

    } //end of class
