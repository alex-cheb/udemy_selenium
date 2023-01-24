import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class sdet_createAcc_ff {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", firefoxDriver);
        WebDriver firefox = new FirefoxDriver();
        firefox.get(accountManagementString);

        firefox.findElement(By.linkText(createAccountText)).click();
        
        firefox.findElement(By.name(nameField)).sendKeys(firstName);
        firefox.findElement(By.id(emailId)).sendKeys(emailAddr);
        firefox.findElement(By.id(phoneId)).sendKeys(phoneNo);
        firefox.findElement(By.cssSelector(pwdSelector)).sendKeys(pwd);
        firefox.findElement(By.name(verifyPwdName)).sendKeys(pwd);

        firefox.findElement(By.id(maleRadioId)).click();
        new Select(firefox.findElement(By.id(countryCodeId))).selectByVisibleText(country);
        firefox.findElement(By.id(monthlyEmailId)).click();
        firefox.findElement(By.id(submitId)).click();
        
        var confirmation = firefox.findElement(By.id(resultId)).getText();
        System.out.println(confirmation);

        firefox.quit();
    }
    // elements
    private static String firefoxDriver = "C:/Software/geckodriver";
    private static String accountManagementString = "http://sdettraining.com/tguitransactions/AccountManagement.aspx";
    private static String createAccountText = "Create Account";
    private static String nameField = "ct100$MainContent$txtFirstName";
    private static String emailId = "MainContent_txtEmail";
    private static String phoneId = "MainContent_txtHomePhone";
    private static String pwdSelector = "input[id:'MainContent_txtPassword']";
    private static String verifyPwdName = "ct100$MainContent$txtPassword";
    private static String maleRadioId = "MainContent_Male";
    private static String femaleRadioId = "MainContent_Female";
    private static String countryCodeId = "MainContent_menuCountry";
    private static String monthlyEmailId = "MainContent_checkMonthlyEmail";
    private static String submitId = "MainContent_btnSubmit";
    private static String resultId = "MainContent_lbTransactionResult";

    // values
    private static String firstName = "Blah";
    private static String emailAddr = "someone@somewhere.com";
    private static String phoneNo = "+380999999999";
    private static String pwd = "qwerty123";
    private static String country = "United States";
}
