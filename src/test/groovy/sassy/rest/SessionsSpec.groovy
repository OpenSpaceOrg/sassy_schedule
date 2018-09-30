package sassy.rest

import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner
import sassy.app.App
import spock.lang.Specification

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT, classes =  App.class )
class SessionsSpec  extends Specification {
    @Autowired
    TestRestTemplate restTemplate

    def "get static return for /v1/konopas"() {
        setup:

        when:
            def response = restTemplate.getForEntity('/conference/be/session/1', String)
        then:
            response.status == 200
    }
}
