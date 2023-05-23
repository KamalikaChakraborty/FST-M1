@activity5
Feature: Data driven test with Example

  Scenario Outline: Testing with Data from Scenario
    Given User is on the Login page
    When User enter "<Usernames>" and "<Passwords>"
    Then verify page title and confirmation message
    And Close browser after test

    Examples:
      | Usernames | Passwords |
      | admin     | password  |
      | adminUser | Password  |