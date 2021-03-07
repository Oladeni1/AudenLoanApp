
@RegressionTest
Feature: Bank Sort Code Validation Application
  
  As a user I should be able to book a loan.

  Background:

    Given I am on on the website

  Scenario Outline: Bank Sort code UI Validation

    When User enters valid SortCode "<sortCode>"

    And User clicks the search button

    Then Expected results "<expectedResults>"

    And User sees the clear search button

    And User sees the bank name and address "<bankNameAndAddress>"

    And  I close browser

    Examples:

      |sortCode|expectedResults|bankNameAndAddress|
      |111111  |Payments made to this account will be successful.|Bank name and address|





  