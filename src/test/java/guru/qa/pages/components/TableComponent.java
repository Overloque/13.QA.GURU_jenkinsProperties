package guru.qa.pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TableComponent {
    public void tableChecks(String value) {
        $(".table-responsive").shouldHave(text(value));
    }
}
