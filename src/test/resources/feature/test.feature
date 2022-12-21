Feature: Login test Feature


  Scenario: test scenario validations
    Given I am on search page
    When I search for a product with name "iPhone" and price 1000
    When I search another product with name "iPhone" and price 1000
    Then Product with name "iPhones" should displayed
    And Search is completed