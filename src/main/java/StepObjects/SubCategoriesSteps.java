package StepObjects;

import PageObjects.SubCategoriesPageObjects;
import com.codeborne.selenide.Condition;

public class SubCategoriesSteps extends SubCategoriesPageObjects {
    public SubCategoriesSteps(){

    }

        public SubCategoriesSteps pcNoteBooksAndAccCheckText(){
           pcNoteBooksAndAcc.shouldHave(Condition.text("პერსონალური კომპიუტერები, ნოუთბუქები და აქსესუარები"));
            return this;
        }

        public SubCategoriesSteps tabletsAndAccCheckText(){
            tabletsAndAcc.shouldHave(Condition.text("ტაბლეტები და აქსესუარები "));
            return this;
        }

        public SubCategoriesSteps pcComponentsCheckText(){
            pcComponents.shouldHave(Condition.text("PC კომპონენტები"));
            return this;
        }

        public SubCategoriesSteps monitorsAndProjectorsCheckText(){
            monitorsAndProjectors.shouldHave(Condition.text("მონიტორები და პროექტორები"));
            return this;
        }

        public SubCategoriesSteps computerAcciesCheckText(){
            computerAccies.shouldHave(Condition.text("კომპიუტერის აქსესუარები"));
            return this;
        }

        public SubCategoriesSteps printersScannersCoppiersAndSuppliesCheckText() {
            printersScannersCoppiersAndSupplies.shouldHave(Condition.text("პრინტერები, სკანერები, კოპიერები და სახარჯი მასალები"));
            return this;
        }

        public SubCategoriesSteps networkingCheckText(){
            networking.shouldHave(Condition.text("ქსელური მოწყობილობები"));
            return this;
        }

        public SubCategoriesSteps powerProtectionAndFiltersCheckText(){
            powerProtectionAndFilters.shouldHave(Condition.text("უწყვეტი კვების წყაროები, ფილტრები"));
            return this;
        }
        public SubCategoriesSteps goToProtAndFiltersPage(){
            powerProtectionAndFilters.click();
            return this;
        }
}
