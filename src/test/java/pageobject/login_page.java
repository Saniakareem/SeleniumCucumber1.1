package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {

    @FindBy(id="userName")
    @CacheLookup
    WebElement txt_username;

    @FindBy(id="password")
    @CacheLookup
    WebElement txt_password;

    @FindBy(xpath="//  *[@id=\"body\"]/app-root/layout/empty-layout/div/div/auth-sign-in/div/div[1]/div/form/button")
    WebElement btn_login;
    WebDriver driver;
    //Constructor to get driver instance and initialize Elements using method initElements
    public login_page(WebDriver driver1){
        this.driver= driver1;
        PageFactory.initElements(driver,  this);

    }
     public void enterUsername(String username){
         txt_username.sendKeys(username);
     }
    public void enterpassword(String password){
        txt_password.sendKeys(password);
    }

    public void clickonlogin(){
        btn_login.click();
        driver.close();
    }
}
