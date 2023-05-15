package ru.yandex.praktikum.pageObject;

import org.openqa.selenium.By;

public class OrderPage {
    private final By orderHeader = By.className("Order_Header__BZXOb");
    private final By name = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Error__1Tx5d Input_Responsible__1jDKN']");
    private final By surname = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Error__1Tx5d Input_Responsible__1jDKN']");
    private final By address = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    private final By stateMetro = By.className("select-search__input");
    private final By telephone = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Filled__1rDxs Input_Responsible__1jDKN']");
    private final By buttonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
}
