package guru.qa.tests;

import guru.qa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void checkFormTest() {
        //Заполнение форм
        textBoxPage
                .openPage()
                .setFullName("Michael Woods")
                .setEmail("mw@gmail.com")
                .setCurrentAddress("New York")
                .setPermanentAddress("San Francisco")
                .submit();

        //Проверка форм
        textBoxPage
                .checkResult("Michael Woods")
                .checkResult("mw@gmail.com")
                .checkResult("New York")
                .checkResult("San Francisco");

    }
}
