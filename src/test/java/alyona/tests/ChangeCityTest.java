package alyona.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class ChangeCityTest extends TestBase {

    @Test
    @DisplayName("Проверка на изменения города")
    public void cityChangesTest() {

        step("Переход на вкладу изменение города", () ->
                mainPage.changingCity());

        step("Выбрать города", () ->
                mainPage.choiceCity("Екатеринбург"));

        step("Проверить выбранный город", () ->
                mainPage.checkingCity("Екатеринбург"));
    }
}
