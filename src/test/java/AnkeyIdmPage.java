import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AnkeyIdmPage {

    private final SelenideElement MATERIALS_BUTTON = $x("//a[@href=\"#materialy\"]//span[@class=\"rl_tabs-toggle-inner nn_tabs-toggle-inner\"]");
    private final SelenideElement UserGuide = $x("//a[@href=\"/component/jdownloads/send/37-ankey-idm/219-ankey-idm-manual-user.html\"][@title=\"Download\"]");


    public void testFor(){
        MATERIALS_BUTTON.click();
        UserGuide.click();
    }
}
