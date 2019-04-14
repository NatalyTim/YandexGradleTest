import autotest.util.DriverManager;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    DriverManager driverManager = new DriverManager();

    @Before
    public void setApp() {
        driverManager.getDriver();
    }

    @After
    public void after() {
        driverManager.getDriver().quit();
    }

}
