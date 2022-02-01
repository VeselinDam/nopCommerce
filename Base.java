package BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import pages.MyAccount;

public class Base {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected MyAccount myAccount;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        loginPage = new LoginPage(driver);
        myAccount = new MyAccount(driver);

    }

    //@AfterTest
    public void close(){
        driver.quit();
    }

}
