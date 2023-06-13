package alyona.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class WishListPage {
    private final SelenideElement productsList = $("gp1651028");

    public void checkingWishlist(String value) {
        productsList.shouldHave(text(value));
    }
}
