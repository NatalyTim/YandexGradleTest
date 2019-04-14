package autotest.pages;

import autotest.util.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    DriverManager driverManager = new DriverManager();

    public BasePage() {
        PageFactory.initElements(driverManager.getDriver(), this);
    }

}
