package com.juaracoding.kelompokenam;

import com.juaracoding.kelompokenam.pages.Login;
import com.juaracoding.kelompokenam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    WebDriver driver;
    private static ExtentTest extentTest;

    private Login login = new Login();

    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("TCC.TMS.257 Staff enter correct web URL")
    public void staff_enter_correct_web_url(){
        Hooks.delay(1);
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "TCC.TMS.257 Staff enter correct web URL");
    }

    @Then("TCC.TMS.257 Staff on DIKA TMS login page")
    public void staff_on_TMS_login_page(){
        Hooks.delay(1);
        Assert.assertTrue(login.getTxtTMS().contains("DIKA"));
        extentTest.log(LogStatus.PASS, "TCC.TMS.257 Staff on DIKA TMS login page");
    }

    @When("TCC.TMS.258 Staff enter incorrect URL")
    public void staff_enter_incorrect_web_URL(){
        Hooks.delay(1);
        driver.get("https://dev.ptdika.com/tiket.com/logiinn");
        extentTest.log(LogStatus.PASS, "TCC.TMS.258 Staff enter incorrect URL");
    }

    @Then("TCC.TMS.258 Staff on 404 page not found")
    public void staff_on_page_404_not_found(){
        Hooks.delay(1);
        Assert.assertTrue(login.getTxtPageNotFound().contains("404 Page"));
        extentTest.log(LogStatus.PASS, "TCC.TMS.258 Staff on 404 page not found");
    }

    @When("TCC.TMS.259 Staff on TMS login page")
    public void staff_on_login_page(){
        Hooks.delay(1);
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "TCC.TMS.259 Staff on TMS login page");
    }
    @And("TCC.TMS.259 Staff input username password valid")
    public void staff_input_username_password_valid(){
        Hooks.delay(1);
        login.loginForm("D6201031", "1994-10-02");
        extentTest.log(LogStatus.PASS, "TCC.TMS.259 Staff input username password valid");
    }
    @And("TCC.TMS.259 Staff click button login valid")
    public void staff_click_button_login_valid(){
        Hooks.delay(1);
        login.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "TCC.TMS.259 Staff click button login valid");
    }

    @Then("TCC.TMS.259 Staff on dashboard page")
    public void staff_on_dashboard_page(){
        Hooks.delay(1);
        System.out.println(login.getTxtValidStaff());
        Assert.assertEquals(login.getTxtValidStaff(), "Dashboard");
        extentTest.log(LogStatus.PASS, "TCC.TMS.259 Staff on dashboard page");
        login.clickBtnProfileAnton();
        login.clickBtnLogout();
    }

    @When("TCC.TMS.260 Staff on login page invalid")
    public void staff_on_login_page_invalid(){
        Hooks.delay(1);
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "TCC.TMS.260 Staff on login page invalid");
    }
    @And("TCC.TMS.260 Staff input username password invalid")
    public void staff_login_invalid(){
        Hooks.delay(1);
        login.loginForm("d6201031", "D1k4@passw0rd");
        extentTest.log(LogStatus.PASS, "TCC.TMS.260 Staff input username password invalid");
    }
    @And("TCC.TMS.260 Staff click button login invalid")
    public void staff_click_button_login_invalid(){
        Hooks.delay(1);
        login.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "TCC.TMS.260 Staff click button login invalid");
    }

    @Then("TCC.TMS.260 Notification wrong username or password")
    public void staff_message_wrong_username_or_password(){
        Hooks.delay(1);
        System.out.println(login.getTxtMessageWrongUsernameOrPassword());
        Assert.assertTrue(login.getTxtMessageWrongUsernameOrPassword().contains("Wrong username"));
        extentTest.log(LogStatus.PASS, "TCC.TMS.260 Notification wrong username or password");
    }

    @When("TCC.TMS.261 Staff on login page null")
    public void staff_on_login_page_null(){
        Hooks.delay(1);
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "TCC.TMS.261 Staff on login page null");
    }
    @And("TCC.TMS.261 Staff null username password")
    public void staff_null_username_password(){
        Hooks.delay(1);
        login.loginForm("", "");
        extentTest.log(LogStatus.PASS, "TCC.TMS.261 Staff null username password");
    }
    @And("TCC.TMS.261 Staff click button login null")
    public void staff_click_button_login_null(){
        Hooks.delay(1);
        login.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "TCC.TMS.261 Staff click button login null");
    }

    @Then("TCC.TMS.261 Pop up alert please fill out this field")
    public void staff_pop_up_please_fill_out_this_field(){
        Hooks.delay(1);
        login.loginForm("", "");
        System.out.println(login.getTxtNullMessage());
        Assert.assertEquals(login.getTxtNullMessage(), "true");
        extentTest.log(LogStatus.PASS, "TCC.TMS.261 Pop up alert please fill out this field");
    }

    @When("TCC.TMS.262 Staff on dashboard page")
    public void staff_on_dashboard_page_to_logout(){
        Hooks.delay(1);
        driver.get(Constants.URL);
        login.loginForm("D6201031", "1994-10-02");
        login.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "TCC.TMS.262 Staff on dashboard page");
    }

    @And("TCC.TMS.262 Staff click button profile")
    public void staff_click_button_profile(){
        Hooks.delay(1);
        login.clickBtnProfileAnton();
        extentTest.log(LogStatus.PASS, "TCC.TMS.262 Staff click button profile");
    }

    @And("TCC.TMS.262 Staff click button logout")
    public void staff_click_button_logout(){
        Hooks.delay(1);
        login.clickBtnLogout();
        extentTest.log(LogStatus.PASS, "TCC.TMS.262 Staff click button logout");
    }

    @Then("TCC.TMS.262 Staff back to login page")
    public void staff_back_to_login_page(){
        Hooks.delay(1);
        Assert.assertTrue(login.getTxtTMS().contains("DIKA"));
        extentTest.log(LogStatus.PASS, "TCC.TMS.262 Staff back to login page");
    }
}

