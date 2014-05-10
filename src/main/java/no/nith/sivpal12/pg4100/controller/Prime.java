package no.nith.sivpal12.pg4100.controller;

import org.apache.commons.math3.primes.Primes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Prime {

	@RequestMapping(value="/")
	public ModelAndView index(@RequestParam(required=false) final Integer number) {
		if (number != null && number > 0) {
			if (Primes.isPrime(number)) {
				return new ModelAndView("prime").addObject("result", "It's a prime!");
			} else {
				return new ModelAndView("prime").addObject("result", "It's NOT a prime!");
			}
		}
		return new ModelAndView("prime");
	}
}
