package ru.yandex.praktikum.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RenterAboutPage {
    WebDriver driver;
    private final By orderHeader = By.className("Order_Header__BZXOb");
    private final By name = By.xpath(".//input[@placeholder='* Имя']");
    private final By surname = By.xpath(".//input[@placeholder='* Фамилия']");
    private final By address = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private final By stateMetro = By.className("select-search__input");
    private final By telephone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By buttonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final String nameStateMetro = ".//button[@value='%s']";


    public RenterAboutPage(WebDriver driver) {
        this.driver = driver;
    }

    //метод ожидания загруки страницы заказа
    public RenterAboutPage waitForLoadOrderPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> (driver.findElement(orderHeader).getText() != null
                && !driver.findElement(orderHeader).getText().isEmpty()
        ));
        return this;
    }

    public RenterAboutPage inputName(String newName) {
        driver.findElement(name).sendKeys(newName);
        return this;
    }

    public RenterAboutPage inputSurname(String newSurname) {
        driver.findElement(surname).sendKeys(newSurname);
        return this;
    }

    public RenterAboutPage inputAddress(String newAddress) {
        driver.findElement(address).sendKeys(newAddress);
        return this;
    }

    public RenterAboutPage changeStateMetro(int stateNumber) {
        driver.findElement(stateMetro).click();
        driver.findElement(By.xpath(String.format(nameStateMetro, stateNumber))).click();
        return this;
    }

    public RenterAboutPage inputTelephone(String newTelephone) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(telephone));
        driver.findElement(telephone).sendKeys(newTelephone);
        return this;
    }

    public void clickNextButton() {
        driver.findElement(buttonNext).click();
    }
}
