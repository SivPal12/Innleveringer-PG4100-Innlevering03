package no.nith.sivpal12.pg4100.services.impl;

import static org.junit.Assert.assertEquals;
import no.nith.sivpal12.pg4100.domain.enums.PrimeResult;

import org.junit.Test;

public class PrimeServiceImplTest {

    private final PrimeServiceImpl primeServiceImpl = new PrimeServiceImpl();

    @Test
    public void checkPrime_NotANumberNumberInput_ResultInvalid() throws Exception {
        PrimeResult primeResult = primeServiceImpl.checkPrime("This is not a number");
        assertEquals(PrimeResult.INVALID, primeResult);
    }

    @Test
    public void checkPrime_NegativeNumber_ResultInvalid() throws Exception {
        PrimeResult primeResult = primeServiceImpl.checkPrime("-1");
        assertEquals(PrimeResult.INVALID, primeResult);
    }

    @Test
    public void checkPrime_Zero_ResultInvalid() throws Exception {
        PrimeResult primeResult = primeServiceImpl.checkPrime("0");
        assertEquals(PrimeResult.INVALID, primeResult);
    }

    @Test
    public void checkPrime_NotAPrime_ResultNotAPrime() throws Exception {
        PrimeResult primeResult = primeServiceImpl.checkPrime("10");
        assertEquals(PrimeResult.IS_NOT_A_PRIME, primeResult);
    }

    @Test
    public void checkPrime_APrime_ResultAPrime() throws Exception {
        PrimeResult primeResult = primeServiceImpl.checkPrime("7");
        assertEquals(PrimeResult.IS_A_PRIME, primeResult);
    }

}
