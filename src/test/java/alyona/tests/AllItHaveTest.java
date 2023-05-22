package alyona.tests;

import alyona.page.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("Есть все!")
public class AllItHaveTest extends TestBase {
     MainPage mainPage = new MainPage();

    @Tag("UI")
    @Test
    @DisplayName("Проверка поисковой выдачи")
    public void searchResults() {

        step("Открытие главной страницы Есть все!", () ->
                mainPage.openPage());

        step("Поиск товара", () ->
                mainPage.searchProduct("краска акриловая"));

        step("Проверка нужного товара в поисковой выдаче", () ->
                mainPage.checkingProductInIssue("краска акриловая"));
    }

    @Tag("UI")
    @Test
    @DisplayName("Проверка на изменения города")
    public void cityChanges() {

        step("Открытие главной страницы Есть все!", () ->
                mainPage.openPage());

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

        step("Открытие главной страницы Есть все!", () ->
                mainPage.openPage());

        step("Поиск товара", () ->
                mainPage.searchProduct("краска акриловая"));

        step("Перемещение товара в корзину", () ->
                mainPage.productToCart());

        step("Переход в корзину", () ->
                mainPage.openShoppingCart());

        step("Проверка на нахождение товара в корзине", () ->
                mainPage.checkingShoppingCart("краска акриловая"));
    }

    @Tag("UI")
    @Test
    @DisplayName("Проверка страницы о нас")
    public void pagesAboutUs() {

        step("Открытие главной страницы Есть все!", () ->
                mainPage.openPage());

        step("Переход на странцу о нас", () ->
                mainPage.pagesAboutUs());

        step("Проверка информации на странице", () ->
                mainPage.checkingPage());
    }

    @Tag("UI")
    @Test
    @DisplayName("Проверка работы закладок")
    public void checkingWishlist() {
        step("Открытие главной страницы Есть все!", () ->
                mainPage.openPage());

        step("Поиск товара", () ->
                mainPage.searchProduct("краска акриловая"));

        step("Перемещение товара в закладки", () ->
                mainPage.productToWishlist());

        step("Переход в закладки", () ->
                mainPage.openWishlist());

        step("Проверка на нахождение товара в закладках", () ->
                mainPage.checkingWishlist("краска акриловая"));
    }
}


