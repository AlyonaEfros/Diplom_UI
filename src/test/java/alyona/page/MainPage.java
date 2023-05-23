package alyona.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement
            searchBar = $("input.search-input"),
            productsList = $("#gp5130228"),
            city = $("span.geo"),
            citiesList = $(".list"),
            toCard = $(".controls.grid-button"),
            shoppingCartButton = $("a.cart.link"),
            productCard = $("button[data-test=button-title]"),
            left = $(".left").$(byText("Работа у нас")),
            heading = $("#bx_breadcrumb_2"),
            toWishlist = $("button.button-favorites"),
            inWishlist = $("a.favorite.link"),
            saveButton = $("button.button.save.button"),
            closeButton = $("button.close"),
            mGeo = $(".svg-geo"),
            pickupAddress = $("[data-test=choose-store-btn]"),
            addressSelection = $$(".stores").first().$(".address"),
            confirmationButton = $("button[data-test=select-button]");

    public void choosingStore() {
        mGeo.click();
        pickupAddress.click();
        addressSelection.click();
        confirmationButton.click();
    }

    public void searchProduct(String value) {
        searchBar.setValue(value).pressEnter();
    }

    public void checkingProductInIssue(String value) {
        productsList.shouldHave(text(value));
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

    public void productToCart() {
        toCard.click();

    }

    public void openShoppingCart() {
        closeButton.click();
        shoppingCartButton.click();
    }


    public void checkingShoppingCart(String value) {
        productCard.shouldHave(text(value));
    }

    public void page() {
        left.click();
    }

    public void checkingPage() {
        heading.shouldHave(text("Работа в магазине"));
    }

    public void productToWishlist() {
        toWishlist.click();
    }

    public void openWishlist() {
        inWishlist.click();
    }

    public void checkingWishlist(String value) {
        productsList.shouldHave(text(value));
    }
}
