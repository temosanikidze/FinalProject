package PageObjects;

import DataObjects.RegistrationDataObjects;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RegistrationPageObjects<emailErrorText> implements RegistrationDataObjects{

    protected SelenideElement

         registrationButton = $(".ty-account-info__title-txt"),
         registrationButton2 = $(".ty-login-reglink__a"),
         email = $("#email"),
         BusinessCustomer = $(".valign",1),
         individualCustomer = $(".valign",0),
         password1 = $("#password1"),
         password2 = $("#password2"),
         companyName = $("#elm_46"),
         identificationCode = $("#elm_47"),
         invoiceYesOrNo = $(".elm_48",0),
         firstName = $("#elm_6"),
         lastName = $("#elm_7"),
         emailErrorText = $("#email_error_message > p"),
         passErrorText = $("#password1_error_message > p"),
         acceptPassErrorText = $("#password2_error_message > p"),
         completeRegistrationButton = $(By.name("dispatch[profiles.update]"));







}
