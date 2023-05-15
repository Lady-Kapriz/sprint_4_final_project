package ru.yandex.praktikum.pageObject;

import org.openqa.selenium.By;

public class AboutRent {
    private final By rentHeader = By.className("Order_Header__BZXOb");
    private final By date = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN Input_Filled__1rDxs react-datepicker-ignore-onclickoutside']");
    private final By duration = By.xpath(".//div[@class='Dropdown-placeholder is-selected']");
    private final By colour = By.className("Order_Checkboxes__3lWSI");
    private final By comment = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    private final By backButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i']");
    private final By orderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
}
