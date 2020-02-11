Feature: Login Functionality Testing

  Scenario Outline: Login with multiple sets of test data
    Given User is open the application
    When User click on  to signin link
    When User enters "<username>" and "<password>"
    Then User will click on Login Button
    Then Demo webshop homepage will display




    Examples: 
      | username | password    |
      | aravind.guggilla57@gmail.com  | aravind |
      | aravindkumarguggilla@gmail.com   | Aravind@123 |
