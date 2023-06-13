package alyona.tests;

import alyona.page.MainPage;
import alyona.page.SearchPage;
import alyona.page.ShoppingCartPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class ShoppingCartTest extends TestBase {
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    @DisplayName("Проверка перемещения товара в корзину")
    public void productInShoppingCartTest() {

        step("Выбрать магазин", () ->
                mainPage.choosingStore());

        step("Проверить магазин", () ->
                mainPage.checkingStore());

        step("Ввести в поле поиска запрос и нажать enter", () ->
                mainPage.searchProduct("кашпо"));

        step("Переместить товар в корзину", () ->
                searchPage.productToCart());

        step("Перейти в корзину", () ->
                searchPage.openShoppingCart());

        step("Проверить нахождение товара в корзине", () ->
                shoppingCartPage.checkingShoppingCart("кашпо"));
    }

}
