package com.telran.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import com.telran.sconto.utils.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public static String baseUrl = PropertiesLoader.loadProperty("url");
    private static By cookies = By.cssSelector("[data-accept-action='all']");
    private static By loginIcon = By.cssSelector(".headerElement__icon--login");
    private static By myAccountIcon = By.cssSelector(".headerElement__status--login");
    public void acceptCookies() {
        $(cookies).click();
    }

    public void clickOnLoginIcon() {
        $(loginIcon).click();
    }

    public SelenideElement myAccountIconDisplayed() {
        return $(myAccountIcon);
    }

    public void clickOnMyAccountIcon() {
        $(myAccountIcon).click();
    }
}
