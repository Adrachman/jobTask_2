import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.actions;

public class GazPage {
    private final SelenideElement SEARCH_BUTTON = $x("//span[@class=\"Icon Icon_type_close24White Button2-Icon\"]");
    private final SelenideElement GAZ_IS = $x("//a[@href=\"https://www.gaz-is.ru/\"]/b");

    public String popUpWindow(String reference) {
        actions().moveToElement(SEARCH_BUTTON).click().perform();
        return GAZ_IS.getText();
    }

    public void selectForSecondPage(){
        GAZ_IS.click();
    }
}
