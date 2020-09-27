package BrowserInvokedHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BrowserInvokedHW1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();

        WebElement searchbox = driver.findElement(By.id("searchTerm")); //
        searchbox.sendKeys("Nike");

        WebElement searchbutton = driver.findElement(By.xpath("//span[@class='_1gqeQ']"));
        searchbutton.click();

        WebElement pricelist = driver.findElement(By.xpath("//label[@id='filter-price-£5 - £10-label']//div[@class='Checkboxstyles__CheckboxOption-e3lxpy-3 esYLSA']//*[local-name()='svg']"));
        pricelist.click();

        WebElement addtotrolley = driver.findElement(By.xpath("//body/main[@id='app']/div[@class='app app--search-lister']/div[@id='findability']/div/div[@class='search']/div[@class='styles__SearchContent-sc-1h5mbdb-2 CfHZq xs-row xs-auto--negative lg-auto--none']/div[@class='styles__Container-sc-1h5mbdb-0 gCgRbH xs-12--none lg-9--none xs-stack']/div[@class='styles__ProductList-sc-1rzb1sn-0 kChnTV']/div[1]/div[2]/button[1]/span[1]/span[1]"));
        addtotrolley.click();

        WebElement gototrolley = driver.findElement(By.linkText("Go to Trolley"));
        gototrolley.click();

        WebElement wishlist = driver.findElement(By.xpath("//span[contains(text(),'Wishlist')]"));
        wishlist.click();


    } //end of main method


      }//end of class


class BrowserInvokedHW2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);//
        driver.get("https://letskodeit.teachable.com/p/practice");
        driver.manage().window().maximize();

        WebElement BMWradio =driver.findElement(By.id("bmwradio"));
        BMWradio.click();
        System.out.println(BMWradio.isSelected());

        Thread.sleep(3000);


        WebElement Benzradio = driver.findElement(By.id("benzradio"));
        Benzradio.click();
        System.out.println(Benzradio.isSelected());

        Thread.sleep(3000);

        WebElement Hondaradio = driver.findElement(By.id("hondaradio"));
        Hondaradio.click();
        System.out.println(Hondaradio.isSelected());


    } //end of main method


} //end of class



class BrowserInvokedHW3 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);//
        driver.get("https://letskodeit.teachable.com/p/practice");
        driver.manage().window().maximize();


        WebElement BMWcheckbox = driver.findElement(By.id("bmwcheck"));
        BMWcheckbox.click();

        Thread.sleep(2000);

        WebElement Benzcheckbox = driver.findElement(By.id("benzcheck"));
        Benzcheckbox.click();

        Thread.sleep(2000);

        WebElement Hondacheckbox = driver.findElement(By.id("hondacheck"));
        Hondacheckbox.click();

    } //end of main method


} //end of class


class AmazonDriver {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("Nike");

        WebElement searchbutton = driver.findElement(By.xpath("//span[@id='nav-search-submit-text']//input[@class='nav-input']"));
        searchbutton.click();

    } //end of main method


} //end of class


class IDClassCss {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();

        WebElement searchbox = driver.findElement(By.cssSelector("#searchTerm"));
        searchbox.sendKeys("Nike");

        //WebElement searchbox = driver.findElement(By.cssSelector("._1Rz0y"));
        //searchbox.sendKeys("Nike");

        //WebElement searchbox = driver.findElement(By.className("_1Rz0y"));
        //searchbox.sendKeys("Nike");



    } //end of main method


} //end of class


