@Login
Feature: Login Feature

  @ignore
  Scenario: Login Success
    Given I have launched the simplilearn application
    When I click on the Login Link
    And I enter the Username
    And I enter the Password
    And I click on the Login button
    Then I should be able to see the home page

  @sanity
  Scenario: Login Failure Scenario using test data as parameter
    Given I have launched the simplilearn application
    When I click on the Login Link
    And I enter the Username "abc@xyz.com"
    And I enter the Password "Abc@12345"
    And I click on the Login button
    Then I should be able to see the error message "The email address or password you have entered is incorrect"

  @sanity @regression
  Scenario Outline: Login Failure Scenario using test data as Examples
    Given I have launched the simplilearn application
    When I click on the Login Link
    And I enter the Username "<UserName>"
    And I enter the Password "<Password>"
    And I click on the Login button
    Then I should be able to see the error message "<Error>"

    Examples: 
      | UserName    | Password  | Error                                                     |
      | abc@xyz.com | Abc@1234  | The email address or password you have entered is invalid |
      | pqr@xyz.com | Acvb@1234 | The email address or password you have entered is invalid |
