import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class anotepad_login_chrome {
    public static void main(String[] args) {
        // 1. Open the web browser
        System.setProperty("webdriver.chrome.driver", 
        chrome_driver);
        WebDriver chrome = new ChromeDriver();

        // 2. Navigate to the page necessary (https://anotepad.com/create_account)
        chrome.get(register_page);

        // 3. Enter credentials
        var create_account_email = chrome.findElement(By.id(create_email_id));
        var create_account_password = chrome.findElement(By.id(pwd_id));
        create_account_email.sendKeys(email_addr);
        create_account_password.sendKeys(pwd);
        
        // 4. Click login
        var create_account_button = chrome.findElement(By.id(register_button_id));
        create_account_button.click();

        // 5. Get confirmation        
        var logout_button = chrome.findElement(By.xpath(logout_xpath));        
        System.out.println(logout_button.isDisplayed());
        
        // 6. Close the browser
        chrome.quit(); // quits the entire session instead of .close just the browser
    }
    //webdriver path
    private static String chrome_driver = "C:\\Software\\chromedriver_win32\\chromedriver.exe";
    //page
    private static String register_page = "https://anotepad.com/create_account";
    //elements
    private static String create_email_id = "registerEmail";
    private static String register_button_id = "submit";
    private static String pwd_id = "password"; // same id is used for both create and login password field, login can be accessed
    // via .findElements(By.id(pwd_id))[1]
    private static String logout_xpath = "/html/body/div[1]/nav/div[2]/div[2]/ul/li[3]/a";
    //credentials
    private static String email_addr = "someone@somewhere.com";
    private static String pwd = "test";
}
