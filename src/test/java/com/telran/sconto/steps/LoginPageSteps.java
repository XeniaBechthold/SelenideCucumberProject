package com.telran.sconto.steps;

import com.telran.sconto.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageSteps implements En {
    LoginPage login;

    public LoginPageSteps() {
        Then("Login Page displayed", () -> {
            login = page(LoginPage.class);
            login.loginPageTitleDisplayed().should(exist);
            login.loginPageTitleDisplayed().shouldHave(text("Anmelden"));
        });

        When("Enter the valid credentials", () -> {
            login.validLoginInput();
        });

        And("Click on Anmelden Button", () -> {
            login.clickOnLoginButton();
        });

        When("Enter the wrong Email and valid Password", (DataTable table)->{
            List<Map<String, String>> dataTable = table.asMaps();
            String email = dataTable.get(0).get("email");
            String password = dataTable.get(0).get("password");
            login.wrongEmailInput(email, password);
        });

        Then("Error Email Message displayed", ()->{
            login.errorEmailMessage().shouldHave(text("Bitte geben Sie eine gültige E-Mail-Adresse ein"));
        });

        When("Enter the empty Email and valid Password", (DataTable table)->{
            List<Map<String, String>> dataTable = table.asMaps();
            String email = dataTable.get(0).get("email");
            String password = dataTable.get(0).get("password");
            login.emptyEmailInput(email, password);
        });

        Then("No Email Error displayed", ()->{
            login.errorEmailMessage().shouldHave(text("Bitte geben Sie Ihre E-Mail-Adresse ein"));
        });

        When("Enter the valid Email and empty Password", (DataTable table)-> {
            List<Map<String, String>> dataTable = table.asMaps();
            String email = dataTable.get(0).get("email");
            String password = dataTable.get(0).get("password");
            login.emptyPasswordInput(email, password);
        });

        Then("Wrong Password Error displayed", ()->{
            login.errorPasswordMessage().shouldHave(text("mindestes 8 Zeichen mit mindestens einem"));
        });

    }
}
