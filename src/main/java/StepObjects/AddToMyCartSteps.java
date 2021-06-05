package StepObjects;

import PageObjects.PowerProtAndFiltersObjects;
import WebDriver.BoniGarcia;
import com.codeborne.selenide.Condition;

public class AddToMyCartSteps extends PowerProtAndFiltersObjects {
    public AddToMyCartSteps(){

    }

        public AddToMyCartSteps categoryTitleCheckText(){
            categoryTitle.shouldHave(Condition.text("უწყვეტი კვების წყაროები, ფილტრები"));
            return this;
        }
        public AddToMyCartSteps addToCartButtonClick(){
            addToCart.click();
            return this;
        }
        public AddToMyCartSteps PPAFquantityGetValue(){
            PPAFquantity.getValue();
            return this;
        }
        public AddToMyCartSteps PPAFincreaseButtonClick(){
            PPAFincrease.click();
            return this;
        }
        public AddToMyCartSteps PPAFdecreaseButtonClick(){
            PPAFdecrease.click();
            return this;
        }
        public AddToMyCartSteps PowerProtAndFiltersCollectionClickByName(String productName){
            PowerProtAndFiltersCollection.findBy(Condition.text(productName)).click();
            return this;
        }
        public AddToMyCartSteps itemNameText(){
            itemName.getText();
            return this;
        }
        public AddToMyCartSteps addItemToMyCart() throws Exception {
            BoniGarcia.runBrowser("Chrome","alta.ge/");

            CategoriesPageSteps navigationSteps = new CategoriesPageSteps();
            SubCategoriesSteps subSteps = new SubCategoriesSteps();
            MyCartSteps cartSteps = new MyCartSteps();

            navigationSteps
                    .goToComputersAndOffice();
            subSteps
                    .goToProtAndFiltersPage();

                    PowerProtAndFiltersCollectionClickByName("Gembird A-AC-UKEU-001");
                    addToCartButtonClick();
            cartSteps
                    .goToShoppingCartButton()
                    .verifyCartText()
                    .myCartCountIndexCheck();
            return this;
        }

}
