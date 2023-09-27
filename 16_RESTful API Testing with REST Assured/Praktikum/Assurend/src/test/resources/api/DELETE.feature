Feature: DELETE Data from API

  Scenario: Delete a Post (Positive)
    Given I set the API base URL to "https://jsonplaceholder.typicode.com"
    When I send a DELETE request to "/posts/1"
    Then the response code should be 200
    And the response body should contain JSON with "id" equal to 1
    And the response body should contain JSON with "title" containing "delectus"

  Scenario: Delete a Non-Existent Post (Negative)
    Given I set the API base URL to "https://jsonplaceholder.typicode.com"
    When I send a DELETE request to "/posts/999"
    Then the response code should be 404
    And the response body should contain JSON with "id" equal to 999
    And the response body should contain JSON with "title" containing "not found"
