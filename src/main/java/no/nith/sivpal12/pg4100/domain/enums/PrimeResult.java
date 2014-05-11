package no.nith.sivpal12.pg4100.domain.enums;

public enum PrimeResult {
	IS_A_PRIME("It's a prime!"), IS_NOT_A_PRIME("It's NOT a prime!"), INVALID("Invalid format!");

	private final String message;

	private PrimeResult(final String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
