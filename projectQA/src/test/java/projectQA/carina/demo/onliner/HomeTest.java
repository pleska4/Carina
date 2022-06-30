package projectQA.carina.demo.onliner;

import com.ctc.wstx.shaded.msv_core.driver.textui.Debug;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import projectQA.carina.demo.myweb.pages.MyHomePage;


public class HomeTest extends AbstractTest {


    @Test
    public void openHomePage() {
        MyHomePage homePage = new MyHomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
    }

    @Test
    public void testEnterButton() {

    }
}
