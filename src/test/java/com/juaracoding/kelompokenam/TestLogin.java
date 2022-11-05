package com.juaracoding.kelompokenam;

import com.juaracoding.kelompokenam.pages.LoginPage;
import com.juaracoding.kelompokenam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    WebDriver driver;
    private static ExtentTest extentTest;

    private LoginPage loginPage = new LoginPage();

    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User go to Web Shop Demoqa")
    public void user_go_to_Web_ShopDemoqa(){
        driver.get(Constants.URL);
        driver.findElement(By.xpath("//a[.='Dismiss']")).click();
        extentTest.log(LogStatus.PASS, "User go to Web Shop Demoqa");
    }

    @And("User click MyAccount Page")
    public void user_click_MyAccount_Page(){
        loginPage.clickMyAccountPage();
        extentTest.log(LogStatus.PASS, "User click MyAccount Page");
    }

    @And("User enter username password")
    public void user_enter_username_password(){
        loginPage.loginForm("azisfikri", "UJIANminggu5");
        extentTest.log(LogStatus.PASS, "User enter username password");
    }

    @And("User click button login")
    public void user_click_button_login(){
        loginPage.clickLoginBtn();
        extentTest.log(LogStatus.PASS, "User click button login");
    }

    @Then("User valid credentials")
    public void user_valid_credentials(){
        Assert.assertEquals(loginPage.getTxtMyAccount(), "My Account");
        extentTest.log(LogStatus.PASS, "User valid credentials");
    }
}

