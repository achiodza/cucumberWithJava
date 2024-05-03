package apibase;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.json.Json;

public class apibase {
    public static void main(String[] args) {
        RestAssured restAssured = new RestAssured();
        restAssured.baseURI = "https://api.coindesk.com/v1/bpi/currentprice.json";

        Response strings = restAssured.get();
        strings.prettyPrint();
        JsonPath jsonPath = new JsonPath(strings.asInputStream());
        //Print what needed
        System.out.println(jsonPath.getString("bpi.GBP.rate"));


    }
}
