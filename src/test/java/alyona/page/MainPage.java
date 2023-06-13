package alyona.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement
            searchBar = $("input.search-input"),
            city = $("span.geo"),
            citiesList = $(".list"),
            left = $(".left").$(byText("Работа у нас")),
            saveButton = $("button.button.save.button"),
            mGeo = $(".svg-geo"),
            pickupAddress = $("[data-test=choose-store-btn]"),
            addressSelection = $$(".stores").first().$(".address"),
            confirmationButton = $("button[data-test=select-button]"),
            storeAddress = $(".header-obtain-method");

    public void choosingStore() {
        mGeo.click();
        pickupAddress.click();
        addressSelection.click();
        confirmationButton.click();
    }

    public void checkingStore() {
        storeAddress.shouldBe(text("г.Москва, пр-т Жукова Маршала, д.53, к.1"));
    }

    public void searchProduct(String value) {
        searchBar.setValue(value).pressEnter();
    }


    public void changingCity() {
        city.click();
    }

    public void choiceCity(String value) {
        citiesList.$(byText(value)).click();
        saveButton.click();
    }

    public void checkingCity(String value) {
        city.shouldHave(text(value));
    }

    public void page() {
        left.click();
    }

}
