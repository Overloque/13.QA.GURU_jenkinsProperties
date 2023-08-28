package guru.qa.utils;

public class TestDataVariables {
    TestDataMethods testDataMethods = new TestDataMethods();
    public String
            userFirstName = testDataMethods.getRandomFirstName(),
            userLastName = testDataMethods.getRandomLastName(),
            userEmail = testDataMethods.getRandomUserEmail(),
            userGender = testDataMethods.getRandomGender(),
            userNumber = testDataMethods.getRandomUserPhone(),
            userBirthDay = testDataMethods.getRandomDay(),
            userBirthMonth = testDataMethods.getRandomMonth(),
            userBirthYear = testDataMethods.getRandomYear(),
            userSubject = testDataMethods.getRandomSubject(),
            userHobbie = testDataMethods.getRandomHobbie(),
            userCurrentAddress = testDataMethods.getRandomCurrentAddress(),
            userPicture = "cat.jpg",
            userState = testDataMethods.getRandomState(),
            userCity = testDataMethods.getRandomCity(userState),
            userFullName = userFirstName + " " + userLastName,
            userFullBirthDay = userBirthDay + " " + userBirthMonth + "," + userBirthYear,
            userStateCity = userState + " " + userCity,
            userPermanentAddress = testDataMethods.getRandomPermanentAddress(),
            tableTitle = "Thanks for submitting the form";
}
