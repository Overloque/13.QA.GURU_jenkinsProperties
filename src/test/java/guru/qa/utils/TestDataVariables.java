package guru.qa.utils;

public class TestDataVariables {
    public String
            userFirstName = TestDataMethods.getRandomFirstName(),
            userLastName = TestDataMethods.getRandomLastName(),
            userEmail = TestDataMethods.getRandomUserEmail(),
            userGender = TestDataMethods.getRandomGender(),
            userNumber = TestDataMethods.getRandomUserPhone(),
            userBirthDay = TestDataMethods.getRandomDay(),
            userBirthMonth = TestDataMethods.getRandomMonth(),
            userBirthYear = TestDataMethods.getRandomYear(),
            userSubject = TestDataMethods.getRandomSubject(),
            userHobbie = TestDataMethods.getRandomHobbie(),
            userCurrentAddress = TestDataMethods.getRandomCurrentAddress(),
            userPicture = "image.png",
            userState = TestDataMethods.getRandomState(),
            userCity = TestDataMethods.getRandomCity(userState),
            userFullName = userFirstName + " " + userLastName,
            userFullBirthDay = userBirthDay + " " + userBirthMonth + "," + userBirthYear,
            userStateCity = userState + " " + userCity,
            userPermanentAddress = TestDataMethods.getRandomPermanentAddress(),
            tableTitle = "Thanks for submitting the form";
}
