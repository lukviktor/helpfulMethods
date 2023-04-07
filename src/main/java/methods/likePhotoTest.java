package methods;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class likePhotoTest {

        @Test
        public void likeTheFirstPhoto() {
            String oauthToken = "введи_сюда_свой_токен";

            // получение списка фотографий и сохранение _id первой фотографии
            String photoId = given()
                    .auth().oauth2(oauthToken) // аутентификация при выполнении запроса
                    .get("/api/cards") // отправка GET-запроса
                    .then().extract().body().path("data[0]._id"); // получение ID фотографии из массива данных

            // лайк первой фотографии
            given()
                    .auth().oauth2(oauthToken) // аутентификация при выполнении запроса
                    .put("/api/cards/{photoId}/likes", photoId) // отправка PUT-запроса
                    .then().assertThat().statusCode(200); // проверка, что сервер вернул код 200

            // снять лайк с первой фотографии
            given()
                    .auth().oauth2(oauthToken) // аутентификация при выполнении запроса
                    .delete("/api/cards/{photoId}/likes", photoId) // отправка DELETE-запроса
                    .then().assertThat().statusCode(200); // проверка, что сервер вернул код 200
        }
    }