Feature: GET Post by ID

  Scenario: Get a post by ID (Positive)
    Given I set the API base URL to "https://jsonplaceholder.typicode.com"
    When I send a GET request to "/posts/1"
    Then the response code should be 200
    And the response body should contain JSON with "id" equal to 1

  Scenario: Get a non-existent post by ID (Negative)
    Given I set the API base URL to "https://jsonplaceholder.typicode.com"
    When I send a GET request to "/posts/999"
    Then the response code should be 404
    And the response body should contain JSON with "error" equal to "Not Found"
