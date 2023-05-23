@activity4
Feature: Data driven test without Example

  Scenario: Testing with Data from Scenario
    Given User is on login page
    When User enters "admin" and "password"
    Then check page title and confirmation message
    And Close browser