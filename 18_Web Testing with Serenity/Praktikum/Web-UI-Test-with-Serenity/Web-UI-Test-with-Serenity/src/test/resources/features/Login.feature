Feature: Login
  As user
  I want to see homepage
  So that I can buy Product

  Scenario: As user, I have be able to success login
    Given I am on the Login page
    When I input valid username
    And I input valid password
    And I click Login button
    Then I am on the homepage