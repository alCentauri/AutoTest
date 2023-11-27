Feature: User Journey for Natural Gas Inquiry

  Scenario: Complete user journey from changing language to submitting an inquiry form and getting confirmation
    When the user navigates to "https://ignitis.lt/lt"
    Then the Ignitis homepage should be displayed
    When the user changes the language to "en"
    And the user enters "Natural Gas" in the search box
    And the user presses the search button
    Then the search results should be displayed
    When the user finds and selects the "Flexible gas price" article
    And the user clicks on the "Get an offer" button
    And the user fills all the information with random values
  #  And the user submits the form
  #  Then a confirmation message should be displayed