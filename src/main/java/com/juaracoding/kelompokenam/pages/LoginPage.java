package com.juaracoding.kelompokenam.pages;

import com.juaracoding.kelompokenam.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    WebElement inpUsername;

    @FindBy (id = "password")
    WebElement inpPassword;

    @FindBy (xpath = "//button[@name='login']")
    WebElement btnLogin;

    @FindBy(xpath = "//a[.='My Account']")
    WebElement btnMyAccount;

    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement txtMyAccount;

    public void clickMyAccountPage(){

        btnMyAccount.click();
    }
    public void loginForm(String username, String password){
        this.inpUsername.sendKeys(username);
        this.inpPassword.sendKeys(password);
    }
    public void clickLoginBtn(){

        btnLogin.click();
    }

    public String getTxtMyAccount(){

        return txtMyAccount.getText();
    }
}

