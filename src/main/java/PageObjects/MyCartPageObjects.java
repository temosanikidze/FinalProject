package PageObjects;
import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class MyCartPageObjects {
    protected SelenideElement

            cartVerifyText = $(".ty-mainbox-title"),
            myCartButton = $(By.id("sw_dropdown_341")),
            myCartCountIndex = $(".count-tmt"),
            emptyCart = $(".ty-no-items"),
            recalculate = $("ty-float-right ty-cart-content__right-buttons").$(".ty-btn ty-btn__secondary cm-external-click"),
            deleteButton = $(".ty-delete-big__icon.ty-icon-cancel-circle"),
            goToShoppingCartButton = $(".but-popup>a:nth-child(1)"),
            goToCheckOutButton = $(".but-popup").$(".ty-btn ty-btn__primary "),
            unitPrice = $(".ty-sub-price"),
            productName = $(".ty-cart-content__product-title"),
            quantity = $(".ty-center ty-value-changer cm-value-changer"),
            increaseQuantity = $(".cm-increase ty-value-changer__increase"),
            decreaseQuantity = $(".cm-decrease ty-value-changer__decrease"),
            totalPrice = $(".ty-cart-statistic__total-value").$(".ty-price"),
            proceedCheckOut = $(".ty-btn ty-btn__primary "),
            continueShopping = $(".ty-float-left ty-cart-content__left-buttons"),
            productCode = $(".ty-cart-content__sku ty-sku");









}
