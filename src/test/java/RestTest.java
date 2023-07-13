import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RestTest {

    @Test
    public void testLoginFormWithInvalidData(){

        PageObject object = new PageObject();
        given().headers(object.getHeaders()).formParams(object.getFormParams())
                .when().post(object.endPoint)
                .then().log().body()
                .assertThat().statusCode(200)
                .body("code",equalTo(1002))
                .body("message",equalTo("ERROR"));
    }
}
