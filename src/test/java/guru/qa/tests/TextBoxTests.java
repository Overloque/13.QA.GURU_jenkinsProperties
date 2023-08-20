package guru.qa.tests;

import guru.qa.pages.TextBoxPage;
import guru.qa.utils.TestDataVariables;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();
    TestDataVariables testDataVariables = new TestDataVariables();

    @Test
    void checkFormTest() {
        //Заполнение форм
        textBoxPage
                .openPage()
                .setFullName(testDataVariables.userFirstName + " " + testDataVariables.userLastName)
                .setEmail(testDataVariables.userEmail)
                .setCurrentAddress(testDataVariables.userCurrentAddress)
                .setPermanentAddress(testDataVariables.userPermanentAddress)
                .submit();

        //Проверка форм
        textBoxPage
                .checkResult(testDataVariables.userFullName)
                .checkResult(testDataVariables.userEmail)
                .checkResult(testDataVariables.userCurrentAddress)
                .checkResult(testDataVariables.userPermanentAddress);
    }
}
