package autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    @FindBy(xpath = "//input[@id='text']")
    private WebElement inputWindow;

    @FindBy(xpath = "//div[@class='search2__button']/button")
    private WebElement button;


    public void clickInputWindow(String request) {
        inputWindow.click();
        inputWindow.sendKeys(request);
    }

    public void clickButton() {
        button.click();
    }

}
