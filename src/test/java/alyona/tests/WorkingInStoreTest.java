package alyona.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class WorkingInStoreTest extends TestBase {

    @Test
    @DisplayName("Проверка страницы Работа у нас")
    public void pagesWorkWithUsTest() {

        step("Перейти на странцу Работа у нас", () ->
                mainPage.page());

        step("Проверить информацию на странице", () ->
                workingInStorePage.checkingPage());
    }
}
