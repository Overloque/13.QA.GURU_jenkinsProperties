package guru.qa.utils;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class TestDataMethods {
    private final static Faker faker = new Faker(new Locale("en"));
    private final static Date birthday = faker.date().birthday();

    //метод getRandomInt оставлю здесь, на всякий случай, в программе нигде не использовался
    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    public static String getRandomFirstName() {
        return faker.name().firstName();
    }

    public static String getRandomLastName() {
        return faker.name().lastName();
    }

    public static String getRandomUserEmail() {
        return faker.internet().emailAddress();
    }

    public static String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        return faker.options().option(genders);
    }

    public static String getRandomUserPhone() {
        return faker.numerify("##########");
    }

    public static String getRandomDay() {
        return new SimpleDateFormat("dd").format(birthday);
    }

    public static String getRandomMonth() {
        return new SimpleDateFormat("MMMM", Locale.ENGLISH).format(birthday);
    }

    public static String getRandomYear() {
        return new SimpleDateFormat("yyyy", Locale.ENGLISH).format(birthday);
    }

    public static String getRandomSubject() {
        String[] subjects = {"English", "Chemistry", "Computer Science", "Commerce", "Economics",
                "Social Studies", "Arts", "History", "Maths", "Accounting", "Physics", "Biology", "Hindi", "Civics"};
        return faker.options().option(subjects);
    }

    public static String getRandomHobbie() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        return faker.options().option(hobbies);
    }

    public static String getRandomCurrentAddress() {
        return faker.address().fullAddress();
    }

    public static String getRandomPermanentAddress() {
        return faker.address().secondaryAddress();
    }

    public static String getRandomState() {
        String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        return faker.options().option(states);
    }

    public static String getRandomCity(String state) {
        switch (state) {
            case "NCR" -> {
                String[] cities = {"Delhi", "Gurgaon", "Noida"};
                return faker.options().option(cities);
            }
            case "UttarPradesh" -> {
                String[] cities = {"Agra", "Lucknow", "Merrut"};
                return faker.options().option(cities);
            }
            case "Haryana" -> {
                String[] cities = {"Karnal", "Panipat"};
                return faker.options().option(cities);
            }
            case "Rajasthan" -> {
                String[] cities = {"Jaipur", "Jaiselmer"};
                return faker.options().option(cities);
            }
            default -> {
                return null;
            }
        }
    }

}
