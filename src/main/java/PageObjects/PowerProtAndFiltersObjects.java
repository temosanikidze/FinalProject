package PageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PowerProtAndFiltersObjects {
    protected SelenideElement
            categoryTitle =$(".ty-mainbox-title > span"),
            addToCart = $(".ty-btn__big"),
            PPAFquantity = $(".ty-value-changer__input"),
            PPAFincrease = $(".cm-increase.ty-value-changer__increase"),
            PPAFdecrease = $(".cm-decrease.ty-value-changer__decrease"),
            itemName = $(".nj_custom_product_title_product_page>span");




    protected ElementsCollection
            PowerProtAndFiltersCollection = $$(".product-title");


}
