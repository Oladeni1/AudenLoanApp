package StepDefinitions;

import Pages.HomePage;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class BanValStepDef {

    private HomePage homePage;
    private Scenario scenario;
    private WebDriver driver;

    public BanValStepDef(HomePage homePage) {
        this.homePage = homePage;
    }

    @Before
    @Given("^I am on on the website$")
    public void i_am_on_on_the_website(){
        homePage.launchBrowser();

    }

    @When("^User enters valid SortCode \"([^\"]*)\"$")
    public void user_enters_valid_SortCode(String sortCode){
       homePage.setSortCodeField(sortCode);
    }

    @When("^User clicks the search button$")
    public void user_clicks_the_search_button(){
        homePage.clickSearchButton();
    }

    @Then("^Expected results \"([^\"]*)\"$")
    public void expected_results(String expectedResults){
        homePage.getExpectedResultsText(expectedResults);
        //expectedResults
    }

    @Then("^User sees the clear search button$")
    public void user_sees_the_clear_search_button(){
        homePage.getClearSearchButtonText();
    }

    @Then("^User sees the bank name and address \"([^\"]*)\"$")
    public void user_sees_the_bank_name_and_address(String bankNameAndAddress){
        homePage.getBankNameAndAddressText(bankNameAndAddress);
        //bankNameAndAddress
    }

    @Then("^I close browser$")
    public void i_close_browser(){
           homePage.tearDown();
    }

}


