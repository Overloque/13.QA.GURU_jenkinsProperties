package guru.qa.tests;

import guru.qa.pages.DemoPracticeFormPage;
import guru.qa.utils.TestDataVariables;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("form")
@Feature("Заполнение формы и проверка её полей")
@Owner("Overloque")
public class DemoPracticeFormTests extends TestBase {
    DemoPracticeFormPage demoPracticeFormPage = new DemoPracticeFormPage();
    TestDataVariables testDataVariables = new TestDataVariables();


    @Test
    @DisplayName("Заполнение формы DemoPracticeForm на сайте https://demoqa.com и проверка значений полей после подтверждения отправки формы")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "demoqa", url = "https://demoqa.com/")
    void checkFormTest() {
        step("Заполнение формы", () -> {
            demoPracticeFormPage
                    .openPage()
                    .removeBanner()
                    .setFirstName(testDataVariables.userFirstName)
                    .setLastName(testDataVariables.userLastName)
                    .setUserEmail(testDataVariables.userEmail)
                    .setGender(testDataVariables.userGender)
                    .setUserNumber(testDataVariables.userNumber)
                    .setBirthDate(testDataVariables.userBirthDay, testDataVariables.userBirthMonth,
                            testDataVariables.userBirthYear)
                    .setSubjects(testDataVariables.userSubject)
                    .setHobbies(testDataVariables.userHobbie)
                    .setUploadPicture(testDataVariables.userPicture)
                    .setCurrentAddress(testDataVariables.userCurrentAddress)
                    .setState(testDataVariables.userState)
                    .setCity(testDataVariables.userCity)
                    .submitForm();
        });
        step("Проверка соответствия значения полей формы", () -> {
            demoPracticeFormPage
                    .checkContentVisibleTable()
                    .checkTitleTable(testDataVariables.tableTitle)
                    .checkContentTable(testDataVariables.userFullName)
                    .checkContentTable(testDataVariables.userEmail)
                    .checkContentTable(testDataVariables.userGender)
                    .checkContentTable(testDataVariables.userNumber)
                    .checkContentTable(testDataVariables.userFullBirthDay)
                    .checkContentTable(testDataVariables.userSubject)
                    .checkContentTable(testDataVariables.userHobbie)
                    .checkContentTable(testDataVariables.userPicture)
                    .checkContentTable(testDataVariables.userCurrentAddress)
                    .checkContentTable(testDataVariables.userStateCity);
        });
    }
}
