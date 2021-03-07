package Pages;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;



public class HomePage {

    //FindElement global declaration:
    By SortCodeField = By.xpath("//input[@id='sort-code']");
    By SearchButton = By.xpath("//button[contains(text(),'Search')]");
    By ClearSearchButton = By.xpath("//a[contains(text(),'Clear search')]");
    By ExpectedResults = By.xpath("//h2[contains(text(),'Payments made to this account will be successful.')]");
    By BankNameAddress = By.xpath("//dt[contains(text(),'Bank name and address')]");


    WebDriver driver = null;

    //FindElement function:
    protected WebElement element(By by){

        return driver.findElement(by);
    }

    //Wait function:
    public static void wait(int ms){
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    @BeforeMethod
    public void launchBrowser() {
        //Note: Chrome browser is in the project root path
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40L, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(2000L, TimeUnit.SECONDS);
        driver.get("https://bank-validation:bank-validation@bank-validation.herokuapp.com/fraud/find-an-account");
    }
    public void setSortCodeField(String sortCode){
        wait(1000);
        element(SortCodeField).sendKeys(sortCode);
    }
    public void clickSearchButton() {
        wait(1000);
        element(SearchButton).click();
    }
    public void getClearSearchButtonText(){
        wait(1000);
         element(ClearSearchButton).isDisplayed();

    }
    public void getExpectedResultsText(String expectedResults){
        wait(1000);
        element(ExpectedResults).isDisplayed();

    }
    public void getBankNameAndAddressText(String bankNameAndAddress){
        wait(1000);
        element(BankNameAddress).isDisplayed();

    }
    public void tearDown(){
        driver.quit();
    }
}
