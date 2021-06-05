import StepObjects.CategoriesPageSteps;
import StepObjects.SubCategoriesSteps;
import WebDriver.BoniGarcia;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Test;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Listeners;

import java.security.Security;

import static io.qameta.allure.SeverityLevel.NORMAL;


@Listeners(WebDriver.TestLister.class)
public class SubCategoriesTest extends SubCategoriesSteps {
    @Test
    @Severity(NORMAL)
    @Description("Sub categories test")
        public void subCategoriesTest() throws Exception {
        SubCategoriesSteps steps = new SubCategoriesSteps();
        CategoriesPageSteps steps1 = new CategoriesPageSteps();
        BoniGarcia.runBrowser("Chrome","alta.ge/");
        steps1.
                goToComputersAndOffice();
        steps
                .pcNoteBooksAndAccCheckText()
                .tabletsAndAccCheckText()
                .pcComponentsCheckText()
                .monitorsAndProjectorsCheckText()
                .computerAcciesCheckText()
                .printersScannersCoppiersAndSuppliesCheckText()
                .networkingCheckText()
                .powerProtectionAndFiltersCheckText();


    }
}
