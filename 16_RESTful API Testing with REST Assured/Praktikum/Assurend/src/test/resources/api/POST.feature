Feature: POST New Post

  Scenario: Create a new post (Positive)
    Given I set the API base URL to "https://jsonplaceholder.typicode.com"
    And the request body contains JSON:
      """
      {
        "title": "New Post Title",
        "body": "New Post Body",
        "userId": 1
      }
      """
    When I send a POST request to "/posts"
    Then the response code should be 201
    And the response body should contain JSON with "title" equal to "New Post Title"

  Scenario: Create a new post with invalid data (Negative)
    Given I set the API base URL to "https://jsonplaceholder.typicode.com"
    And the request body contains JSON:
      """
      {
        "invalid_field": "Invalid Value"
      }
      """
    When I send a POST request to "/posts"
    Then the response code should be 400
    And the response body should contain JSON with "error" equal to "Bad Request"
