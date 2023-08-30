package guru.qa.tests;

import guru.qa.pages.TextBoxPage;
import guru.qa.utils.TestDataVariables;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("form")
@Feature("Заполнение формы и проверка её полей")
@Owner("Overloque")
public class TextBoxTests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();
    TestDataVariables testDataVariables = new TestDataVariables();

    @Test
    @DisplayName("Заполнение формы TextBoxForm на сайте https://demoqa.com и проверка значений полей после подтверждения отправки формы")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "demoqa", url = "https://demoqa.com/")
    void checkFormTest() {
        step("Открытие сайта с формой для заполнения", () -> {
            textBoxPage
                    .openPage()
                    .removeBanner();
        });
        step("Заполнение формы", () -> {
            textBoxPage
                    .setFullName(testDataVariables.userFirstName + " " + testDataVariables.userLastName)
                    .setEmail(testDataVariables.userEmail)
                    .setCurrentAddress(testDataVariables.userCurrentAddress)
                    .setPermanentAddress(testDataVariables.userPermanentAddress);
        });

        step("Подтверждение формы", () -> {
            textBoxPage
                    .submit();
        });

        step("Проверка соответствия значения полей формы", () -> {
            textBoxPage
                    .checkResult(testDataVariables.userFullName)
                    .checkResult(testDataVariables.userEmail)
                    .checkResult(testDataVariables.userCurrentAddress)
                    .checkResult(testDataVariables.userPermanentAddress);
        });
    }
}
