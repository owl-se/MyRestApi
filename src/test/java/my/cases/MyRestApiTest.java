package my.cases;

import beans.YandexMaps;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import maps.core.YandexMapsApi;
import org.apache.http.HttpStatus;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static maps.utils.MapsConstants.*;
import static org.hamcrest.Matchers.*;

public class MyRestApiTest {

    @Test()
    public void simpleSpellerApiCall() {
/*        RestAssured
                .given()
                .queryParam("apikey", MY_YANDEX_MAPS_API_KEY)
                .param("geocode", "Москва")
                .param("format", "json")
                .accept(ContentType.JSON)
                .auth().basic("any", "any")
                .header("custom header1", "header1.value")
                .contentType(ContentType.JSON)
                .and()
                .body("some body lol")
                .log().everything()
                .get(YANDEX_MAPS_API_URI)
                .prettyPeek();*/

/*        YandexMapsApi.with()
                .apiKey(MY_YANDEX_MAPS_API_KEY)
                .format("json")
                .geo("Москва")
                .callApi();*/

        YandexMaps answer =
                YandexMapsApi.getMapsAnswer(
                        YandexMapsApi.with()
                                .apiKey(MY_YANDEX_MAPS_API_KEY)
                                .format("json")
                                .geo("Москва")
                                .callApi()
                );
        System.out.println("==========================================================================================");
        System.out.println(answer.getResponse().getGeoObjectCollection().getMetaDataProperty().getGeocoderResponseMetaData().getResults());
    }
}
