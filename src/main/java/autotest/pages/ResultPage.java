package autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertTrue;

public class ResultPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'serp-adv__found']")
    private WebElement resultOfRequest;

    public int checkResultOfRequest() {
        String result = resultOfRequest.getText().trim();
        String[] arr;
        String delimeter = " ";
        arr = result.split(delimeter);
        String mln = arr[2];
        if ("млн".equalsIgnoreCase(mln)) {
            mln = "000000";
        } else if ("тыс.".equalsIgnoreCase(mln)) {
            mln = "000";
        }
        String word = arr[1] + mln;
        int quantity = Integer.parseInt(word);
        return quantity;
    }

    public void compareResult(int request) {
        assertTrue("Общее количество результатов меньше 1000.",request<checkResultOfRequest());
        System.out.println("Общее количество результатов больше 1000.");

    }

}
