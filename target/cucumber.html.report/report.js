$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Feature/BankVal.feature");
formatter.feature({
  "line": 3,
  "name": "Bank Sort Code Validation Application",
  "description": "\r\nAs a user I should be able to book a loan.",
  "id": "bank-sort-code-validation-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@RegressionTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Bank Sort code UI Validation",
  "description": "",
  "id": "bank-sort-code-validation-application;bank-sort-code-ui-validation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "User enters valid SortCode \"\u003csortCode\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User clicks the search button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Expected results \"\u003cexpectedResults\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User sees the clear search button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User sees the bank name and address \"\u003cbankNameAndAddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I close browser",
  "keyword": "And "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "bank-sort-code-validation-application;bank-sort-code-ui-validation;",
  "rows": [
    {
      "cells": [
        "sortCode",
        "expectedResults",
        "bankNameAndAddress"
      ],
      "line": 27,
      "id": "bank-sort-code-validation-application;bank-sort-code-ui-validation;;1"
    },
    {
      "cells": [
        "111111",
        "Payments made to this account will be successful.",
        "Bank name and address"
      ],
      "line": 28,
      "id": "bank-sort-code-validation-application;bank-sort-code-ui-validation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I am on on the website",
  "keyword": "Given "
});
formatter.match({
  "location": "BanValStepDef.i_am_on_on_the_website()"
});
formatter.result({
  "duration": 58295835300,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Bank Sort code UI Validation",
  "description": "",
  "id": "bank-sort-code-validation-application;bank-sort-code-ui-validation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User enters valid SortCode \"111111\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User clicks the search button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Expected results \"Payments made to this account will be successful.\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User sees the clear search button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User sees the bank name and address \"Bank name and address\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I close browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "111111",
      "offset": 28
    }
  ],
  "location": "BanValStepDef.user_enters_valid_SortCode(String)"
});
formatter.result({
  "duration": 1169001700,
  "status": "passed"
});
formatter.match({
  "location": "BanValStepDef.user_clicks_the_search_button()"
});
formatter.result({
  "duration": 2260011200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Payments made to this account will be successful.",
      "offset": 18
    }
  ],
  "location": "BanValStepDef.expected_results(String)"
});
formatter.result({
  "duration": 1077473300,
  "status": "passed"
});
formatter.match({
  "location": "BanValStepDef.user_sees_the_clear_search_button()"
});
formatter.result({
  "duration": 1054118700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bank name and address",
      "offset": 37
    }
  ],
  "location": "BanValStepDef.user_sees_the_bank_name_and_address(String)"
});
formatter.result({
  "duration": 1040531100,
  "status": "passed"
});
formatter.match({
  "location": "BanValStepDef.i_close_browser()"
});
formatter.result({
  "duration": 3321018900,
  "status": "passed"
});
});