package apisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class apiSteps {
    RestAssured restAssured = new RestAssured();
    @Given("api link to go to")
    public void api_link_to_go_to() {

        restAssured.baseURI = "https://api.coindesk.com/v1/bpi/currentprice.json";

    }

    @Then("Return and price")
    public void return_and_price() {
        Response strings = restAssured.get();
        strings.prettyPrint();
        JsonPath jsonPath = new JsonPath(strings.asInputStream());
        System.out.println(jsonPath.getString("bpi.GBP.rate"));

    }

}
