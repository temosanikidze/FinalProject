package WebDriver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.webdriver.EdgeDriverFactory;
import com.codeborne.selenide.webdriver.FirefoxDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BoniGarcia implements BrowserConfiguration {

    public static void runBrowser(String browser, String url) throws Exception {
        switch (browser) {
            case "Chrome" -> {
                Configuration.browser = "Chrome";
                WebDriverManager.chromedriver().browserVersion(chromeVersion).setup();
                Configuration.startMaximized = true;
                Selenide.open("https://"+ url);
            }
            case "Firefox" -> {
                Configuration.browser = FirefoxDriverFactory.class.getName();
                WebDriverManager.firefoxdriver().browserVersion(firefoxVersion).setup();
                Configuration.startMaximized = true;
                Selenide.open(url);
            }
            case "Edge" -> {
                Configuration.browser = EdgeDriverFactory.class.getName();
                WebDriverManager.edgedriver().browserVersion(edgeVersion).setup();
                Configuration.startMaximized = true;
                Selenide.open(url);
            }
            default -> {
                throw new Exception("error 404");
            }
        }

    }
}

