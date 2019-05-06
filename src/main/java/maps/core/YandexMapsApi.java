package maps.core;



import beans.YandexMaps;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.HttpStatus;

import java.util.HashMap;

import static maps.utils.MapsConstants.*;
import static org.hamcrest.Matchers.lessThan;

public class YandexMapsApi {

    private YandexMapsApi() {

    }

    private HashMap<String, String> params = new HashMap<String, String>();

    public static class ApiBuilder {
        YandexMapsApi yandexMapsApi;

        private ApiBuilder(YandexMapsApi api) {
            yandexMapsApi = api;
        }

        public ApiBuilder geo(String text) {
            yandexMapsApi.params.put(YANDEX_MAPS_GEO_PARAM, text);
            return this;
        }

        public ApiBuilder format(String format) {
            yandexMapsApi.params.put(YANDEX_MAPS_FORMAT_PARAM, format);
            return this;
        }

        public ApiBuilder apiKey(String key){
            yandexMapsApi.params.put(YANDEX_MAPS_API_KEY_PARAM, key);
            return this;
        }

        public Response callApi() {
            return RestAssured.given()
                    .contentType(ContentType.JSON)
                    .params(yandexMapsApi.params)
                    .log().all()
                    .get(YANDEX_MAPS_API_URI)
                    .prettyPeek();
        }
    }

    public static ApiBuilder with() {
        YandexMapsApi api = new YandexMapsApi();
        return new ApiBuilder(api);
    }

    public static YandexMaps getMapsAnswer(Response response) {
        return new Gson().fromJson(response.asString().trim(),
                new TypeToken<YandexMaps>(){}.getType());
    }

    /**
     * Gets formatted yandex maps api answer
     * <p>
     * NEEDS: YandexMaps obj and String command
     * <p>
     * @param maps obj to parse
     * @param cmd string command(request, generalInfo, address, point)
     */
    public static String getFormattedAnswer(YandexMaps maps, String cmd) {
        String formattedAnswer = null;
        switch (cmd) {
            case ("request"):
                formattedAnswer = maps.getResponse().getGeoObjectCollection().getMetaDataProperty()
                        .getGeocoderResponseMetaData().toString();
                break;
            case ("generalInfo"):
                formattedAnswer = maps.getResponse().getGeoObjectCollection().getFeatureMember()
                        .get(0).getGeoObject().getMetaDataProperty().getGeocoderMetaData().toString();

                break;
            case ("address"):
                formattedAnswer = maps.getResponse().getGeoObjectCollection().getFeatureMember()
                        .get(0).getGeoObject().getMetaDataProperty().getGeocoderMetaData().getAddress().toString();
                break;
            case ("point"):
                formattedAnswer = maps.getResponse().getGeoObjectCollection().getFeatureMember().get(0).getGeoObject()
                        .getPoint().getPos();
                break;
        }
        return formattedAnswer;
    }

    public static ResponseSpecification successResponse() {
        return new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectStatusCode(HttpStatus.SC_OK)
                .expectResponseTime(lessThan(20000L))
                .expectHeader("Yandex-DataVendors", "yandex")
                .build();
    }

    public static RequestSpecification baseReqConf() {
        return new RequestSpecBuilder()
                .setAccept(ContentType.XML)
                .addQueryParam(YANDEX_MAPS_API_KEY_PARAM, MY_YANDEX_MAPS_API_KEY_VALUE)
                .addQueryParam(YANDEX_MAPS_FORMAT_PARAM, "json")
                .setBaseUri(YANDEX_MAPS_API_URI)
                .build();
    }
}
