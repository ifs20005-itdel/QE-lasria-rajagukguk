Feature: GET All Posts

  Scenario: Get all posts (Positive)
    Given I set the API base URL to "https://jsonplaceholder.typicode.com"
    When I send a GET request to "/posts"
    Then the response code should be 200
    And the response body should contain JSON with at least 1 post

  Scenario: Get all posts with invalid endpoint (Negative)
    Given I set the API base URL to "https://jsonplaceholder.typicode.com"
    When I send a GET request to "/invalid_endpoint"
    Then the response code should be 404
    And the response body should contain JSON with "error" equal to "Not Found"
