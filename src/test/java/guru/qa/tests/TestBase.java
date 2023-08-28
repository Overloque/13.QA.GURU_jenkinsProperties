package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;

import guru.qa.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static org.asynchttpclient.util.HttpConstants.Methods.OPTIONS;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "2560x1440";
        Configuration.pageLoadStrategy = "eager";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void afterEach() {
        Attach.screenShotAs("Last Screenshot");
        Attach.pageSource();
        Attach.browserConsoleLog();
        Attach.addVideo();

        closeWebDriver();
    }
}
