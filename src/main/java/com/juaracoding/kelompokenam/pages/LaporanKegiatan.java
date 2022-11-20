package com.juaracoding.kelompokenam.pages;

import com.juaracoding.kelompokenam.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaporanKegiatan {
    private WebDriver driver;

    public LaporanKegiatan() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Laporan Kegiatan']")
    WebElement laporanKegiatan;

    @FindBy(xpath = "//a[normalize-space()='Absen Masuk']")
    WebElement absenMasuk;

    @FindBy(id = "file")
    WebElement chooseFile;

    public void clickLaporanKegiatan(){
        laporanKegiatan.click();
    }

    public void clickAbsenMasuk(){
        absenMasuk.click();
    }

    public void clickChooseFile(){
        chooseFile.sendKeys("/Users/ABDUL AZIS/Pictures/User Staf TMS/Anton.jpg");
    }
}
