package com.juaracoding.kelompokenam.utils;

public enum TestScenarios {

    T1("TCC.TMS.237 Staff go to web correct URL"),
    T2("TCC.TMS.238 Staff go to web incorrect URL"),
    T3("TCC.TMS.239 Staff login valid"),
    T4("TCC.TMS.240 Staff login invalid"),
    T5("TCC.TMS.241 Staff login null"),
    T6("TCC.TMS.242 Staff logout");


    private String testName;

    TestScenarios(String value) {

        testName = value;
    }

    public String getTestName() {

        return testName;
    }
}
