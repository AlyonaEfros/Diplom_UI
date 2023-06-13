package alyona.tests;

import alyona.page.MainPage;
import alyona.page.SearchPage;
import alyona.page.WishListPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class WishListTest extends TestBase {
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    WishListPage wishListPage = new WishListPage();

    @Test
    @DisplayName("Проверка работы закладок")
    public void wishlistTest() {

        step("Ввести в поле поиска запрос и нажать enter", () ->
                mainPage.searchProduct("крупа"));

        step("Переместить товар в закладки", () ->
                searchPage.productToWishlist());

        step("Перейти в закладки", () ->
                searchPage.openWishlist());

        step("Проверить нахождение товара в закладках", () ->
                wishListPage.checkingWishlist("крупа"));
    }
}
