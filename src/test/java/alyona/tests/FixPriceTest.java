package alyona.tests;

import alyona.page.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("fix-price")
public class FixPriceTest extends TestBase {
     MainPage mainPage = new MainPage();

    @Tag("UI")
    @Test
    @DisplayName("Проверка поисковой выдачи")
    public void searchResults() {

        step("Поиск товара", () ->
                mainPage.searchProduct("кашпо"));

        step("Проверка нужного товара в поисковой выдаче", () ->
                mainPage.checkingProductInIssue("кашпо"));
    }

    @Tag("UI")
    @Test
    @DisplayName("Проверка на изменения города")
    public void cityChanges() {

        step("Переход на вкладу изменение города", () ->
                mainPage.changingCity());

        step("Выбор города", () ->
                mainPage.choiceCity("Екатеринбург"));

        step("Проверка выбранного города", () ->
                mainPage.checkingCity("Екатеринбург"));
    }

    @Tag("UI")
    @Test
    @DisplayName("Проверка перемещения товара в корзину")
    public void productInCart() {

        step("Выбор магазина", () ->
                mainPage.choosingStore());

        step("Поиск товара", () ->
                mainPage.searchProduct("кашпо"));

        step("Перемещение товара в корзину", () ->
                mainPage.productToCart());

        step("Переход в корзину", () ->
                mainPage.openShoppingCart());

        step("Проверка на нахождение товара в корзине", () ->
                mainPage.checkingShoppingCart("кашпо"));
    }

    @Tag("UI")
    @Test
    @DisplayName("Проверка страницы Работа у нас")
    public void pagesAboutUs() {

        step("Переход на странцу Работа у нас", () ->
                mainPage.page());

        step("Проверка информации на странице", () ->
                mainPage.checkingPage());
    }

    @Tag("UI")
    @Test
    @DisplayName("Проверка работы закладок")
    public void checkingWishlist() {

        step("Поиск товара", () ->
                mainPage.searchProduct("кашпо"));

        step("Перемещение товара в закладки", () ->
                mainPage.productToWishlist());

        step("Переход в закладки", () ->
                mainPage.openWishlist());

        step("Проверка на нахождение товара в закладках", () ->
                mainPage.checkingWishlist("кашпо"));
    }
}


