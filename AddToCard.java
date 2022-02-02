package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToCard {

    protected WebDriver driver;
    protected WebDriverWait wait;
    public AddToCard(WebDriver driver){
        this.driver = driver;
    }

    private By headerIconComputer = By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li[1]/a[1]");
    private By nootbook = By.xpath("//div[@class='page-body']/div/div/div[2]/div/div/a");
    private By CPUtype = By.id("attribute-option-7");
    private By memory = By.id("attribute-option-10");
    private By itemDetails = By.className("picture");

    public void headerMenuComputers(){
        driver.findElement(headerIconComputer).click();
    }

    public void chooseComputer(){
        driver.findElement(nootbook).click();
    }

    public void pickCPU(){
        driver.findElement(CPUtype).click();
    }

    public void pickMemory(){
        driver.findElement(memory).click();
    }

    public void seeItem(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("button-2 product-box-add-to-cart-button"))).click();
    }
}
