package ilu2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzbuzzerTester {

	private FizzBuzzer fb;

	@BeforeEach
	void setUp() {
		fb = new FizzBuzzer();
	}

	@Test
	void testUn() {
		assertEquals("1", fb.next());
	}

}
