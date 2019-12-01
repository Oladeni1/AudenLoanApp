package StepDefinitions;

import Pages.HomePage;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.awt.*;


public class AudenStepDef {

private HomePage homePage;
private Scenario scenario;
private WebDriver driver;

public AudenStepDef(HomePage homePage) {

    this.homePage = homePage;
}
    @Before
    public void before (Scenario scenario){

        this.scenario = scenario;
    }
    @Given("^I am on Auden website$")
    public void i_am_on_Auden_website() throws Throwable {

        homePage.launchBrowser();

    }

    @Then("^I should see home link$")
    public void i_should_see_home_link() throws Throwable {

        homePage.verifyHomePage();
    }

    @And("I scroll the slider bar to home and end")
    public void iScrollTheSliderBarToHomeAndEnd() {

         homePage.scrollSliderBarMin();
         homePage.scrollSliderBarMax();
    }

    @Then("^I should see the corresponding amount on the page$")
    public void i_should_see_the_corresponding_amount_on_the_page() throws Throwable {

         homePage.verifyLoanAmountMin();
         homePage.verifyLoanAmountMax();

    }

    @When("I scroll the slider bar to the last monthly instalment")
    public void iScrollTheSliderBarToTheLastMonthlyInstalment() {

        homePage.selectInstalment();
    }

    @Then("I should see the corresponding instalment period")
    public void iShouldSeeTheCorrespondingInstalmentPeriod() {

        homePage.verifyInstalmentValue();
    }
    @And("I click on the repayment calendar button")
    public void iClickOnTheRepaymentCalendarButton() {

        homePage.clickRepaymentCalendarButton();
    }

    @And("I select a repayment weekend date form the calendar")
    public void iSelectARepaymentWeekendDateFormTheCalendar() throws AWTException {

        homePage.selectRepaymentDate();
    }

    @Then("I should see a previous working date as default")
    public void iShouldSeeAPreviousWorkingDateAsDefault() {

         homePage.verifyRepaymentDate();
    }

    @And("I close the browser")
    public void iCloseTheBrowser() {

         homePage.tearDown();
    }

    @And("I scroll to view the calendar")
    public void iScrollToViewTheCalendar() {

           homePage.scrollToView();
    }
}
