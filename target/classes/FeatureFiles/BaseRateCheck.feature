Feature: AllRisks Application Test

 Scenario Outline: To validate Base Rate
    Given user opens browser
    Then user enter "<username>" and "<password>" and click on login button
    Then click on Homeowner / Dwelling / Condo Quote button
    Then enter the "<agency_code>" in Agency Page
    Then enter the "<insured_name>" Then "<insured_mailing_address>" And "<phone_number>" in insured information
    Then enter the "<protection_class>" Then "<number_of_stories>" Then "<number_loss>" in location page
    Then continue to csp page
    Then enter the "<policy_form>" Then create quote for the specified carrier "<carrier_name>"
    Then click on Underwriter Worksheet button
    Then checks if the base wind rate is "<base_wind_rate>"
 Examples:
 | username            | password | agency_code| insured_name    | insured_mailing_address                  | phone_number| protection_class | number_of_stories | number_loss | policy_form | carrier_name                       | base_wind_rate |
 | allrisksunderwriter | welcome1 | 450076     | 68516Cucumber01 | 100 Main St, Seadrift, TX 77983, USA     | 1234567891  | 1				         | 2                 | 0           | DP3         | Everest Indemnity Insurance Company| 0.55           |

 Scenario Outline: To validate Base Rate2
    Given user opens browser
    Then user enter "<username>" and "<password>" and click on login button
    Then click on Homeowner / Dwelling / Condo Quote button
    Then enter the "<agency_code>" in Agency Page
    Then enter the "<insured_name>" Then "<insured_mailing_address>" And "<phone_number>" in insured information
    Then enter the "<protection_class>" Then "<number_of_stories>" Then "<number_loss>" in location page
    Then continue to csp page
    Then enter the "<policy_form>" Then create quote for the specified carrier "<carrier_name>"
    Then click on Underwriter Worksheet button
    Then checks if the base wind rate is "<base_wind_rate>"
 Examples:
 | username            | password | agency_code| insured_name    | insured_mailing_address                  | phone_number| protection_class | number_of_stories | number_loss | policy_form | carrier_name                       | base_wind_rate |
 | allrisksunderwriter | welcome1 | 450076     | 68516Cucumber01 | 100 Main St, Seadrift, TX 77983, USA     | 1234567891  | 1				         | 2                 | 0           | DP3         | Everest Indemnity Insurance Company| 0.55           |
 | allrisksunderwriter | welcome1 | 450076     | 68516Cucumber02 | 100 S Main St, Brazoria, TX 77422, USA   | 1234567891  | 3				         | 3                 | 0           | HO3         | Everest Indemnity Insurance Company| 0.5500         |