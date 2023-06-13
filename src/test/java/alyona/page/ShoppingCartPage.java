package alyona.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ShoppingCartPage {

    private final SelenideElement productCard = $("button[data-test=button-title]");

    public void checkingShoppingCart(String value) {
        productCard.shouldHave(text(value));
    }

}
