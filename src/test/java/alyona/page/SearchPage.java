package alyona.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    private final SelenideElement productsList = $("#gp5130228"),
            toCard = $(".controls.grid-button"),
            closeButton = $("button.close"),
            toWishlist = $("button.button-favorites"),
            inWishlist = $("a.favorite.link"),
            shoppingCartButton = $("a.cart.link");


    public void checkingProductInIssue(String value) {
        productsList.shouldHave(text(value));

    }

    public void productToCart() {
        toCard.click();
    }

    public void openShoppingCart() {
        closeButton.click();
        shoppingCartButton.click();
    }

    public void productToWishlist() {
        toWishlist.click();
    }

    public void openWishlist() {
        inWishlist.click();
    }
}
