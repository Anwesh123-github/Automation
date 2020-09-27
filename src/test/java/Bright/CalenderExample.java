package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalenderExample {

    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.get("https://www.esky.co.uk/");
        //driver.get("https://www.southalltravel.co.uk/");
        driver.get("https://www.expedia.co.uk/?pwaLob=wizard-hotel-pwa-v2");
        driver.manage().window().maximize();
    } //setup

    @Test

    public void Southtravel() {

        WebElement departingdatebox = driver.findElement(By.id("depdateit"));
        departingdatebox.click();

        List<WebElement> alldates = driver.findElements(By.cssSelector(".ui-state-default"));

        for (WebElement date : alldates) {
            System.out.println(date.getText());

            if (date.getText().equals("30")) {
                date.click();
            } //end of if

        } //end of for

    } //end of test

    @Test
    public void esky() {

        WebElement departingfield = driver.findElement(By.id("departureDateRoundtrip0"));
        departingfield.click();

        List<WebElement> alldates = driver.findElements(By.cssSelector(".ui-state-default"));
        for (WebElement date : alldates) {
            System.out.println(date.getText());

            if (date.getText().equals("30")) {
                date.click();
            } //if ends

            //if (date.getText().equals("27")) {
            //  date.click();
            //}
        } //for ends
    } //test ends

    @Test

    public void expedia(){

        WebElement flightbutton = driver.findElement(By.xpath("//div[contains(@class,'StorefrontWizardRegionBEX')]//li[2]//a[1]"));
        flightbutton.click();

        WebElement checkin = driver.findElement(By.id("d1-btn"));
        checkin.click();

        WebElement Septembermonth = driver.findElement(By.xpath("//div[@class='uitk-calendar']//div[1]//table[1]"));

        System.out.println(Septembermonth.isDisplayed());
        List<WebElement> alldates = Septembermonth.findElements(By.cssSelector(".uitk-new-date-picker-day"));

        for (WebElement alldate : alldates) {
            System.out.println(alldate.getAttribute("data-day"));

            if (alldate.getAttribute("data-day").contains("17")){
                alldate.click();
            }
        }

    } //test ends

} //end of class
