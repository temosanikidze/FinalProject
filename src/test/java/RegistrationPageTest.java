
import StepObjects.RegistrationPageSteps;
import WebDriver.BoniGarcia;
import WebDriver.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.junit.Test;
import org.testng.annotations.Listeners;

import static io.qameta.allure.SeverityLevel.CRITICAL;
import static io.qameta.allure.SeverityLevel.NORMAL;

@Listeners(WebDriver.TestLister.class)
public class RegistrationPageTest extends RegistrationPageSteps {
    @Severity(CRITICAL)
    @Test
    @Description("Registration form input texts")
    public void registrationPageTest() throws Exception{
        RegistrationPageSteps steps = new RegistrationPageSteps();
        BoniGarcia.runBrowser("Chrome","alta.ge/");
        steps.registrationButtonClick();
        steps.registraitonButton2Click();
        steps.businessCustomer();
        steps.email(regEmail);
        steps.password1(regPassword);
        steps.password2(regAcceptPassword);
        steps.companyName(regOrganizationName);
        steps.identificationCode(regIdentificationCode);
        steps.invoiceYesOrNo();
        steps.firstName(regName);
        steps.lastName(regLastName);








    }
}
