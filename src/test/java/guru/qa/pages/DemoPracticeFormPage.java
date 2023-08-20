package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;
import guru.qa.pages.components.CalendarComponent;
import guru.qa.pages.components.TableComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DemoPracticeFormPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    TableComponent tableComponent = new TableComponent();
    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderCheckbox = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            subjectInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            uploadPictureInput = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            stateInput = $("#state"),
            stateCityInput = $("#stateCity-wrapper"),
            cityInput = $("#city"),
            submitButton = $("#submit"),
            titleTable = $(".modal-header"),
            contentTable = $(".modal-title");


    public DemoPracticeFormPage openPage() {
        open("/automation-practice-form");

        return this;
    }

    public DemoPracticeFormPage removeBanner() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public DemoPracticeFormPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public DemoPracticeFormPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public DemoPracticeFormPage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public DemoPracticeFormPage setGender(String value) {
        genderCheckbox.$(byText(value)).click();

        return this;
    }

    public DemoPracticeFormPage setUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public DemoPracticeFormPage setBirthDate(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public DemoPracticeFormPage setSubjects(String value) {
        subjectInput.setValue(value).pressEnter();

        return this;
    }

    public DemoPracticeFormPage setHobbies(String value) {
        hobbiesInput.$(byText(value)).click();

        return this;
    }

    public DemoPracticeFormPage setUploadPicture(String value) {
        uploadPictureInput.uploadFromClasspath(value);

        return this;
    }

    public DemoPracticeFormPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);

        return this;
    }

    public DemoPracticeFormPage setState() {
        stateInput.click();

        return this;
    }

    public DemoPracticeFormPage setStateCity(String value) {
        stateCityInput.$(byText(value)).click();

        return this;
    }

    public DemoPracticeFormPage setCity() {
        cityInput.click();

        return this;
    }

    public void submitButton() {
        submitButton.click();
    }

    public DemoPracticeFormPage checkTitleTable(String value) {
        titleTable.shouldHave(text(value));
        return this;
    }

    public DemoPracticeFormPage checkContentVisibleTable() {
        contentTable.shouldBe(visible);
        return this;
    }

    public DemoPracticeFormPage checkContentTable(String value) {
        tableComponent.tableChecks(value);

        return this;
    }
}
