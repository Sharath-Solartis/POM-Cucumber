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
    },
    {
      "cells": [
        "allrisksunderwriter",
        "welcome1",
        "450076",
        "68516Cucumber02",
        "100 S Main St, Brazoria, TX 77422, USA",
        "1234567891",
        "3",
        "3",
        "0",
        "HO3",
        "Everest Indemnity Insurance Company",
        "0.5500"
      ],
      "line": 17,
      "id": "allrisks-application-test;to-validate-base-rate;;3"
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
  "duration": 16659707733,
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
  "duration": 17718813440,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.click_on_Homeowner_Dwelling_Condo_Quote_button()"
});
formatter.result({
  "duration": 194748160,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cspan class\u003d\"ui-button-text ui-c\"\u003e...\u003c/span\u003e is not clickable at point (623, 257). Other element would receive the click: \u003ciframe...frameborder\u003d\"0\" scrolling\u003d\"no\" style\u003d\"overflow: hidden; width: 654px; height: 482px; border: none;\" data-test-activation-dialog-iframe\u003d\"\" src\u003d\"/plweb/PersonalLines/Allrisks/HomeV1.xhtml/a65f4bf22bdd793dca6963ffe7fa0c62/licensing/start\"\u003e \u003c/iframe\u003e\n  (Session info: chrome\u003d64.0.3282.167)\n  (Driver info: chromedriver\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 100 milliseconds\nBuild info: version: \u00273.1.0\u0027, revision: \u0027b94c902\u0027, time: \u00272017-02-16 12:21:31 -0800\u0027\nSystem info: host: \u0027LT64\u0027, ip: \u0027192.168.4.231\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f), userDataDir\u003dC:\\Users\\VIGNES~1\\AppData\\Local\\Temp\\scoped_dir21416_24876}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d64.0.3282.167, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: b718419d8ede31aa8790bb9fd02d4739\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:274)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy14.click(Unknown Source)\r\n\tat Base.TestBase.ClickElement(TestBase.java:74)\r\n\tat Pages.HomePage.click_hodpbtn(HomePage.java:24)\r\n\tat Pages.HomePage.Home(HomePage.java:29)\r\n\tat StepDefinitions.HomePageSD.click_on_Homeowner_Dwelling_Condo_Quote_button(HomePageSD.java:22)\r\n\tat ✽.Then click on Homeowner / Dwelling / Condo Quote button(src/main/java/FeatureFiles/BaseRateCheck.Feature:6)\r\n",
  "status": "failed"
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
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "68516Cucumber01",
      "offset": 11
    },
    {
      "val": "100 Main St, Seadrift, TX 77983, USA",
      "offset": 34
    },
    {
      "val": "1234567891",
      "offset": 77
    }
  ],
  "location": "InsuredPageSD.enter_the_and_and_in_insured_information(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 11
    },
    {
      "val": "2",
      "offset": 20
    },
    {
      "val": "0",
      "offset": 29
    }
  ],
  "location": "LocationPageSD.enter_the_Then_Then_in_location_page(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UnderwritingSD.continue_to_csp_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "DP3",
      "offset": 11
    },
    {
      "val": "Everest Indemnity Insurance Company",
      "offset": 61
    }
  ],
  "location": "CarrierSelectionSD.enter_the_Then_create_quote_for_the_specified_carrier(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 17,
  "name": "To validate Base Rate",
  "description": "",
  "id": "allrisks-application-test;to-validate-base-rate;;3",
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
  "name": "enter the \"68516Cucumber02\" Then \"100 S Main St, Brazoria, TX 77422, USA\" And \"1234567891\" in insured information",
  "matchedColumns": [
    3,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "enter the \"3\" Then \"3\" Then \"0\" in location page",
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
  "name": "enter the \"HO3\" Then create quote for the specified carrier \"Everest Indemnity Insurance Company\"",
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
  "name": "checks if the base wind rate is \"0.5500\"",
  "matchedColumns": [
    11
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSD.user_opens_browser()"
});
formatter.result({
  "duration": 14066560854,
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
  "duration": 15662378667,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.click_on_Homeowner_Dwelling_Condo_Quote_button()"
});
formatter.result({
  "duration": 89170347,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cspan class\u003d\"ui-button-text ui-c\"\u003e...\u003c/span\u003e is not clickable at point (623, 257). Other element would receive the click: \u003ciframe...frameborder\u003d\"0\" scrolling\u003d\"no\" style\u003d\"overflow: hidden; width: 654px; height: 482px; border: none;\" data-test-activation-dialog-iframe\u003d\"\" src\u003d\"/plweb/PersonalLines/Allrisks/HomeV1.xhtml/a65f4bf22bdd793dca6963ffe7fa0c62/licensing/start\"\u003e \u003c/iframe\u003e\n  (Session info: chrome\u003d64.0.3282.167)\n  (Driver info: chromedriver\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 43 milliseconds\nBuild info: version: \u00273.1.0\u0027, revision: \u0027b94c902\u0027, time: \u00272017-02-16 12:21:31 -0800\u0027\nSystem info: host: \u0027LT64\u0027, ip: \u0027192.168.4.231\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f), userDataDir\u003dC:\\Users\\VIGNES~1\\AppData\\Local\\Temp\\scoped_dir19356_29604}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d64.0.3282.167, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 8a4546e4d3415ebb924e8f476df1f734\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:274)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy14.click(Unknown Source)\r\n\tat Base.TestBase.ClickElement(TestBase.java:74)\r\n\tat Pages.HomePage.click_hodpbtn(HomePage.java:24)\r\n\tat Pages.HomePage.Home(HomePage.java:29)\r\n\tat StepDefinitions.HomePageSD.click_on_Homeowner_Dwelling_Condo_Quote_button(HomePageSD.java:22)\r\n\tat ✽.Then click on Homeowner / Dwelling / Condo Quote button(src/main/java/FeatureFiles/BaseRateCheck.Feature:6)\r\n",
  "status": "failed"
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
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "68516Cucumber02",
      "offset": 11
    },
    {
      "val": "100 S Main St, Brazoria, TX 77422, USA",
      "offset": 34
    },
    {
      "val": "1234567891",
      "offset": 79
    }
  ],
  "location": "InsuredPageSD.enter_the_and_and_in_insured_information(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 11
    },
    {
      "val": "3",
      "offset": 20
    },
    {
      "val": "0",
      "offset": 29
    }
  ],
  "location": "LocationPageSD.enter_the_Then_Then_in_location_page(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UnderwritingSD.continue_to_csp_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "HO3",
      "offset": 11
    },
    {
      "val": "Everest Indemnity Insurance Company",
      "offset": 61
    }
  ],
  "location": "CarrierSelectionSD.enter_the_Then_create_quote_for_the_specified_carrier(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});