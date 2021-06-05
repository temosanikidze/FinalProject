package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.Selenide.$;


public class CategoriesPageObjects {
    protected SelenideElement

            computersAndOffice = $(".ty-menu__item-link",1),
            phoneAndComunications = $(".ty-menu__item-link",2),
            tvPhotoVideo = $(".ty-menu__item-link",3),
            homeAppliance = $(".ty-menu__item-link",4);

}
