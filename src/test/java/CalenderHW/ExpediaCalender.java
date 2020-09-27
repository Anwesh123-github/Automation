package CalenderHW;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExpediaCalender {

    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.get("https://www.expedia.co.uk/?pwaLob=wizard-flight-pwa");
        //driver.get("https://www.opodo.co.uk/");
        //driver.get("https://www.southalltravel.co.uk/");
       // driver.get("https://www.makemytrip.com/");
        driver.get("https://www.coop.co.uk/");
        driver.manage().window().maximize();
    } //setup ends

    @Test
    public void expedia() throws InterruptedException {

        WebElement flightbutton = driver.findElement(By.xpath("//body[contains(@class,'uitk-no-outline')]/div[@id='app']/div/div[contains(@class,'app-layer-base--active')]/div[contains(@class,'uitk-grid pageWhiteBackground')]/div[contains(@class,'uitk-cell Storefront-Homepage')]/div[contains(@class,'uitk-cell')]/div[contains(@class,'StorefrontWizardRegionBEX')]/div/figure[contains(@class,'uitk-image bexHeroImageFigure withBackgroundColor')]/div[contains(@class,'wizardCard all-t-padding-twelve all-x-padding-six SimpleContainer')]/div[contains(@class,'uitk-card uitk-grid all-cell-1-1 elevation-4')]/div[contains(@class,'uitk-cell lobFormInCard')]/div[contains(@class,'uitk-tabs-container')]/ul[@id='uitk-tabs-button-container']/li[2]"));
        flightbutton.click();

        WebElement checkin = driver.findElement(By.id("d1-btn"));
        checkin.click();

        WebElement septembermonth = driver.findElement(By.xpath("//div[@class='uitk-calendar']//div[1]//table[1]"));
        System.out.println(septembermonth.isDisplayed());

        List<WebElement> alldates = septembermonth.findElements(By.cssSelector(".uitk-new-date-picker-day"));

        Thread.sleep(5000);
        for (WebElement alldate : alldates) {
            System.out.println(alldate.getAttribute("data-day"));

           if (alldate.getAttribute("data-day").contains("20")){
               alldate.click();
            }//if ends
        } //for ends

    } //test ends

    @Test

    public void expedia1() throws InterruptedException {

        WebElement flightbutton = driver.findElement(By.xpath("//body[contains(@class,'uitk-no-outline')]/div[@id='app']/div/div[contains(@class,'app-layer-base--active')]/div[contains(@class,'uitk-grid pageWhiteBackground')]/div[contains(@class,'uitk-cell Storefront-Homepage')]/div[contains(@class,'uitk-cell')]/div[contains(@class,'StorefrontWizardRegionBEX')]/div/figure[contains(@class,'uitk-image bexHeroImageFigure withBackgroundColor')]/div[contains(@class,'wizardCard all-t-padding-twelve all-x-padding-six SimpleContainer')]/div[contains(@class,'uitk-card uitk-grid all-cell-1-1 elevation-4')]/div[contains(@class,'uitk-cell lobFormInCard')]/div[contains(@class,'uitk-tabs-container')]/ul[@id='uitk-tabs-button-container']/li[2]"));
        flightbutton.click();

        Thread.sleep(3000);

        WebElement checkin = driver.findElement(By.id("d1-btn"));
        checkin.click();

        Thread.sleep(3000);

        WebElement anglebutton = driver.findElement(By.xpath("//div[contains(@class,'uitk-calendar')]//button[2]"));
        anglebutton.click();

        Thread.sleep(3000);

        WebElement novembermonth = driver.findElement(By.xpath("//div[contains(@class,'uitk-new-date-picker-desktop-months-container')]//div[2]//table[1]"));
        System.out.println(novembermonth.isDisplayed());

        Thread.sleep(3000);

        List<WebElement> alldates = novembermonth.findElements(By.cssSelector(".uitk-new-date-picker-day"));

        for (WebElement alldate : alldates) {
            System.out.println(alldate.getAttribute("data-day"));

           if (alldate.getAttribute("data-day").contains("5")) {
               alldate.click();

           } //if ends

        } //for ends


    }//test ends


    @Test

    public void expedia2() throws InterruptedException {

        WebElement flightbutton = driver.findElement(By.xpath("//body[contains(@class,'uitk-no-outline')]/div[@id='app']/div/div[contains(@class,'app-layer-base--active')]/div[contains(@class,'uitk-grid pageWhiteBackground')]/div[contains(@class,'uitk-cell Storefront-Homepage')]/div[contains(@class,'uitk-cell')]/div[contains(@class,'StorefrontWizardRegionBEX')]/div/figure[contains(@class,'uitk-image bexHeroImageFigure withBackgroundColor')]/div[contains(@class,'wizardCard all-t-padding-twelve all-x-padding-six SimpleContainer')]/div[contains(@class,'uitk-card uitk-grid all-cell-1-1 elevation-4')]/div[contains(@class,'uitk-cell lobFormInCard')]/div[contains(@class,'uitk-tabs-container')]/ul[@id='uitk-tabs-button-container']/li[contains(@class,'active')]/a[1]"));
        flightbutton.click();

        WebElement checkout = driver.findElement(By.id("d2-btn"));
        checkout.click();

        WebElement septembermonth = driver.findElement(By.xpath("//div[contains(@class,'uitk-calendar')]//div[1]//table[1]"));
        System.out.println(septembermonth.isDisplayed());

        List<WebElement> alldates = septembermonth.findElements(By.cssSelector(".uitk-new-date-picker-day"));

        for (WebElement alldate : alldates) {
            System.out.println(alldate.getAttribute("data-day"));

            Thread.sleep(5000);

            if (alldate.getAttribute("data-day").contains("9")) {
                alldate.click();

            } //if ends

        } //for ends

    } //test ends


    @Test

    public void opodo() throws InterruptedException {

        WebElement checkin = driver.findElement(By.xpath("//body[@id='viewport']/div[@id='flights-root']/div[@id='page']/div[contains(@class,'od-home-main-layout home_main_layout')]/div[contains(@class,'od-body-content body_content')]/section[@id='home']/div[contains(@class,'od-home-wrapper')]/div[contains(@class,'od-home-full-width-content odf-flex-item odf-flex-item-first')]/div[contains(@class,'od-home-content od-home-content-with-warning-top-message')]/div[contains(@class,'od-home-content-search')]/div[@id='flights-manager']/div[contains(@class,'')]/div[contains(@class,'od-flightsManager-content')]/div[contains(@class,'od-flightsManager-main')]/div[contains(@class,'od-flightsManager-row citysearch_group')]/div[contains(@class,'od-flightsManager-cell')]/div[2]/div[1]/div[1]/div[1]"));
        checkin.click();

        WebElement septembermonth = driver.findElement(By.xpath("//body[@id='viewport']/div[@id='flights-root']/div[@id='page']/div[contains(@class,'od-home-main-layout home_main_layout')]/div[contains(@class,'od-body-content body_content')]/section[@id='home']/div[contains(@class,'od-home-wrapper')]/div[contains(@class,'od-home-full-width-content odf-flex-item odf-flex-item-first')]/div[contains(@class,'od-home-content od-home-content-with-warning-top-message')]/div[contains(@class,'od-home-content-search')]/div[@id='flights-manager']/div[contains(@class,'')]/div[contains(@class,'od-flightsManager-content')]/div[contains(@class,'od-flightsManager-main')]/div[contains(@class,'od-flightsManager-row citysearch_group')]/div[contains(@class,'od-flightsManager-cell')]/div[contains(@class,'calendar_container active')]/div[contains(@class,'od-ui-datepicker-container datepicker hasButton active')]/div[contains(@class,'od-ui-datepicker-wrapper')]/div[contains(@class,'od-ui-calendar-wrapper open')]/div[contains(@class,'od-ui-calendar-body')]/div[contains(@class,'od-ui-calendar-container')]/div[1]/div[2]"));

        List<WebElement> alldates = septembermonth.findElements(By.cssSelector(".od-ui-calendar-day"));

        Thread.sleep(5000);

        for (WebElement alldate : alldates) {
            System.out.println(alldate.getText() );

            Thread.sleep(3000);



            if(alldate.getText().contains("17")) {
                alldate.click();}
        }
            } //test ends


    @Test

    public void opodo1() throws InterruptedException {

        WebElement checkin = driver.findElement(By.xpath("//body[@id='viewport']/div[@id='flights-root']/div[@id='page']/div[contains(@class,'od-home-main-layout home_main_layout')]/div[contains(@class,'od-body-content body_content')]/section[@id='home']/div[contains(@class,'od-home-wrapper')]/div[contains(@class,'od-home-full-width-content odf-flex-item odf-flex-item-first')]/div[contains(@class,'od-home-content od-home-content-with-warning-top-message')]/div[contains(@class,'od-home-content-search')]/div[@id='flights-manager']/div[contains(@class,'')]/div[contains(@class,'od-flightsManager-content')]/div[contains(@class,'od-flightsManager-main')]/div[contains(@class,'od-flightsManager-row citysearch_group')]/div[contains(@class,'od-flightsManager-cell')]/div[1]/div[1]/div[1]/div[1]"));
        checkin.click();

        WebElement octobermonth = driver.findElement(By.xpath("//body[@id='viewport']/div[@id='flights-root']/div[@id='page']/div[contains(@class,'od-home-main-layout home_main_layout')]/div[contains(@class,'od-body-content body_content')]/section[@id='home']/div[contains(@class,'od-home-wrapper')]/div[contains(@class,'od-home-full-width-content odf-flex-item odf-flex-item-first')]/div[contains(@class,'od-home-content od-home-content-with-warning-top-message')]/div[contains(@class,'od-home-content-search')]/div[@id='flights-manager']/div[contains(@class,'')]/div[contains(@class,'od-flightsManager-content')]/div[contains(@class,'od-flightsManager-main')]/div[contains(@class,'od-flightsManager-row citysearch_group')]/div[contains(@class,'od-flightsManager-cell')]/div[contains(@class,'calendar_container active')]/div[contains(@class,'od-ui-datepicker-container datepicker hasButton active')]/div[contains(@class,'od-ui-datepicker-wrapper')]/div[contains(@class,'od-ui-calendar-wrapper open')]/div[contains(@class,'od-ui-calendar-body')]/div[contains(@class,'od-ui-calendar-container')]/div[2]/div[2]"));

        List<WebElement> alldates = octobermonth.findElements(By.cssSelector(".od-ui-calendar-day"));

        Thread.sleep(5000);

        for (WebElement alldate : alldates) {
            System.out.println(alldate.getText());

            if (alldate.getText().contains("16")) {
                alldate.click();

            } //if ends

        } //for ends

    } //test ends


    @Test

    public void southhalltravel() throws InterruptedException {


        WebElement departuredate = driver.findElement(By.id("depdateit"));
        departuredate.click();

        List<WebElement> alldates = driver.findElements(By.cssSelector(".ui-state-default"));

        Thread.sleep(5000);

        for (WebElement alldate : alldates) {
            System.out.println(alldate.getText());

            if (alldate.getText().contains("20")) {
                alldate.click();
            }

        } //for ends

    } //test ends


    @Test

    public void makemytrip() throws InterruptedException {

        WebElement departure = driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]"));
        departure.click();

        Thread.sleep(5000);

        WebElement septembermonth = driver.findElement(By.xpath("//body[@class='desktop in']/div[@id='root']/div[@class='bgGradient']/div[@class='minContainer']/div/div[@class='widgetSection appendBottom40']/div[@class='fsw widgetOpen']/div[contains(@class,'fsw_inner')]/div[@class='fsw_inputBox dates inactiveWidget activeWidget']/div[@class='datePickerContainer']/div[@class='flightCalOverlay']/div[@class='dayPickerFlightWrap']/div[@class='RangeExample oneWay']/div[@class='DayPicker']/div[@class='DayPicker-wrapper']/div[@class='DayPicker-Months']/div[1]"));

        List<WebElement> alldates = septembermonth.findElements(By.cssSelector(".DayPicker-Day"));

        Thread.sleep(10000);

        for (WebElement alldate : alldates) {
            System.out.println(alldate.getText());

            if (alldate.getText().contains("20")) {
                alldate.click();
            }
        }

    } //test ends


    //AUTO COMPLETE DROPDOWN

    @Test

    public void AutoCompleteDropDown() throws InterruptedException {

        WebElement departfrom = driver.findElement(By.xpath("//div[@id='location-field-leg1-origin-menu']//button[@class='uitk-faux-input']"));
        departfrom.sendKeys("lon");

        Thread.sleep(5000);

        List<WebElement> departdropdowns = driver.findElements(By.cssSelector(".uitk-typeahead-button-label "));

        for (WebElement departdropdown : departdropdowns) {
            System.out.println(departdropdown.getText());

            Thread.sleep(5000);

            if (departdropdown.getText().contains("London (LHR - Heathrow)")){
                departdropdown.click();
            }

        }


    } //end of test

    @Test

    public void AutoCompleteDropDown1 () throws InterruptedException {

        WebElement flightfrom = driver.findElement(By.id("DestinationFrom1"));
        flightfrom.sendKeys("lon");

        Thread.sleep(5000);

        List<WebElement> departdropdowns = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));

        Thread.sleep(5000);
        for (WebElement departdropdown : departdropdowns) {
            System.out.println(departdropdown.getText());

            if (departdropdown.getText().contains("London City (LCY), UK")) {
                departdropdown.click();
            }

        }


    } //end of test


    @Test

    public void cooptest() throws InterruptedException {

        WebElement foodbutton = driver.findElement(By.xpath("//span[@class='coopssn-c-nav__link__text'][contains(text(),'Food')]"));
        foodbutton.click();

        WebElement winebutton = driver.findElement(By.xpath("//header[@class='coopssn-c-header']//section[1]"));

        List<WebElement> allwines = driver.findElements(By.cssSelector(".coopssn-c-nav__sub-nav__link"));

        Thread.sleep(5000);
        for (WebElement allwine : allwines) {
            System.out.println(allwine.getText());

            if (allwine.getText().contains("Champagne")) {
                allwine.click();
            }
        }


    } //test ends

} //class ends
