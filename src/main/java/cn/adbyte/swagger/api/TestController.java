package cn.adbyte.swagger.api;

import cn.adbyte.swagger.model.FooQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Adam
 */
@RestController
public class TestController {

    @GetMapping(value = "/hi")
    public ResponseEntity<String> hi(FooQuery fooQuery) {

        return ResponseEntity.ok(fooQuery.convertTo().toString());
    }
}
