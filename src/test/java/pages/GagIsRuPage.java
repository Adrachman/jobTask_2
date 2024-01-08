package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GagIsRuPage {

    private final SelenideElement PRODUCT_BUTTON = $x("//div[@class=\"promo__item-btn\"]//a[@id=\"js-btn3\"]");
    private final SelenideElement ANKEY_IDM_BUTTON = $x("//li[@class=\"main-menu__item-level3 \"]//a[@href=\"/produkty/upravlenie-ib/ankey-idm.html\"]");


    public void threeList(){
        PRODUCT_BUTTON.click();
        ANKEY_IDM_BUTTON.click();
    }
}
