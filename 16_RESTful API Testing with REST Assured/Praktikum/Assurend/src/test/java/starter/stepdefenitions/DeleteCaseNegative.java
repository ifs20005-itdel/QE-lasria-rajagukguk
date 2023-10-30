package starter.stepdefenitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
public class DeleteCaseNegative {


        private Response response;

        @Given("I set the API base URL to {string}")
        public void setBaseUrl(String baseUrl) {
            RestAssured.baseURI = baseUrl;
        }

        @When("I send a DELETE request to {string}")
        public void sendDeleteRequest(String endpoint) {
            response = RestAssured.delete(endpoint);
        }

        @Then("the response code should be {int}")
        public void verifyResponseCode(int expectedStatusCode) {
            response.then().statusCode(expectedStatusCode);
        }

        @Then("the response body should contain JSON with {string} equal to {int}")
        public void verifyResponseBodyField(String field, int expectedValue) {
            response.then().body(field, equalTo(expectedValue));
        }

        @Then("the response body should contain JSON with {string} containing {string}")
        public void verifyResponseBodyContains(String field, String expectedSubstring) {
            response.then().body(field, containsString(expectedSubstring));
        }
    }


