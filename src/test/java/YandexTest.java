
import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.Test;
import pages.AnkeyIdmPage;
import pages.GagIsRuPage;
import pages.GazPage;
import pages.MainPage;

public class YandexTest extends BaseTest {
    private final static String BASE_URL = "https://yandex.ru/";
    private final static String SEARC_STRING = "Газинформсервис";
    private final static String REFERENCE = "gaz-is.ru";

    @Test
    public void checkInner() {
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.clickOneSearch(SEARC_STRING);
        GazPage gazPage = new GazPage();
        Selenide.switchTo().window(1);
        Assert.assertEquals(REFERENCE, gazPage.popUpWindow(REFERENCE));
        gazPage.selectForSecondPage();
    }

    @Test
    public void sad(){
        GagIsRuPage page = new GagIsRuPage();
        Selenide.switchTo().window(2);
        page.threeList();
        AnkeyIdmPage forPage = new AnkeyIdmPage();
        forPage.testFor();
    }

}
