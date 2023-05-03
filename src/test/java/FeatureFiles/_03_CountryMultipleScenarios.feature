Feature: Country Multi Scenario

  Background: #before senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to country page

  Scenario: Create a Country
    When create a country
    Then Success message should be displayed

  Scenario: Create a Country 2
    When create a country name as "ay128884" code as "25925"
    Then Success message should be displayed