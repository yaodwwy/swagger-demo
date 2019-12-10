package cn.adbyte.swagger.api;

import cn.adbyte.swagger.model.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import springfox.petstore.model.Pet;

import java.util.List;
import java.util.Map;

import static com.google.common.collect.Maps.newHashMap;

/**
 * @author Adam
 */
@RestController
public class CategoryController {

    @RequestMapping(value = "/category/map", method = RequestMethod.GET)
    public Map<String, Map<String, Pet>> map() {
        return newHashMap();
    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.POST)
    public ResponseEntity<Void> someOperation(@PathVariable long id, @RequestBody int userId) {
        return ResponseEntity.ok(null);
    }

    @RequestMapping(value = "/category/{id}/{userId}", method = RequestMethod.POST)
    public ResponseEntity<Void> ignoredParam(@PathVariable long id, @PathVariable @ApiIgnore int userId) {
        return ResponseEntity.ok(null);
    }

    @RequestMapping(value = "/category/{id}/map", method = RequestMethod.POST)
    public ResponseEntity<Void> map(@PathVariable String id, @RequestParam Map<String, String> test) {
        return ResponseEntity.ok(null);
    }

    @RequestMapping(value = "/categories", method = RequestMethod.POST)
    public ResponseEntity<List<Category>> map(String[] categories) {
        return ResponseEntity.ok(null);
    }
}
