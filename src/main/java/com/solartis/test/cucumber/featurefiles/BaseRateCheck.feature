Feature: AllRisks Application Test

@First
 Scenario Outline: To validate Base Rate
    Given user opens browser "chrome"
    #Then user setups DB connection "<jdbc_driver>" Then "<db_url>" And "<db_username>" And "<db_password>" And "<Query>"
    Then user enter "<username>" and "<password>" and click on login button for "<S.No>"
    Then click on Homeowner / Dwelling / Condo Quote button for "<S.No>"
    Then enter the "<agency_code>"  in Agency Page for "<S.No>"
    Then enter the "<insured_name>" Then "<insured_mailing_address>" And "<phone_number>" in insured information for "<S.No>"
    Then enter the "<protection_class>" Then "<number_of_stories>" Then "<number_loss>" in location page for "<S.No>"
    Then continue to csp page for "<S.No>"
    Then enter the "<policy_form>" Then create quote for the specified carrier "<carrier_name>" for "<S.No>"
    Then click on Underwriter Worksheet button for "<S.No>"
    Then checks if the base wind rate is "<base_wind_rate>" for "<S.No>"
   
 Examples:
 | S.No | Testdata		| username            | password | agency_code| insured_name    | insured_mailing_address                  | phone_number| protection_class  | number_of_stories | number_loss | policy_form | carrier_name                          | base_wind_rate |
 | 1    | Testdata1	|allrisksunderwriter  | welcome1 | 450076     | 68516Cucumber02 | 100 S Main St, Brazoria, TX 77422, USA   | 1234567891  | 3				         | 3                 | 0           | HO3         | Everest Indemnity Insurance Company   | 0.5500         |

@Secound
 Scenario Outline: To validate Base Rate
     Given user opens browser "chrome"
    #Then user setups DB connection "<jdbc_driver>" Then "<db_url>" And "<db_username>" And "<db_password>" And "<Query>"
    Then user enter "<username>" and "<password>" and click on login button for "<S.No>"
    Then click on Homeowner / Dwelling / Condo Quote button for "<S.No>"
    Then enter the "<agency_code>"  in Agency Page for "<S.No>"
    Then enter the "<insured_name>" Then "<insured_mailing_address>" And "<phone_number>" in insured information for "<S.No>"
    Then enter the "<protection_class>" Then "<number_of_stories>" Then "<number_loss>" in location page for "<S.No>"
    Then continue to csp page for "<S.No>"
    Then enter the "<policy_form>" Then create quote for the specified carrier "<carrier_name>" for "<S.No>"
    Then click on Underwriter Worksheet button for "<S.No>"
    Then checks if the base wind rate is "<base_wind_rate>" for "<S.No>"
   
 Examples:
 | S.No | Testdata		| username            | password | agency_code| insured_name    | insured_mailing_address                  | phone_number| protection_class  | number_of_stories | number_loss | policy_form | carrier_name                          | base_wind_rate |
 | 2    | Testdata2	|allrisksunderwriter  | welcome | 450076     | 68516Cucumber02 | 100 S Main St, Brazoria, TX 77422, USA   | 1234567891  | 3				         | 3                 | 0           | HO3         | Everest Indemnity Insurance Company   | 0.5500         |

 @Third
  Scenario Outline: To validate Base Rate
      Given user opens browser "firfox"
    #Then user setups DB connection "<jdbc_driver>" Then "<db_url>" And "<db_username>" And "<db_password>" And "<Query>"
    Then user enter "<username>" and "<password>" and click on login button for "<S.No>"
    Then click on Homeowner / Dwelling / Condo Quote button for "<S.No>"
    Then enter the "<agency_code>"  in Agency Page for "<S.No>"
    Then enter the "<insured_name>" Then "<insured_mailing_address>" And "<phone_number>" in insured information for "<S.No>"
    Then enter the "<protection_class>" Then "<number_of_stories>" Then "<number_loss>" in location page for "<S.No>"
    Then continue to csp page for "<S.No>"
    Then enter the "<policy_form>" Then create quote for the specified carrier "<carrier_name>" for "<S.No>"
    Then click on Underwriter Worksheet button for "<S.No>"
    Then checks if the base wind rate is "<base_wind_rate>" for "<S.No>"
   
 Examples:
 | S.No | Testdata		| username            | password | agency_code| insured_name    | insured_mailing_address                  | phone_number| protection_class  | number_of_stories | number_loss | policy_form | carrier_name                          | base_wind_rate |
 | 3    | Testdata2	|allrisksunderwriter  | welcome1 | 450076     | 68516Cucumber02 | 100 S Main St, Brazoria, TX 77422, USA   | 1234567891  | 3				         | 3                 | 0           | HO3         | Everest Indemnity Insurance Company   | 0.5500         |
