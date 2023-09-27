package starter.stepdefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
public class GetidCaseNegative {




        private Response response;

        @Given("I set the API base URL to {string}")
        public void setBaseUrl(String baseUrl) {
            RestAssured.baseURI = baseUrl;
        }

        @When("I send a GET request to {string}")
        public void sendGetRequest(String endpoint) {
            response = RestAssured.get(endpoint);
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


