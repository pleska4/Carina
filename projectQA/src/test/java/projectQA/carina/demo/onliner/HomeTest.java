package projectQA.carina.demo.onliner;

import com.ctc.wstx.shaded.msv_core.driver.textui.Debug;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import projectQA.carina.demo.mobile.gui.pages.common.LoginPageBase;
import projectQA.carina.demo.mobile.gui.pages.ios.LoginPage;
import projectQA.carina.demo.myweb.pages.MyHomePage;
import projectQA.carina.demo.myweb.pages.MyLoginPage;


public class HomeTest extends AbstractTest {

    @FindBy(xpath = "//div[@class = header-style__enter']//a")
    public ExtendedWebElement enterBtn;

    @Test
    public void openHomePage() {
        MyHomePage homePage = new MyHomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
    }

    @Test
    public MyLoginPage testEnterButton() {
        enterBtn.click();
        return new MyLoginPage(getDriver()) {
        };
    }
}
