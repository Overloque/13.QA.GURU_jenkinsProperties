package guru.qa.tests;

import guru.qa.pages.DemoPracticeFormPage;
import org.junit.jupiter.api.Test;


public class DemoPracticeFormTests extends TestBase {
    DemoPracticeFormPage demoPracticeFormPage = new DemoPracticeFormPage();

    @Test
    void checkFormTest() {
        //Заполнение форм
        demoPracticeFormPage
                .openPage()
                .removeBanner()
                .setFirstName("Konstantin")
                .setLastName("Poludnitsyn")
                .setUserEmail("test@gmail.com")
                .setGender("Male")
                .setUserNumber("8909123456")
                .setBirthDate("10", "August", "2000")
                .setSubjects("Biology")
                .setHobbies("Sports")
                .setCurrentAddress("Address")
                .setUploadPicture("image.png")
                .setState()
                .setStateCity("NCR")
                .setCity()
                .setStateCity("Delhi")
                .submitButton();

        //Проверки на формы
        demoPracticeFormPage
                .checkContentVisibleTable()
                .checkTitleTable("Thanks for submitting the form")
                .checkContentTable("Konstantin Poludnitsyn")
                .checkContentTable("test@gmail.com")
                .checkContentTable("Male")
                .checkContentTable("8909123456")
                .checkContentTable("10 August,2000")
                .checkContentTable("Biology")
                .checkContentTable("Sports")
                .checkContentTable("image.png")
                .checkContentTable("Address")
                .checkContentTable("NCR Delhi");
    }
}
