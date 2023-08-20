package guru.qa.tests;

import guru.qa.pages.DemoPracticeFormPage;
import guru.qa.utils.TestDataVariables;
import org.junit.jupiter.api.Test;


public class DemoPracticeFormTests extends TestBase {
    DemoPracticeFormPage demoPracticeFormPage = new DemoPracticeFormPage();
    TestDataVariables testDataVariables = new TestDataVariables();

    @Test
    void checkFormTest() {
        //Заполнение форм
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
                .setCurrentAddress(testDataVariables.userCurrentAddress)
                .setUploadPicture(testDataVariables.userPicture)
                .setState(testDataVariables.userState)
                .setCity(testDataVariables.userCity)
                .submitForm();

        //Проверки на формы
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
    }
}
