package no.nith.sivpal12.pg4100.services;

import no.nith.sivpal12.pg4100.domain.enums.PrimeResult;

public interface PrimeService {
    PrimeResult checkPrime(String number);
}
