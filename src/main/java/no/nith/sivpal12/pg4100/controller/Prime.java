package no.nith.sivpal12.pg4100.controller;

import javax.annotation.Resource;

import no.nith.sivpal12.pg4100.domain.enums.PrimeResult;
import no.nith.sivpal12.pg4100.services.PrimeService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Prime {
	private static final Logger LOG = LogManager.getLogger();

	private static final String LOG_IS_A_PRIME = "Number {%s} is a prime.";
	private static final String LOG_IS_NOT_A_PRIME = "Number {%s} is not a prime.";
	private static final String LOG_IS_INVALID = "Number {%s} is invalid.";
	private static final String LOG_UNKNOWN_RESULT = "The number {%s} caused an unknown Prime result {%s}";

	@Resource
	public PrimeService primeService;

	@RequestMapping(value="/")
	public ModelAndView index(@RequestParam(required=false) final String number) {
		LOG.info(String.format("Incomming request with number {%s}.", number));
		final PrimeResult primeResult = primeService.checkPrime(number);

		final ModelAndView modelAndView = new ModelAndView("prime");
		switch (primeResult) {
		case IS_A_PRIME:
			LOG.info(String.format(LOG_IS_A_PRIME, number));
			return viewWithMessage(primeResult, modelAndView);
		case IS_NOT_A_PRIME:
			LOG.info(String.format(LOG_IS_NOT_A_PRIME, number));
			return viewWithMessage(primeResult, modelAndView);
		case INVALID:
			LOG.info(String.format(LOG_IS_INVALID, number));
			return viewWithMessage(primeResult, modelAndView);
		default:
			LOG.debug(String.format(LOG_UNKNOWN_RESULT, number, primeResult.toString()));
			return modelAndView;
		}
	}

	private ModelAndView viewWithMessage(final PrimeResult primeResult,
			final ModelAndView modelAndView) {
		return modelAndView.addObject("result", primeResult.getMessage());
	}
}
