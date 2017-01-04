Feature: File Upload
  In order to add files to my account
  As a Gruyere user
  I want to upload files

  Scenario: upload a file on Gruyere
    Given I navigate to Gruyere home page
    When I log into Gruyere with valid credentials test1234 test1234
    And I would like to upload a file
    And I upload a file test.txt
    Then Gruyere: Upload Complete message should be displayed