package com.juaracoding.kelompokenam.pages;

import com.juaracoding.kelompokenam.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='NIK']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;

    @FindBy(className = "page-header")
    WebElement txtValidCredentials;

    @FindBy(xpath = "//h1[@class='page-header']")
    WebElement txtValidStaff;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissable']")
    WebElement txtMessageWrongUsernameOrPassword;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]/div[1]/b")
    WebElement txtTMS;
    //*[@id="page-container"]/div/div[1]/div[1]/b
    //div[@class='brand']
    @FindBy(xpath = "//h1[normalize-space()='404 Page Not Found']")
    WebElement txtPageNotFound;

    @FindBy(xpath = "//span[normalize-space()='Admin TMS']")
    WebElement btnProfileAdmin;

    @FindBy(xpath = "//span[normalize-space()='ANTON EDI SATRIO']")
    WebElement btnProfileAnton;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    WebElement btnLogout;

    public void loginForm(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }

    public String getTxtTMS(){
        return txtTMS.getText();
    }
    public String getTxtPageNotFound(){
        return txtPageNotFound.getText();
    }
    public String getTxtValidCredentials(){
        return txtValidCredentials.getText();
    }
    public String getTxtValidStaff(){ return txtValidStaff.getText();}
    public String getTxtMessageWrongUsernameOrPassword(){
        return txtMessageWrongUsernameOrPassword.getText();

    }
    public String getTxtNullMessage(){
        return username.getAttribute("required");
    }

    public void clickBtnProfileAdmin(){
        btnProfileAdmin.click();
    }
    public void clickBtnProfileAnton(){ btnProfileAnton.click();}
    public void clickBtnLogout(){
        btnLogout.click();
    }

}
