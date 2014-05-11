package no.nith.sivpal12.pg4100.services.impl;

import no.nith.sivpal12.pg4100.domain.enums.PrimeResult;
import no.nith.sivpal12.pg4100.services.PrimeService;

import org.springframework.stereotype.Service;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.math3.primes.Primes;

@Service
public class PrimeServiceImpl implements PrimeService {

    @Override
    public PrimeResult checkPrime(final String numberAsString) {
        if (!NumberUtils.isNumber(numberAsString)) {
            return PrimeResult.INVALID;
        }
        final int number = Integer.parseInt(numberAsString);
        if (number <= 0) {
            return PrimeResult.INVALID;
        }
        
        if (Primes.isPrime(number)) {
            return PrimeResult.IS_A_PRIME;
        }
        return PrimeResult.IS_NOT_A_PRIME;
    }

}
