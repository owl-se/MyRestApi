package maps.core;



import beans.YandexMaps;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.List;

import static maps.utils.MapsConstants.*;

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
}
