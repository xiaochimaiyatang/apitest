package groovy.com.github.fourCourse

import spock.lang.Specification
import static io.restassured.RestAssured.given

class ThirdDemo extends Specification{
    def "should call get user by name and age api successfully"() {
        given:"no given"
        when:"call mock api api"
        given().baseUri("http://localhost:9090")
                .queryParam("name","sanguo")
                .queryParam("price",18).log().all()
                .when()
                .get("api/getBookByPathPatter/test")
                .then().log().all()
                .assertThat().statusCode(200)
        then:"no then"
    }
}
