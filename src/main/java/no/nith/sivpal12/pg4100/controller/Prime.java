package no.nith.sivpal12.pg4100.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Prime {

    @RequestMapping(value="prime", method=RequestMethod.GET)
    public String setupPage() {
        return "test";
    }
    
    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("test");
    }
}
