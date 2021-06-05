import StepObjects.MyCartSteps;
import StepObjects.CategoriesPageSteps;
import StepObjects.AddToMyCartSteps;
import StepObjects.SubCategoriesSteps;
import WebDriver.BoniGarcia;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Test;
import io.qameta.allure.Description;

import org.testng.annotations.Listeners;

import static io.qameta.allure.SeverityLevel.BLOCKER;
import static io.qameta.allure.SeverityLevel.CRITICAL;

@Listeners(WebDriver.TestLister.class)
public class AddToMyCartTest extends AddToMyCartSteps {
    @Test
    @Severity(CRITICAL)
    @Description("add item to my cart test")
    public void addToMyCartSteps() throws Exception{

        BoniGarcia.runBrowser("Chrome","alta.ge/");
        AddToMyCartSteps steps = new AddToMyCartTest();
        CategoriesPageSteps navigationSteps = new CategoriesPageSteps();
        SubCategoriesSteps subSteps = new SubCategoriesSteps();
        MyCartSteps cartSteps = new MyCartSteps();

        navigationSteps
                .goToComputersAndOffice();
        subSteps
                .goToProtAndFiltersPage();
        steps
                .PowerProtAndFiltersCollectionClickByName("Gembird A-AC-UKEU-001")
                .addToCartButtonClick();
        cartSteps
                .goToShoppingCartButton()
                .verifyCartText()
                .myCartCountIndexCheck();






    }

}
