package com.juaracoding.kelompokenam;

import com.juaracoding.kelompokenam.pages.LaporanKegiatan;
import com.juaracoding.kelompokenam.pages.Login;
import com.juaracoding.kelompokenam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestLaporanKegiatan {

    WebDriver driver;
    private static ExtentTest extentTest;

    private Login login = new Login();
    private LaporanKegiatan laporanKegiatan = new LaporanKegiatan();

    public TestLaporanKegiatan(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("TCC.TMS.263 Staff on dashboard page")
    public void staff_on_dashboard_page(){
        driver.get(Constants.URL);
        Hooks.delay(1);
        login.loginForm("D6201031", "1994-10-02");
        login.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "TCC.TMS.263 Staff on dashboard page");
    }

    @And("TCC.TMS.263 Staff click laporan kegiatan")
    public void staff_click_laporanKegiatan(){
        laporanKegiatan.clickLaporanKegiatan();
        extentTest.log(LogStatus.PASS, "TCC.TMS.263 Staff click laporan kegiatan");
    }

    @And("TCC.TMS.263 Staff click absen masuk")
    public void staff_click_absen_masuk(){
        laporanKegiatan.clickAbsenMasuk();
        extentTest.log(LogStatus.PASS, "TCC.TMS.263 Staff click absen masuk");
    }

    @And("TCC.TMS.263 Staff click choose file")
    public void staff_click_choose_file(){
        laporanKegiatan.clickChooseFile();

    }
}
