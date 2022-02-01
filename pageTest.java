package BasePage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class pageTest extends Base {
    @Test
    public void testUserAcc() {
        loginPage.clickRegister();
        loginPage.pickGender();
        loginPage.enterUserName("veselin");
        loginPage.enterLastName("nGlatko");
        loginPage.pickDay();
        loginPage.pickMount();
        loginPage.pickYear();
        loginPage.setEmail("veka9@gmail.com");
        loginPage.checkOptional();
        loginPage.setPassword("nglatko90");
        loginPage.setConfirmPassword("nglatko90");
        loginPage.setButtonReg();
        loginPage.doneRegistration();

    }
    @AfterMethod
    public void myacc() throws InterruptedException {
        myAccount.setUpMyAcc();
        myAccount.checkAddres();
        myAccount.addNewAddress();
        myAccount.addNewFirstName("Veselin");
        myAccount.addLastName("Damnjanovic");
        myAccount.addEmail("desi@gmail.com");
        myAccount.pickCountry();
        myAccount.pickState();
        myAccount.pickCity("Belgrade");
        myAccount.setAddress1("goce delceva");
        myAccount.addZip("123456");
        myAccount.addPhone("15423454");
        myAccount.saveBTN();
    }

}
