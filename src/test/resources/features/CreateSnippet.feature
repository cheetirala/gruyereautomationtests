Feature: Create Snippet
  In order to snippets
  As a Gruyere user
  I want to create a snippet

  Scenario: create a snippet on Gruyere
    Given I navigate to Gruyere home page
    When I log into Gruyere with valid credentials test1234 test1234
    And I would like to create a new snippet
    And I enter snippet details mozarella
    And I submit the snippet details
    Then a new snippet mozarella should be created