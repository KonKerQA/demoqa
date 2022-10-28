package com.demoqa.test;

import com.demoqa.fakerData.RandomDataFaker;
import com.demoqa.pages.RegistrationFormPage;
import org.junit.jupiter.api.Test;
import static com.demoqa.fakerData.RandomDataFaker.*;


public class test1 {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test
    void fillformtest() {
        registrationFormPage.openSite()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setRadioButton(gender)
                .setUserNumber(userNumber)
                .setBirthDate(userBirthMonth, userBirthYear, userBirthDay)
                .setSubject(subject)
                .setHobbie()
                .setUploadPicture(path)
                .setCurrentAdress(currentAdress)
                .setState(state)
                .setCity(city)
                .setSubmit()
                //check
                .checkModal(firstName,lastName);

    }
}
