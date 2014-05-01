package no.nith.sivpal12.pg4100.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("system")
public class Ping {

    @RequestMapping(value="ping", method=RequestMethod.GET)
    public @ResponseBody String ping() {
        return "Pong!";
    }

}
