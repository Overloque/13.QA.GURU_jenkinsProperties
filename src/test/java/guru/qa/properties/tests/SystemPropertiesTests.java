package guru.qa.properties.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("property")
public class SystemPropertiesTests {
    @Test
    void systemPropertiesTest() {
        System.setProperty("browser", "chrome");
        String browser = System.getProperty("browser");
        System.out.println(browser);
    }
}
