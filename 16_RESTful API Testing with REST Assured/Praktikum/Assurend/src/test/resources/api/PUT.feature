Feature: PUT Update Post

  Scenario: Update a post by ID (Positive)
    Given I set the API base URL to "https://jsonplaceholder.typicode.com"
    And the request body contains JSON:
      """
      {
        "title": "Updated Post Title",
        "body": "Updated Post Body"
      }
      """
    When I send a PUT request to "/posts/1"
    Then the response code should be 200
    And the response body should contain JSON with "title" equal to "Updated Post Title"

  Scenario: Update a non-existent post by ID (Negative)
    Given I set the API base URL to "https://jsonplaceholder.typicode.com"
    And the request body contains JSON:
      """
      {
        "title": "Updated Post Title",
        "body": "Updated Post Body"
      }
      """
    When I send a PUT request to "/posts/999"
    Then the response code should be 404
    And the response body should contain JSON with "error" equal to "Not Found"
