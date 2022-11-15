package com.telran.sconto.pages;


import com.codeborne.selenide.Conditional;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.telran.sconto.utils.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static By loginTitle = By.cssSelector(".existingAccount__headline");
    private static By emailInput = By.id("loginEmail");
    private static By passwordInput = By.id("loginPassword");
    private static By loginButton = By.id("login-submit");
    private static String validEmail = PropertiesLoader.loadProperty("valid.email");
    private static String validPassword = PropertiesLoader.loadProperty("valid.password");

    private static By emailErrorMessage = By.id("loginEmail-error");
    private static By passwordErrorMessage = By.id("loginPassword-error");

    public SelenideElement loginPageTitleDisplayed() {
        return $(loginTitle);
    }

    public void validLoginInput() {
        $(emailInput).setValue(validEmail);
        $(passwordInput).setValue(validPassword);
    }

    public void clickOnLoginButton() {
        $(loginButton).click();
    }

    public void wrongEmailInput(String email, String password) {
        $(emailInput).setValue(email);
        $(passwordInput).setValue(password);
    }

    public SelenideElement errorEmailMessage() {
        return $(emailErrorMessage);
    }

    public void emptyEmailInput(String email, String password) {
        $(emailInput).setValue(email);
        $(passwordInput).setValue(password);
    }


    public void emptyPasswordInput(String email, String password) {
        $(emailInput).setValue(email);
        $(passwordInput).setValue(password);
    }

    public  SelenideElement errorPasswordMessage() {
        return $(passwordErrorMessage);
    }
}
