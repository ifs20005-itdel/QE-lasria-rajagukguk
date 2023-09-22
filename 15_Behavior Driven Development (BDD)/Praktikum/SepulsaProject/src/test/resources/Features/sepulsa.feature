Feature: Testing Sepulsa Website

  Scenario: Login, Choose Product, and Select Payment Method
    Given User is on the Sepulsa homepage
    When User logs in with valid credentials
    Then User selects a product
    And User chooses a payment method
    And User completes the transaction
    Then User should see a confirmation message

