@tag
Feature: Search Functionality
  
  @Amey
  Scenario Outline: Validate Search Functionality
    Given user is on home page
    When user searches "<product>" in search field
    And click Search
    Then user should see "<product>"

    Examples: 
      |product| 
      |iPhone	|
      |MacBook|
