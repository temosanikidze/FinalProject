import StepObjects.AddToMyCartSteps;
import StepObjects.MyCartSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.Listeners;

import static io.qameta.allure.SeverityLevel.CRITICAL;

@Listeners(WebDriver.TestLister.class)
public class DeleteFromCartTest extends MyCartSteps {
    @Test
    @Severity(CRITICAL)
    @Description("delete item from cart")
    public void deleteFromCartTest () throws Exception{
        AddToMyCartSteps addSteps = new AddToMyCartTest();
        MyCartSteps steps = new MyCartSteps();
        addSteps
                .addItemToMyCart();
        steps
                .deleteButton()
                .emptyCartCheck();




    }
}
