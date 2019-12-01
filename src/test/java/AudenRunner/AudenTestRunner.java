package AudenRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\olatu\\Documents\\Visual Studio 2017\\Projects\\AudenLoanBookingApp\\src\\test\\java\\Feature\\Auden.feature", //the path of the feature files
        glue={"StepDefinitions"}, //the path of the step definition files
        format= {"pretty","html:test-outout","html:target/cucumber.html.report","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
        monochrome = true, //display the console output in a proper readable format
        strict = true, //it will check if any step is not defined in step definition file
        dryRun = false,//to check the mapping is proper between feature file and step def file
        tags = {"@RegressionTest"}
)


public class AudenTestRunner {



}


