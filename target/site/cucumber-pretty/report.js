$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/FeatureFiles/BaseRateCheck.Feature");
formatter.feature({
  "line": 1,
  "name": "AllRisks Application Test",
  "description": "",
  "id": "allrisks-application-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "To validate Base Rate",
  "description": "",
  "id": "allrisks-application-test;to-validate-base-rate",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" and click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click on Homeowner / Dwelling / Condo Quote button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter the \"\u003cagency_code\u003e\" in Agency Page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enter the \"\u003cinsured_name\u003e\" Then \"\u003cinsured_mailing_address\u003e\" And \"\u003cphone_number\u003e\" in insured information",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "enter the \"\u003cprotection_class\u003e\" Then \"\u003cnumber_of_stories\u003e\" Then \"\u003cnumber_loss\u003e\" in location page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "continue to csp page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "enter the \"\u003cpolicy_form\u003e\" Then create quote for the specified carrier \"\u003ccarrier_name\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click on Underwriter Worksheet button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "checks if the base wind rate is \"\u003cbase_wind_rate\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "allrisks-application-test;to-validate-base-rate;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "agency_code",
        "insured_name",
        "insured_mailing_address",
        "phone_number",
        "protection_class",
        "number_of_stories",
        "number_loss",
        "policy_form",
        "carrier_name",
        "base_wind_rate"
      ],
      "line": 15,
      "id": "allrisks-application-test;to-validate-base-rate;;1"
    },
    {
      "cells": [
        "allrisksunderwriter",
        "welcome1",
        "450076",
        "68516Cucumber01",
        "100 Main St, Seadrift, TX 77983, USA",
        "1234567891",
        "1",
        "2",
        "0",
        "DP3",
        "Everest Indemnity Insurance Company",
        "0.55"
      ],
      "line": 16,
      "id": "allrisks-application-test;to-validate-base-rate;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "To validate Base Rate",
  "description": "",
  "id": "allrisks-application-test;to-validate-base-rate;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter \"allrisksunderwriter\" and \"welcome1\" and click on login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click on Homeowner / Dwelling / Condo Quote button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter the \"450076\" in Agency Page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enter the \"68516Cucumber01\" Then \"100 Main St, Seadrift, TX 77983, USA\" And \"1234567891\" in insured information",
  "matchedColumns": [
    3,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "enter the \"1\" Then \"2\" Then \"0\" in location page",
  "matchedColumns": [
    6,
    7,
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "continue to csp page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "enter the \"DP3\" Then create quote for the specified carrier \"Everest Indemnity Insurance Company\"",
  "matchedColumns": [
    9,
    10
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click on Underwriter Worksheet button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "checks if the base wind rate is \"0.55\"",
  "matchedColumns": [
    11
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSD.user_opens_browser()"
});
formatter.result({
  "duration": 38123632640,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "allrisksunderwriter",
      "offset": 12
    },
    {
      "val": "welcome1",
      "offset": 38
    }
  ],
  "location": "LoginSD.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 33188786773,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.click_on_Homeowner_Dwelling_Condo_Quote_button()"
});
formatter.result({
  "duration": 661890133,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "450076",
      "offset": 11
    }
  ],
  "location": "AgencyPageSD.enter_the_in_Agency_Page(String)"
});
