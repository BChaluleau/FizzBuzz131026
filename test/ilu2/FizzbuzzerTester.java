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

	private void preshot(int nbTurn) {
		for (int i = 0; i < nbTurn; i++) {
			fb.next();
		}
	}

	@Test
	void testUn() {
		assertEquals("1", fb.next());
	}

	@Test
	void testDeux() {
		preshot(1);
		assertEquals("2", fb.next());
	}

	@Test
	void testTrois() {
		preshot(2);
		assertEquals("Fizz", fb.next());
	}

}
