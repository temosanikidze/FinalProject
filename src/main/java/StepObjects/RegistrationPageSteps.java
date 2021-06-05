package StepObjects;

import PageObjects.RegistrationPageObjects;
import org.junit.Assert;


public class RegistrationPageSteps extends RegistrationPageObjects {
    public RegistrationPageSteps() {

    }

    public RegistrationPageObjects registrationButtonClick(){
        registrationButton.click();
        return this;
    }
    public RegistrationPageObjects registraitonButton2Click(){
        registrationButton2.click();
        return this;
    }
    public RegistrationPageObjects businessCustomer(){
        BusinessCustomer.click();
        return this;
    }
    public RegistrationPageObjects individualCustomer(){
        individualCustomer.click();
        return this;
    }

    public RegistrationPageObjects email(String mail){
        email.setValue(mail);
        return this;
    }
    public RegistrationPageObjects password1(String password){
        password1.setValue(password);
        return this;
    }
    public RegistrationPageObjects password2(String password){
        password2.setValue(password);
        return this;
    }
    public RegistrationPageObjects companyName(String compName){
        companyName.setValue(compName);
        return this;
    }
    public RegistrationPageObjects invoiceYesOrNo(){
        invoiceYesOrNo.click();
        invoiceYesOrNo.isSelected();
        return this;
    }
    public RegistrationPageObjects firstName(String name){
        firstName.setValue(name);
        return this;
    }
    public RegistrationPageObjects lastName(String lstName){
        lastName.setValue(lstName);
        return this;
    }
    public RegistrationPageObjects identificationCode(String code){
        identificationCode.setValue(code);
        return this;
    }
    public RegistrationPageObjects completeRegistrationButtonClick(){
        completeRegistrationButton.click();
        return this;
    }
    public RegistrationPageObjects errorTexts(){
        String emailError = emailErrorText.getText();
        String passError = passErrorText.getText();
        String acceptPassError = acceptPassErrorText.getText();
        Assert.assertEquals("check emailError",emailError,regEmailErrorText);
        Assert.assertEquals("check pass error",passError,regPasswordText);
        Assert.assertEquals("check accept pass error",acceptPassError,regAcceptPasswordText);
        return this;
    }




}
