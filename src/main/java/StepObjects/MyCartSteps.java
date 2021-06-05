package StepObjects;

import PageObjects.MyCartPageObjects;
import com.codeborne.selenide.Condition;
import org.testng.Assert;

public class MyCartSteps extends MyCartPageObjects {
    public MyCartSteps(){

    }

        public MyCartSteps verifyCartText(){
            cartVerifyText.shouldBe(Condition.text("კალათის შიგთავსი"));
            return this;
        }

        public MyCartSteps myCartButton (){
            myCartButton.click();
            myCartButton.shouldHave(Condition.text("კალათა"));
            return this;
        }

        public MyCartSteps myCartCountIndexCheck(){
            //myCartCountIndex.getText().equals("1");
            String cartIndexCheck = myCartCountIndex.getText();
            Assert.assertEquals(cartIndexCheck,"(1)","check index");
            return this;
        }

        public MyCartSteps emptyCartCheck(){
           String emptyCartText = emptyCart.getText() ;
            Assert.assertEquals(emptyCartText,"თქვენი კალათა ცარიელია","check cart Text");
            return this;
        }

        public MyCartSteps recalculate(){
            recalculate.click();
            recalculate.shouldHave(Condition.text("გადათვლა"));
            return this;
        }

        public MyCartSteps deleteButton(){
            deleteButton.click();
            return this;
        }

        public MyCartSteps goToShoppingCartButton(){
            goToShoppingCartButton.click();
            return this;
        }
        public MyCartSteps goToCheckOutButton(){
            goToCheckOutButton.click();
            goToCheckOutButton.shouldHave(Condition.text("შეკვეთის გაფორმება"));
            return this;
        }
        public MyCartSteps unitPrice(){
            unitPrice.getValue();
            return this;
        }
        public MyCartSteps productName(){
            productName.getText();
            return this;
        }
        public MyCartSteps quantity(){
            quantity.getValue();
            return this;
        }

        public MyCartSteps increaseQuantity(){
            increaseQuantity.click();
            return this;
        }
        public  MyCartSteps decreaseQuantity() {
            decreaseQuantity.click();
            return this;
        }
        public MyCartSteps totalPrice(){
            totalPrice.getValue();
            return this;
        }

        public MyCartSteps proceedCheckOut(){
            proceedCheckOut.click();
            return this;
        }
        public MyCartSteps continueShopping(){
            continueShopping.click();
            return this;
        }
        public MyCartSteps productCode(){
            productCode.getValue();
            return this;
        }

}
