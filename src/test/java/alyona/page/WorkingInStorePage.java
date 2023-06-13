package alyona.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class WorkingInStorePage {
    private final SelenideElement heading = $("#bx_breadcrumb_2");

    public void checkingPage() {
        heading.shouldHave(text("Работа в магазине"));
    }
}
