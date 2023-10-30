package starter.stepdefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

public class PostCasePositive {



        private Response response;

        @Given("I set the API base URL to {string}")
        public void setBaseUrl(String baseUrl) {
            RestAssured.baseURI = baseUrl;
        }

        @Given("the request body contains JSON:")
        public void setRequestBody(String requestBody) {
            RequestSpecification request = RestAssured.given();
            request.body(requestBody);
        }

        @When("I send a POST request to {string}")
        public void sendPostRequest(String endpoint) {
            response = RestAssured.post(endpoint);
        }

        @Then("the response code should be {int}")
        public void verifyResponseCode(int expectedStatusCode) {
            response.then().statusCode(expectedStatusCode);
        }

        @Then("the response body should contain JSON with {string} equal to {string}")
        public void verifyResponseBodyField(String field, String expectedValue) {
            response.then().body(field, equalTo(expectedValue));
        }
    }


