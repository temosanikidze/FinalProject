import StepObjects.CategoriesPageSteps;
import WebDriver.BoniGarcia;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Test;
import org.testng.annotations.Listeners;

import static io.qameta.allure.SeverityLevel.CRITICAL;
import static io.qameta.allure.SeverityLevel.NORMAL;

@Listeners(WebDriver.TestLister.class)
public class CategoriesTest extends CategoriesPageSteps {

    @Test
    @Severity(NORMAL)
    @Description("Categories test")
    public void categoriesTest() throws Exception {
        CategoriesPageSteps steps = new CategoriesPageSteps();
        BoniGarcia.runBrowser("Chrome","alta.ge/");
        steps
                .goToComputersAndOffice()
                .goToHomeAppliance()
                .goToPhoneAndCommunications()
                .goToTvPhotoVideo();

    }

}
