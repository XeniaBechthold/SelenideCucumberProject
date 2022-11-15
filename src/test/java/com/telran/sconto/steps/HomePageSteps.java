package com.telran.sconto.steps;

import com.telran.sconto.pages.HomePage;
import io.cucumber.java8.En;


import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.open;
import static com.telran.sconto.pages.HomePage.baseUrl;

public class HomePageSteps implements En {

    HomePage home;

    public HomePageSteps() {
        Given("Navigate to HomePage",() -> {
           // System.setProperty("selenide.browser", "FireFox");
            home = open(baseUrl, HomePage.class);
            home.acceptCookies();
        });
        When("Click on Anmelden icon", () -> {
            home.clickOnLoginIcon();
        });

        Then("Home Page displayed", ()->{
            home.myAccountIconDisplayed().should(exist);
        });

        When("Click on Mein Konto icon", () ->{
            home.clickOnMyAccountIcon();
        });

    }
}
