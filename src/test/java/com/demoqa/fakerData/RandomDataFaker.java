package com.demoqa.fakerData;

import com.github.javafaker.Faker;


public class RandomDataFaker {
   static Faker faker = new Faker();
    public static String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            gender = "Other",
            userNumber = faker.phoneNumber().subscriberNumber(10),
            userBirthDay = faker.number().numberBetween(1, 30) + "",
            userBirthMonth = "November",
            userBirthYear = faker.number().numberBetween(1960, 2012) + "",
            subject = "Maths",
            path = "src/test/resources/test1.png",
            currentAdress = faker.animal().name(),
            state = "NCR",
            city = "Delhi";

    public static String getFirstName(){
        return firstName;
    }

    public static String getLastName(){
        return lastName;
    }

    public static String getUserEmail(){
        return userEmail;
    }

    public static String getGender(){
        return gender;
    }

    public static String getUserNumber(){
        return userNumber;
    }

    public static String getUserBirthDay(){
        return userBirthDay;
    }

    public static String getUserBirthMonth(){
        return userBirthMonth;
    }

    public static String getUserBirthYear(){
        return userBirthYear;
    }

    public static String getSubject(){
        return subject;
    }

    public static String getPath(){
        return path;
    }

    public static String getCurrentAdress(){
        return currentAdress;
    }

    public static String getState(){
        return state;
    }

    public static String getCity(){
        return city;
    }


}
