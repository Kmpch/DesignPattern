package us.thanos.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luffych on 2017/6/14.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }

    @RequestMapping("/json")
    public String json() {
        return "";
    }
}
