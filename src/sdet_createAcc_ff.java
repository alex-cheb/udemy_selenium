import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sdet_createAcc_ff {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", firefoxDriver);
        WebDriver firefox = new FirefoxDriver();
        firefox.get(accountManagementString);

        firefox.findElement(By.linkText(createAccountText)).click();
        
        
        firefox.findElement(By.name(nameField)).sendKeys(firstName);
        firefox.findElement(By.id(emailId)).sendKeys(emailAddr);
        firefox.findElement(By.id(phoneId)).sendKeys(phoneNo);
        firefox.findElement(By.cssSelector(genderSekector));
        
    }
    private static String firefoxDriver = "C:/Software/geckodriver";
    private static String accountManagementString = "http://sdettraining.com/tguitransactions/AccountManagement.aspx";
    private static String createAccountText = "Create Account";
    private static String nameField = "ct100$MainContent$txtFirstName";
    private static String emailId = "MainContent_txtEmail";
    private static String phoneId = "MainContent_txtHomePhone";
    private static String genderSekector = "";

    private static String firstName = "Blah";
    private static String emailAddr = "someone@somewhere.com";
    private static String phoneNo = "+380999999999";
}
