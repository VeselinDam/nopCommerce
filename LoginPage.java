package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    public WebDriver driver;
    //protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private By register = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    private By gender = By.xpath("//div[@id='gender']/span[@class='male']/input[@id='gender-male']");
    private By firstName = By.xpath("//div[@class='inputs'][2]/input[@id='FirstName']");
    private By lastName = By.xpath("//div[@class='inputs'][3]/input[@id='LastName']");
    private By day = By.xpath("//div[@class='date-picker-wrapper']/select[1]/option[4]");
    private By mount = By.xpath("//div[@class='date-picker-wrapper']/select[2]/option[4]");
    private By year = By.xpath("//div[@class='date-picker-wrapper']/select[3]/option[80]");
    private By email = By.xpath("//div[@class='inputs'][4]/input[@id='Email']");
    private By optional = By.xpath("//div[@class='fieldset'][3]/div[@class='form-fields']/div/input[@id='Newsletter']");
    private By password = By.xpath("//div[@class='fieldset'][4]/div[2]/div[1]/input[@id='Password']");
    private By confirmPassword = By.xpath("//div[@class='fieldset'][4]/div[2]/div[2]/input[@id='ConfirmPassword']");
    private By buttonReg = By.id("register-button");
    private By regContinue = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a");


    private By loginBNT = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
    private By enterEmail = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[1]/input");
    private By enterPW = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[2]/input");
    private By clikcLogin = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    private By myAcc = By.xpath("//div[@class='header-links-wrapper']/div/ul/li[1]/a");


    public void clickRegister() {
        driver.findElement(register).click();
    }

    public void pickGender(){
        driver.findElement(gender).click();
    }

    public void enterUserName(String name){
        driver.findElement(firstName).sendKeys(name);
    }

    public void enterLastName(String last){
        driver.findElement(lastName).sendKeys(last);
    }

    public void pickDay(){
        driver.findElement(day).click();
    }

    public void pickMount(){
        driver.findElement(mount).click();
    }

    public void pickYear(){
        driver.findElement(year).click();
    }

    public void setEmail(String myEmail){
        driver.findElement(email).sendKeys(myEmail);
    }

    public void checkOptional(){
        driver.findElement(optional).click();
    }

    public void setPassword(String pw){
        driver.findElement(password).sendKeys(pw);
    }

    public void setConfirmPassword(String confirmPW){
        driver.findElement(confirmPassword).sendKeys(confirmPW);
    }

    public void setButtonReg(){
        driver.findElement(buttonReg).click();
    }

    public void doneRegistration(){
        driver.findElement(regContinue).click();
    }

    public void clickLogin(){
        driver.findElement(loginBNT).click();
    }

    public void loginEmail(String emaillogin){
        driver.findElement(enterEmail).sendKeys(emaillogin);
    }

    public void loginPW(String pwlogin){
        driver.findElement(enterPW).sendKeys(pwlogin);
    }

    public void clikcLoginBNT(){
        driver.findElement(clikcLogin).click();
    }

    public void clikcMyAcc(){
        driver.findElement(myAcc).click();
    }
}
