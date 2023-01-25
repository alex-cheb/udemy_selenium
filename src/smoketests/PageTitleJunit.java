package smoketests;

import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PageTitleJunit {
    private WebDriver driver;
    

    @Test
    public void PageTitleTest(){
        String anotepadHome = "https://anotepad.com";
        driver.get(anotepadHome);
        var actualTitle = driver.getTitle();
        String expectedTitle = "Online Notepad - Take Notes and Share Notes Online";

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Before
    public void Setup(){
        driver = utilities.DriverFactory.openBrowser("chrome");
    }

    @After
    public void Teardown(){
        driver.quit();
    }
}
