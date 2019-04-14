import autotest.pages.MainPage;
import autotest.pages.ResultPage;
import org.junit.Test;

public class YandexTest extends BaseTest {

    @Test
    public void testMethod() {
        MainPage mainPage = new MainPage();
        ResultPage resultPage = new ResultPage();

        mainPage.clickInputWindow("iPhone 7 Plus/8 Plus Black");
        mainPage.clickButton();
        resultPage.compareResult(1000);
    }
}
