package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchStore {

    protected WebDriver driver;

    public SearchStore(WebDriver driver){
        this.driver = driver;
    }

    private By searchField = By.xpath("//div[@class='search-box store-search-box']/form/input[@id='small-searchterms']");
    private By searchButton = By.xpath("//div[@class='search-box store-search-box']/form/button");
    private By clickOnItem = By.xpath("//*[@id=\"ui-id-1\"]/li");
    private By wishListButton = By.id("add-to-wishlist-button-30");
    private By messageAfterAddedToTheList = By.xpath("//*[@id=\"bar-notification\"]/div/p");
    private By closeButtonX = By.xpath("//*[@id=\"bar-notification\"]/div/span");

    public void searchForItem(String item){
        driver.findElement(searchField).sendKeys(item);
    }

    public void clickItemFromSearchYouLookFor(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clickOnItem)).click();
    }

    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }

    public void addItemToWishList() throws InterruptedException {

        try{
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println(alertText);
            alert.accept();
            Thread.sleep(3000);
            driver.findElement(wishListButton).click();
        }catch (NoAlertPresentException e){
                e.printStackTrace();
            }

    }

    public String checkIfItemWasSuccecsfullyAddedToTheList(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(messageAfterAddedToTheList)).getText();
        return text;
    }

    public void clickOnCloseButton(){
        driver.findElement(closeButtonX).click();
    }
}
