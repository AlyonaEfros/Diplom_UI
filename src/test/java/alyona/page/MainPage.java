package alyona.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement
            searchBar = $("input.border-0"),
            productsList = $(".name.flex-grow-1"),
            city = $("a.mr-lg-100"),
            citiesList =$(".list_cities"),
            toCard= $("button.buy"),
            shoppingCartButton = $(".cart-wrapper"),
            productCard = $(".border-bottom.product"),
            left = $(".left"),
            heading =  $("h1.mb-3"),
            toWishlist = $(".spinner-border-sm"),
            inWishlist =  $(".wishlist_header"),
            productWishlist = $(".name.flex-grow-1.mt-1");


        public void openPage() {
            open(baseUrl);
        }

         public void searchProduct (String value) {
             searchBar.setValue(value).pressEnter();
    }

         public void checkingProductInIssue (String value) {
             productsList.shouldHave(text(value));
        }

        public void changingCity() {
            city.click();
    }

        public void choiceCity(String value) {
            citiesList.$(byText(value)).click();
    }

        public void checkingCity(String value) {
            city.shouldHave(text(value));
    }

        public void productToCart() {
            toCard.click();
    }

        public void openShoppingCart() {
            shoppingCartButton.hover().$(byText("Открыть корзину")).click();
    }


    public void checkingShoppingCart(String value) {
        productCard.shouldHave(text(value));
    }

    public void pagesAboutUs() {
        left.$(byText("О нас")).click();
    }

    public void checkingPage() {
        heading.shouldHave(text("Информация о сайте интернет-магазина Есть всё"));
    }

    public void productToWishlist() {
        toWishlist.click();
    }

    public void openWishlist() {
        inWishlist.click();
    }

    public void checkingWishlist(String value) {
        productWishlist.shouldHave(text(value));
    }
}
