package guru.qa.utils;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class TestDataMethods {
    private final Faker faker = new Faker(new Locale("en"));
    private final Date birthday = faker.date().birthday();

    //метод getRandomInt оставлю здесь, на всякий случай, в программе нигде не использовался
    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    public String getRandomFirstName() {
        return faker.name().firstName();
    }

    public String getRandomLastName() {
        return faker.name().lastName();
    }

    public String getRandomUserEmail() {
        return faker.internet().emailAddress();
    }

    public String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        return faker.options().option(genders);
    }

    public String getRandomUserPhone() {
        return faker.phoneNumber().subscriberNumber(10);
    }

    public String getRandomDay() {
        return new SimpleDateFormat("dd").format(birthday);
    }

    public String getRandomMonth() {
        return new SimpleDateFormat("MMMM", Locale.ENGLISH).format(birthday);
    }

    public String getRandomYear() {
        return new SimpleDateFormat("yyyy", Locale.ENGLISH).format(birthday);
    }

    public String getRandomSubject() {
        String[] subjects = {"English", "Chemistry", "Computer Science", "Commerce", "Economics",
                "Social Studies", "Arts", "History", "Maths", "Accounting", "Physics", "Biology", "Hindi", "Civics"};
        return faker.options().option(subjects);
    }

    public String getRandomHobbie() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        return faker.options().option(hobbies);
    }

    public String getRandomCurrentAddress() {
        return faker.address().fullAddress();
    }

    public String getRandomPermanentAddress() {
        return faker.address().secondaryAddress();
    }

    public String getRandomState() {
        String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        return faker.options().option(states);
    }

    public String getRandomCity(String state) {
        switch (state) {
            case "NCR": {
                String[] cities = {"Delhi", "Gurgaon", "Noida"};
                return faker.options().option(cities);
            }
            case "UttarPradesh": {
                String[] cities = {"Agra", "Lucknow", "Merrut"};
                return faker.options().option(cities);
            }
            case "Haryana": {
                String[] cities = {"Karnal", "Panipat"};
                return faker.options().option(cities);
            }
            case "Rajasthan": {
                String[] cities = {"Jaipur", "Jaiselmer"};
                return faker.options().option(cities);
            }
            default: {
                return null;
            }
        }
    }

}
