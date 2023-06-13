package alyona.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class SearchTest extends TestBase {

    @Test
    @DisplayName("Проверка поисковой выдачи")
    public void searchResultsTest() {

        step("Ввести в поле поиска запрос и нажать enter", () ->
                mainPage.searchProduct("крупа"));

        step("Проверить нужный товара в поисковой выдаче", () ->
                searchPage.checkingProductInIssue("крупа"));
    }
}
