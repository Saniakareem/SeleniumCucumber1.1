package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.login_page;

import java.time.Duration;


public class LoginSteps {
    WebDriver driver=null;
//    By EMAIL_FIELD = By.id("userName");
//    By PASSWORD_FIELD = By.id("password");

    String username = "superadmin";
    String password = "superadmin";
    login_page login;



    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
         System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\IdeaProjects\\SeleniumCucumber1.1\\chromedriver.exe");
         driver=new ChromeDriver();

    }

    @When("I open login page")
    public void i_open_login_page() {

        driver.get("http://80.252.109.72:8085/sign-in?redirectURL=%2Fdashboards%2Fproject");

    }


    @Then("^I enter (.*) and (.*)$")
    public void i_enter_username_and_password(String username ,String password) {
        login =new login_page(driver);

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
        login.enterUsername(username);
        login.enterpassword(password);
//        driver.findElement(By.id("userName")).sendKeys("superadmin");
//        driver.findElement(By.id("password")).sendKeys("superadmin");


    }

    @And("sucessfully login")
    public void sucessfully_login() {

        login.clickonlogin();
//        WebElement SUBMIT_BUTTON = driver.findElement(By.xpath("//*[@id=\"body\"]/app-root/layout/empty-layout/div/div/auth-sign-in/div/div[1]/div/form/button"));
//        SUBMIT_BUTTON.click();

    }
}
