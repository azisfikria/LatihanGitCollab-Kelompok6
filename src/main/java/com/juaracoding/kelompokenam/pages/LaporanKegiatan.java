package com.juaracoding.kelompokenam.pages;

import com.juaracoding.kelompokenam.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaporanKegiatan {
    private WebDriver driver;

    public LaporanKegiatan() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


}
