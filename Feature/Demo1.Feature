Feature: Testing demo webshop login Feature

  Scenario: User enters Username and Password
    Given the login page is opened
    When user enters aravind.guggilla57@gmail.com as username
    And user enters aravind as password
    Then user will click on login button
    Then demo webshop home page appears