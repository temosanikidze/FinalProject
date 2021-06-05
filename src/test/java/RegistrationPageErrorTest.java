import StepObjects.RegistrationPageSteps;
import WebDriver.BoniGarcia;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Test;
import org.testng.annotations.Listeners;

import static io.qameta.allure.SeverityLevel.CRITICAL;

@Listeners(WebDriver.TestLister.class)
public class RegistrationPageErrorTest extends RegistrationPageSteps {
    @Test
    @Severity(CRITICAL)
    @Description("error texts when inputs are empty")
    public void registrationPageErrorTest() throws Exception{
        BoniGarcia.runBrowser("Chrome","alta.ge/");
        RegistrationPageSteps steps = new RegistrationPageSteps();
        steps.registrationButtonClick();
        steps.registraitonButton2Click();
        steps.businessCustomer();
        steps.completeRegistrationButtonClick();
        steps.errorTexts();

    }
}
