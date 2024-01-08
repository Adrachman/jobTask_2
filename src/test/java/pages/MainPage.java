package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    GazPage gazPage;
    private final SelenideElement searchInput = $x("//iframe[@class=\"dzen-search-arrow-common__frame\"]");
    private final SelenideElement input = $(byXpath("//input[@class='arrow__input mini-suggest__input']"));

    public MainPage(String url) {
        Selenide.open(url);
    }

    public void clickOneSearch(String inputValue)  {
        Selenide.switchTo().frame(searchInput);
        input.setValue(inputValue);
        input.pressEnter();
        Selenide.switchTo().window(0);
        Selenide.sleep(5000);
        Selenide.switchTo().defaultContent();
    }

}
