package contracts

import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType

org.springframework.cloud.contract.spec.Contract.make {
    description "return all customers"

    request {
        url "/api/customers"
        method GET()
    }

    response {
        status 200
        headers {
            header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE)
        }
        body("hello world")

    }
}

