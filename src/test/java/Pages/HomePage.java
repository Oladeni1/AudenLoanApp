package Pages;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;



public class HomePage {

    //FindElement global declaration:
    By HomeTextLink = By.linkText("Home");
    By LoanSliderBar = By.xpath("//input[@type='range']");
    By MinLoanAmount = By.xpath("//*[@id= 'root']/div/div/div[1]/div/div/section[1]/header/div[2]/span");
    By MaxLoanAmount = By.xpath("//*[@id= 'root']/div/div/div[1]/div/div/section[1]/header/div[2]/span");
    By InstalmentSliderBar = By.id("monthly");
    By MaxInstalmentValue = By.xpath("/html/body/div/div/div/div[1]/div/div/section[2]/div/div/header/div[2]/span");
    By repaymentCalendar = By.xpath("//*[@id= 'root']/div/div/div[1]/div/div/section[2]/div/div/div[2]/header/button/span[3]");
    By repaymentDate = By.xpath(".//*[contains(text(),'31 Dec 2019')]");


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
        //Browser: Is in the project root path
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40L, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(2000L, TimeUnit.SECONDS);
        driver.get("https://www.auden.co.uk/Credit/ShortTermLoan");


    }
    public void verifyHomePage(){
        wait(1000);
        element(HomeTextLink).isDisplayed();
    }
    public void scrollSliderBarMin() {
        wait(5000);
        element(LoanSliderBar).sendKeys(Keys.HOME);

    }

    public void verifyLoanAmountMin()throws Throwable {
        wait(3000);
         element(MinLoanAmount).isDisplayed();

    }
    public void scrollSliderBarMax(){
        wait(2000);
        element(LoanSliderBar).sendKeys(Keys.END);

    }
    public void verifyLoanAmountMax()throws Throwable {
        wait(5000);
        element(MaxLoanAmount).isDisplayed();
    }
    public void selectInstalment(){
        wait(3000);
        element(InstalmentSliderBar).sendKeys(Keys.END);
    }
    public void verifyInstalmentValue(){
        wait(3000);
        element(MaxInstalmentValue).isDisplayed();

    }
    public void clickRepaymentCalendarButton(){
        wait(2000);
        element(repaymentCalendar).click();

    }
    public void scrollToView(){
        wait(5000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");

    }
    public void selectRepaymentDate()throws AWTException{
        wait(2000);
        Robot rb = new Robot();
        rb.keyPress(KeyEvent.VK_TAB);
        rb.keyPress(KeyEvent.VK_ENTER);

    }
    public void verifyRepaymentDate(){
        wait(3000);
        element(repaymentDate).isDisplayed();
    }
    public void tearDown(){
        wait(3000);
        driver.quit();
    }
}
