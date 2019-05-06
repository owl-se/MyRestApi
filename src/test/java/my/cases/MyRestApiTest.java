package my.cases;

import beans.YandexMaps;
import io.restassured.RestAssured;
import maps.core.YandexMapsApi;
import org.junit.Test;

import java.util.Arrays;

import static maps.utils.MapsConstants.*;
import static my.testData.TestMapsData.*;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.stringContainsInOrder;
import static org.hamcrest.core.AllOf.allOf;
import static org.junit.Assert.assertTrue;

public class MyRestApiTest {

    @Test()
    public void tc1_findByCityName() {

        YandexMaps answer =
                YandexMapsApi.getMapsAnswer(
                        YandexMapsApi.with()
                                .apiKey(MY_YANDEX_MAPS_API_KEY_VALUE)
                                .format("json")
                                .geo(TC1_CITY_TO_FIND)
                                .callApi()
                );
        assertTrue(YandexMapsApi.getFormattedAnswer(answer, "address")
                .contains(TC1_CORRECT_COUNTRY));
        assertTrue(YandexMapsApi.getFormattedAnswer(answer, "generalInfo")
                .contains(TC1_CORRECT_GENERAL_INFO));
        assertTrue(YandexMapsApi.getFormattedAnswer(answer, "point")
                .contains(TC1_CORRECT_GEO_POINT));
    }

    @Test
    public void tc2_findPlaceByGeo() {
        RestAssured
                .given(YandexMapsApi.baseReqConf())
                .param(YANDEX_MAPS_GEO_PARAM, TC2_GEO_TO_FIND)
                .get().prettyPeek()
                .then().specification(YandexMapsApi.successResponse())
                .and()
                .assertThat()
                .body(allOf(
                        stringContainsInOrder(Arrays.asList("province", "Москва")),
                        containsString(TC2_CORRECT_GENERAL_INFO)
                ));
    }
}
