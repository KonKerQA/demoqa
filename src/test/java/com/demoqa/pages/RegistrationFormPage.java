package com.demoqa.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import java.io.File;
import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormPage {

    private final SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            radioButtonInput = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            dateOfBirthMonth = $(".react-datepicker__month-select"),
            dateOfBirthYear = $(".react-datepicker__year-select"),
            dateOfBirthDay = $(".react-datepicker__month"),
            subjectInput = $("#subjectsInput"),
            hobbieCheckBox = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            currevtAdressInput = $("#currentAddress"),
            stateInput = $("#react-select-3-input"),
            cityInput = $("#react-select-4-input"),
            submit = $("#submit"),
            isModalIsAppear = $(".modal-dialog"),
            isTextIsHere = $(".modal-header"),
            isTextInTableHere = $(".modal-body");

    public RegistrationFormPage openSite() {
        Configuration.browserSize = "1920x1080";
        open("https://demoqa.com/automation-practice-form");


        return this;
    }

    public RegistrationFormPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationFormPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationFormPage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public RegistrationFormPage setRadioButton(String value) {
        radioButtonInput.$(byText(value)).click();

        return this;
    }

    public RegistrationFormPage setUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public RegistrationFormPage setBirthDate(String value1, String value2, String value3) {
        dateOfBirthInput.click();
        dateOfBirthYear.selectOptionContainingText(value2);
        dateOfBirthMonth.selectOptionContainingText(value1);
        dateOfBirthDay.find(new ByText(value3)).click();

        return this;
    }

    public RegistrationFormPage setSubject(String value) {
        subjectInput.setValue(value).pressEnter();

        return this;
    }

    public RegistrationFormPage setHobbie() {
        hobbieCheckBox.find(new ByText("Sports")).click();
        hobbieCheckBox.find(new ByText("Reading")).click();
        hobbieCheckBox.find(new ByText("Music")).click();

        return this;
    }

    public RegistrationFormPage setUploadPicture(String value) {
        uploadPicture.uploadFile(new File(value));

        return this;
    }

    public RegistrationFormPage setCurrentAdress(String value) {
        currevtAdressInput.setValue(value);

        return this;
    }

    public RegistrationFormPage setState(String value) {
        stateInput.setValue(value).pressEnter();

        return this;
    }

    public RegistrationFormPage setCity(String value) {
        cityInput.setValue(value).pressEnter();

        return this;
    }

    public RegistrationFormPage setSubmit() {
        submit.click();

        return this;
    }

    public RegistrationFormPage checkModal(String value,String value2 ) {
        isModalIsAppear.should(appear);
        isTextIsHere.shouldHave(text("Thanks for submitting the form"));
        isTextInTableHere.shouldHave(text(value + " " + value2));

        return this;
    }

}
