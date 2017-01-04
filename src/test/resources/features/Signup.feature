Feature: Sign up on Gruyere
  In order to create snippets
  As a Gruyere user
  I want to create an account

  Scenario: create an account on Gruyere
    Given I navigate to Gruyere home page
    When I would like to sign up
    And I enter my username test
    And I enter my password test123
    And I submit my credentials
    Then an account is created successfully