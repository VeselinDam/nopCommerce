package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddReviewsOnItem {

    protected WebDriver driver;

    public AddReviewsOnItem(WebDriver driver){
        this.driver = driver;
    }

    private By addYourReview = By.xpath("//div[@class='product-review-links']/a[2]");
    private By reViewItem = By.xpath("//div[@class='fieldset']/div/div/input[@id='AddProductReview_Title']");
    private By description = By.xpath("//div[@class='fieldset']/div/div[2]/textarea[@id='AddProductReview_ReviewText']");
    private By ratingItem = By.xpath("//div[@class='rating-options']/input[4]");
    private By submitReview = By.xpath("//div[@class='buttons']/button[@name='add-review']");

    public void clickOnAddReview(){
        driver.findElement(addYourReview).click();
    }

    public void setTitleForReview(String title){
        driver.findElement(reViewItem).sendKeys(title);
    }

    public void addDescpription(String des){
        driver.findElement(description).sendKeys(des);
    }

    public void setTheRationOfItem(){
        driver.findElement(ratingItem).click();
    }

    public void submitButton(){
        driver.findElement(submitReview).click();
    }


}
