package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccount {

    public WebDriver driver;
    public MyAccount (WebDriver driver){
        this.driver = driver;
    }

    private By myAcc = By.xpath("//div[@class='header-links-wrapper']/div/ul/li[1]/a");
    private By address = By.xpath("/html/body/div[6]/div[3]/div/div[1]/div/div[2]/ul/li[2]/a");
    private By addNew = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[2]/button");
    private By firstName = By.xpath("//div[@class='edit-address']/div/input[@id='Address_FirstName']");
    private By lastname = By.xpath("//*[@id=\"Address_LastName\"]");
    private By email = By.xpath("//*[@id=\"Address_Email\"]");
    private By country = By.xpath("//*[@class=\"inputs\"][5]/select/option[2]");
    private By state = By.xpath("//*[@class=\"inputs\"][6]/select/option[2]");
    private By setCity = By.xpath("//*[@id=\"Address_City\"]");
    private By addAddress1 = By.xpath("//*[@id=\"Address_Address1\"]");
    private By zipcode = By.xpath("//*[@id=\"Address_ZipPostalCode\"]");
    private By save = By.xpath("/html/body/div[6]/div[3]/div/div[2]/form/div/div[2]/div[2]/button");
    private By number = By.xpath("//*[@id=\"Address_PhoneNumber\"]");
    private By ele = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a");

    public void setUpMyAcc(){
        driver.findElement(myAcc).click();
    }

    public void checkAddres(){
        driver.findElement(address).click();
    }

    public void addNewAddress(){
        driver.findElement(addNew).click();
    }

    public void addNewFirstName(String first){
        driver.findElement(firstName).sendKeys(first);
    }

    public void addLastName(String last){
        driver.findElement(lastname).sendKeys(last);
    }

    public void addEmail(String mail){
        driver.findElement(email).sendKeys(mail);
    }

    public void pickCountry(){
        driver.findElement(country).click();
    }

    public void pickState() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.findElement(state).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"inputs\"][6]/select/option[2]"))).click();

    }

    public void pickCity(String city){
        driver.findElement(setCity).sendKeys(city);
    }

    public void setAddress1(String adresa){
        driver.findElement(addAddress1).sendKeys(adresa);
    }

    public void addZip(String postcode){
        driver.findElement(zipcode).sendKeys(postcode);
    }

    public void addPhone(String phone){
        driver.findElement(number).sendKeys(phone);
    }

    public void saveBTN(){
        driver.findElement(save).click();
    }

    public void hoverElement(){
        driver.findElement(ele).click();
    }
}
