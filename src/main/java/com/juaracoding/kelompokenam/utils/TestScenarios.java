package com.juaracoding.kelompokenam.utils;

public enum TestScenarios {

    T1("User valid login"),
    T2("User search first product"),
    T3("User search second product"),
    T4("User checkout in cart");


    private String testName;

    TestScenarios(String value) {

        testName = value;
    }

    public String getTestName() {

        return testName;
    }
}
