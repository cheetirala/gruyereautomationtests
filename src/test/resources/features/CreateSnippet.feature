Feature: Create Snippet
  In order to snippets
  As a Gruyere user
  I want to create a snippet

  Scenario: create a snippet on Gruyere
    Given I navigate to Gruyere home page
    When I logged into Gruyere with my login credentials
    And I would like to create a new snippet
    And I enter snippet details
    And submit the snippet
    Then a new snippet should be created