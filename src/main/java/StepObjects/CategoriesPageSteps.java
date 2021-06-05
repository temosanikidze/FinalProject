package StepObjects;

import PageObjects.CategoriesPageObjects;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class CategoriesPageSteps extends CategoriesPageObjects {
    public CategoriesPageSteps(){

    }

    public CategoriesPageSteps goToComputersAndOffice() {
        computersAndOffice.click();
        computersAndOffice.shouldHave(Condition.text("კომპიუტერული და საოფისე ტექნიკა"));
        return this;
    }

    public CategoriesPageSteps goToPhoneAndCommunications(){
        phoneAndComunications.click();
        phoneAndComunications.shouldHave(Condition.text("ტელეფონები და კომუნიკაცია"));
        return this;
    }

    public CategoriesPageSteps goToTvPhotoVideo(){
        tvPhotoVideo.click();
        tvPhotoVideo.shouldHave(Condition.text("ტელევიზორები, ფოტო, ვიდეო, აუდიო, სათამაშო კონსოლები"));
        return this;
    }

    public CategoriesPageSteps goToHomeAppliance(){
        homeAppliance.click();
        homeAppliance.shouldHave(Condition.text("საოჯახო ტექნიკა"));
        return this;
    }

}
