Feature: Sign up on Gruyere
  In order create snippets
  As a Gruyere user
  I want to create an account

  Scenario Outline: create an account on Gruyere
    Given I navigate to Gruyere home page
    When I would like to sign up
    And I enter my username <username>
    And I enter my password <password>
    And I submit my credentials
    Then an account is created successfully
    Examples:
      | username | password |
      | test     | test123  |