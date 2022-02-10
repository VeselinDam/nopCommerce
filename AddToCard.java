package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    private By checkItem = By.xpath("//div[@class='stock']/span[2]");
    private By addItemIfIsAvaiable = By.id("add-to-cart-button-5");
    private By messageAfterItemWasAdded = By.xpath("//*[@id=\"bar-notification\"]/div/p");

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

    public void seeItem() throws InterruptedException {
        Thread.sleep(3000);
        Actions item = new Actions(driver);
        // clicking on the name of item.
        item.moveToElement(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/h2/a"))).click().perform();
    }

    public String  checkIfItemIsAvailable(){
        String availab = driver.findElement(checkItem).getText();
        return availab;
    }

    public void addItem(){
        driver.findElement(addItemIfIsAvaiable).click();
    }

    public String checkIfItemWasAddedToTheCard() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(messageAfterItemWasAdded).getText();
    }
}
